package com.example.gaochao1995724.yikezhong.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gaochao1995724.yikezhong.R;
import com.example.gaochao1995724.yikezhong.persenter.LoginPersenter;
import com.example.gaochao1995724.yikezhong.view.listener.LoginView;

public class LoginActivity extends AppCompatActivity implements LoginView,View.OnClickListener{

    private ImageView ivFanhui;
    private TextView tvRegister;
    private EditText edtId;
    private EditText edtPad;
    private Button butLog;
    private TextView tvForget;
    private TextView tvTourist;
    private LoginPersenter loginPersenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        loginPersenter = new LoginPersenter(this);

    }
    private void initView() {
        ivFanhui = (ImageView) findViewById(R.id.iv_fanhui);
        tvRegister = (TextView) findViewById(R.id.tv_register);
        edtId = (EditText) findViewById(R.id.edt_id);
        edtPad = (EditText) findViewById(R.id.edt_pad);
        butLog = (Button) findViewById(R.id.but_log);
        tvForget = (TextView) findViewById(R.id.tv_forget);
        tvTourist = (TextView) findViewById(R.id.tv_tourist);

        ivFanhui.setOnClickListener(this);
        tvRegister.setOnClickListener(this);
        butLog.setOnClickListener(this);
        tvForget.setOnClickListener(this);
        tvTourist.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_fanhui:
                finish();
                break;
            case R.id.tv_register:
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
                break;
            case R.id.but_log:
                loginPersenter.getData(edtId.getText().toString().trim(),edtPad.getText().toString().trim());
                break;
            case R.id.tv_forget:
                break;
            case R.id.tv_tourist:
                startActivity(new Intent(LoginActivity.this,SubjectActivity.class));
                break;
        }
    }

    //成功之后回调的参数
    @Override
    public void success(String s) {
        if (("登录成功").equals(s)){
            //  LoginMD5.getMD5(mEdiPaw.getText().toString().trim());
            Toast.makeText(LoginActivity.this, s, Toast.LENGTH_SHORT).show();
            //   Intent intent = new Intent(LoginActivity.this, ListActivity.class);
            //  startActivity(intent);
            finish();
        }else{
            Toast.makeText(LoginActivity.this, s, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void isId(String s) {
        Toast.makeText(LoginActivity.this, s, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void isPad(String s) {
        Toast.makeText(LoginActivity.this, s, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        loginPersenter.detach();
    }
}
