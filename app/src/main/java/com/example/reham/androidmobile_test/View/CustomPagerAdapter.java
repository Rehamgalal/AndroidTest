package com.example.reham.androidmobile_test.View;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.reham.androidmobile_test.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

class CustomPagerAdapter extends PagerAdapter {
    Context mContext;
    List<String> imagePath;
    @BindView(R.id.imageview)
    ImageView imageView;
    public CustomPagerAdapter(Context context, List<String> imagePath) {
        this.mContext = context;
        this.imagePath = imagePath;

    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.pager_item, null);
        ButterKnife.bind(this,view);
        Picasso.with(mContext).load(getItem(position)).into(imageView);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object view) {
        container.removeView((View) view);
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    public String getItem(int position) {
        switch (position) {
            case 0:
                return imagePath.get(0);
            case 1:
                return imagePath.get(1);
            case 2:
                return imagePath.get(2);
            case 3:
                return imagePath.get(3);
            case 4:
                return imagePath.get(4);
            default:
                return null;
        }
    }
}