package com.example.gaochao1995724.yikezhong.view;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.gaochao1995724.yikezhong.R;
import com.example.gaochao1995724.yikezhong.view.fragment.Fragment_home_one;
import com.example.gaochao1995724.yikezhong.view.fragment.Fragment_home_three;
import com.example.gaochao1995724.yikezhong.view.fragment.Fragment_home_two;
import com.facebook.drawee.view.SimpleDraweeView;
import com.hjm.bottomtabbar.BottomTabBar;

public class SubjectActivity extends AppCompatActivity {

    private SimpleDraweeView fresco;
    private BottomTabBar bottmBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);

        initView();
        initData();
    }

    private void initData() {
        Uri uri =  Uri.parse("http://dynamic-image.yesky.com/740x-/uploadImages/2015/163/50/690V3VHW0P77.jpg");
        fresco.setImageURI(uri);

        //底部选择栏
        bottmBar = findViewById(R.id.bottm_bar);
        bottmBar.init(getSupportFragmentManager())
                .setImgSize(50,50)
                .setFontSize(8)
                .setTabPadding(4,6,10)
                .setChangeColor(Color.DKGRAY, Color.RED)
                .addTabItem("推荐", R.drawable.tuijian1, Fragment_home_one.class)
                .addTabItem("段子", R.drawable.gaoxiao1, Fragment_home_two.class)
                .addTabItem("视频", R.drawable.shipin1, Fragment_home_three.class)
                .setTabBarBackgroundColor(Color.WHITE)
                .isShowDivider(false);
    }

    private void initView() {
        fresco = (SimpleDraweeView) findViewById(R.id.fresco);
        bottmBar = (BottomTabBar) findViewById(R.id.bottm_bar);
    }
}
