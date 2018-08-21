package com.example.liliu.animaltest;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * @author http://blog.csdn.net/finddreams
 * @Description:自定义对话框
 */
public class CustomProgressDialog extends ProgressDialog {

    private Context mContext;
    private ImageView mImageView;
    private TextView mLoadingTv;

    public CustomProgressDialog(Context context) {
        super(context);
        this.mContext = context;
        setCanceledOnTouchOutside(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initData();
    }

    private void initData() {

        Glide.with(mContext).load(R.drawable.xfsg_gif).asGif().into(mImageView);
        mLoadingTv.setText("正在加载中");

    }

    private void initView() {
        setContentView(R.layout.progress_dialog);
        mLoadingTv = (TextView) findViewById(R.id.loadingTv);
        mImageView = (ImageView) findViewById(R.id.loadingIv);
    }

}
