package com.example.liliu.animaltest;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
    }

    /**
     * 鲜丰水果app动画
     * @param v
     */
    public void botton1(View v) {
        CustomProgressDialog dialog = new CustomProgressDialog(this);
        dialog.show();
    }

    public void anim(View v) {
        Animation translateAnimation = AnimationUtils.loadAnimation(this, R.anim.translate_anim);
        // 步骤2:创建 动画对象 并传入设置的动画效果xml文件
        btn1.startAnimation(translateAnimation);
    }

    public void animation(View v) {
        /**
         * 方式一： xml方式
         */
//        Animator animator = AnimatorInflater.loadAnimator(this, R.animator.animator);
//    // 载入XML动画
//        animator.setTarget(btn1);
//    // 设置动画对象
//        animator.start();
//    // 启动动画

        /**
         * 方式二：代码方式
         */
        float curTranslationX = btn1.getTranslationX();
        ObjectAnimator animator = ObjectAnimator.ofFloat(btn1, "translationY", curTranslationX, -50f);
        animator.setDuration(1000);
        animator.start();

    }
}
