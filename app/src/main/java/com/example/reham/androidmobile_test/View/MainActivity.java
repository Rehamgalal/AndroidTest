package com.example.reham.androidmobile_test.View;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.reham.androidmobile_test.Data.GeneralInfo;
import com.example.reham.androidmobile_test.Presenter.MainPresenter;
import com.example.reham.androidmobile_test.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainViewInterface {
@BindView(R.id.viewpager)
    ViewPager viewPager;
@BindView(R.id.user_avatar)
    ImageView profiePicture;
@BindView(R.id.user_name)
    TextView user;
@BindView(R.id.description)
    TextView description;
@BindView(R.id.tab)
    TabLayout tabLayout;

List<String> imagePathes;
MainPresenter mainPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        imagePathes=new ArrayList<>();
        setupMVP();
        setupViews();
        getData();
    }

    private void setupMVP() {
        mainPresenter = new MainPresenter(this);
    }

    private void setupViews(){
        tabLayout.setupWithViewPager(viewPager,true);
    }

    private void getData() {
        mainPresenter.getData();
    }


    @Override
    public void showToast(String s) {
        Toast.makeText(this,s, Toast.LENGTH_LONG).show();
    }

    @Override
    public void displayData(GeneralInfo generalInfo) {
        for (int i = 0 ;i<generalInfo.getPostMedias().size();i++){
            imagePathes.add(generalInfo.getPostMedias().get(i).getImagePath());}
        Picasso.with(getBaseContext()).load(generalInfo.getMember().getUserImage()).into(profiePicture);
        user.setText(generalInfo.getMember().getUserName());
        description.setText(generalInfo.getDescription());
        mainPresenter.makeTextViewResizable(description, 3, "view more", true);
        viewPager.setAdapter(new CustomPagerAdapter(getBaseContext(),imagePathes));
    }

    @Override
    public void displayError(String s) {
        showToast(s);
    }
}