package com.example.xyzreader.ui;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.widget.ImageView;

public class ThreeTwoImageView extends AppCompatImageView {

    //code copied and pasted from:
    //https://github.com/udacity/ud862-samples/blob/master/Unsplash/app/src/main/java/com/example/android/unsplash/ui/ThreeTwoImageView.java

        public ThreeTwoImageView(Context context) {
        super(context);
    }

    public ThreeTwoImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ThreeTwoImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width = MeasureSpec.getSize(widthMeasureSpec);
        int desiredHeight = width * 2 / 3;
        super.onMeasure(widthMeasureSpec,
                MeasureSpec.makeMeasureSpec(desiredHeight, MeasureSpec.EXACTLY));
    }
}
