package com.example.gaochao1995724.yikezhong.persenter;

import android.text.TextUtils;

import com.example.gaochao1995724.yikezhong.model.LoginModel;
import com.example.gaochao1995724.yikezhong.model.LoginModelListener;
import com.example.gaochao1995724.yikezhong.model.bean.LoginBean;
import com.example.gaochao1995724.yikezhong.view.LoginActivity;
import com.example.gaochao1995724.yikezhong.view.listener.LoginView;


/**
 * Created by gaochao1995724 on 2018/1/22.
 */

public class LoginPersenter {
    LoginView loginview;
    LoginModel loginModel;
    public LoginPersenter(LoginActivity loginview) {
        this.loginview = loginview;
        loginModel = new LoginModel();
    }
    public void getData(String id,String pad){
        //判断用户名密码不能为空
        if (TextUtils.isEmpty(id)){
            if (loginview!=null){
                loginview.isId("用户名不能为空");
                return;
            }
        }
        if (TextUtils.isEmpty(pad)){
            if (loginview!=null){
                loginview.isPad("密码不能为空");
            }
        }
        loginModel.getData(id, pad, new LoginModelListener() {
            @Override
            public void success(LoginBean loginBean) {
                if (loginview!=null){
                    loginview.success(loginBean.getMsg());
                }
            }
        });

    }

    //防止内存泄露
    public void detach(){
        loginview = null;
    }
}
