package com.example.gaochao1995724.yikezhong.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.gaochao1995724.yikezhong.R;
import com.example.gaochao1995724.yikezhong.persenter.RegisterPersenter;
import com.example.gaochao1995724.yikezhong.view.listener.RegisterView;

public class RegisterActivity extends AppCompatActivity implements RegisterView {

    private ImageView ivFanhuiReg;
    private EditText ediIdReg;
    private EditText ediPadReg;
    private Button butReg;
    private RegisterPersenter registerPersenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initView();
        registerPersenter = new RegisterPersenter(this);
    }

    private void initView() {
        ivFanhuiReg = (ImageView) findViewById(R.id.iv_fanhui_reg);
        ediIdReg = (EditText) findViewById(R.id.edi_id_reg);
        ediPadReg = (EditText) findViewById(R.id.edi_pad_reg);
        butReg = (Button) findViewById(R.id.but_reg);
        butReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = ediIdReg.getText().toString().trim();
                String pad = ediPadReg.getText().toString().trim();
                registerPersenter.getData(id,pad);
            }
        });
    }

    @Override
    public void success(String s) {
        if (("注册成功").equals(s)){
            Toast.makeText(RegisterActivity.this, s, Toast.LENGTH_SHORT).show();
            startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
            finish();
        }
    }

    @Override
    public void isId(String s) {
        Toast.makeText(RegisterActivity.this, s, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void isPad(String s) {
        Toast.makeText(RegisterActivity.this, s, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void isregType(String s) {
        Toast.makeText(RegisterActivity.this, s, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        registerPersenter.detach();
    }
}
