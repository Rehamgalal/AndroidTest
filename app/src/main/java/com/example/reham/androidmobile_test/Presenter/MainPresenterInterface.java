package com.example.reham.androidmobile_test.Presenter;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.widget.TextView;

public interface MainPresenterInterface {

        void getData();
        void makeTextViewResizable(final TextView tv,
                                   final int maxLine,
                                   final String expandText,
                                   final boolean viewMore);
        SpannableStringBuilder addClickablePartTextViewResizable(final Spanned strSpanned,
                                                                 final TextView tv,
                                                                 final int maxLine,
                                                                 final String spanableText,
                                                                 final boolean viewMore);
}
