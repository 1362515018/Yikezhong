package com.example.gaochao1995724.yikezhong.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gaochao1995724.yikezhong.R;

public class MainActivity extends AppCompatActivity {

    private ImageView iv;
    private Button weixinLog;
    private Button qqLog;
    private TextView restsLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }

    private void initView() {
        iv = (ImageView) findViewById(R.id.iv_);
        weixinLog = (Button) findViewById(R.id.weixin_log);
        qqLog = (Button) findViewById(R.id.qq_log);
        restsLog = (TextView) findViewById(R.id.rests_log);
        restsLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));

            }
        });
    }

}
