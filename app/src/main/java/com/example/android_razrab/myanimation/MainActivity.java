package com.example.android_razrab.myanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=(ImageView)findViewById(R.id.iv);




    }

    void onClick(View view){
        final Animation fallingAnimation = AnimationUtils.loadAnimation(this,
                R.anim.my_translate);
        imageView.startAnimation(fallingAnimation);


    }
}
