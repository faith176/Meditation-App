package com.example.meditationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.TextView;

public class BreatheActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breathe);
    }

    @Override
    protected void onStart() {
        super.onStart();
//        Path path = new Path();
//
        TextView circle1 = (TextView) this.findViewById(R.id.circle);
//        path.arcTo(0f, 0f, 1000f, 1000f, 0f, 359f, true); //with first four parameters you determine four edge of a rectangle by pixel , and fifth parameter is the path'es start point from circle 360 degree and sixth parameter is end point of path in that circle
//        ObjectAnimator animator = ObjectAnimator.ofFloat(circle1 , View.X, View.Y, path); //at first parameter (view) put the target view
//        animator.setRepeatCount(3);
//        animator.setDuration(200);
//        animator.start();


        RotateAnimation rotate = new RotateAnimation(
                0, 360,
//                Animation.RELATIVE_TO_PARENT, 0.5f,
//                Animation.RELATIVE_TO_PARENT, 0.5f
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f
        );
        rotate.setDuration(7200);
        rotate.setRepeatCount(Animation.INFINITE);
        circle1.startAnimation(rotate);
    }

//        RotateAnimation rotateAnimation1 = new RotateAnimation(0, 360,
//                Animation.RELATIVE_TO_SELF, 0.5f,
//                Animation.RELATIVE_TO_SELF, 0.5f);
//        rotateAnimation1.setInterpolator(new LinearInterpolator());
//        rotateAnimation1.setDuration(5200);
//        rotateAnimation1.setRepeatCount(3);
//        circle1.startAnimation(rotateAnimation1);
    }

