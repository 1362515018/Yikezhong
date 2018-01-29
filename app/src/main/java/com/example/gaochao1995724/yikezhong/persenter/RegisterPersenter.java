package com.example.gaochao1995724.yikezhong.persenter;

import android.text.TextUtils;

import com.example.gaochao1995724.yikezhong.model.RegisterModel;
import com.example.gaochao1995724.yikezhong.model.RegisterModelListener;
import com.example.gaochao1995724.yikezhong.model.bean.RegisterBean;
import com.example.gaochao1995724.yikezhong.view.listener.RegisterView;


/**
 * Created by gaochao1995724 on 2018/1/22.
 */

public class RegisterPersenter {
    RegisterView registerView;
    RegisterModel registerModel;
    public RegisterPersenter(RegisterView registerView) {
        this.registerView=registerView;
        registerModel = new RegisterModel();
    }
    public void getData(String id,String pad){
        if (TextUtils.isEmpty(id)){
            if (registerView != null){
                registerView.isId("用户名不能为空");
            }
        }
        if (TextUtils.isEmpty(pad)){
            if (registerView != null){
                registerView.isPad("密码不能为空");
            }
        }
        registerModel.getData(id, pad, new RegisterModelListener() {
            @Override
            public void success(RegisterBean registerBean) {
                if (registerModel!=null){
                    registerView.success(registerBean.getMsg());
                }
            }
        });
    }
    //防止内存泄露
    public void detach(){
        registerView=null;
    }
}
