package com.example.gaochao1995724.yikezhong.model;



import com.example.gaochao1995724.yikezhong.model.bean.LoginBean;
import com.example.gaochao1995724.yikezhong.utils.BaseObserver;
import com.example.gaochao1995724.yikezhong.utils.RetrofitManager;

import java.util.HashMap;

/**
 * Created by gaochao1995724 on 2018/1/22.
 */

public class LoginModel {
    public void getData(String id, String pad, final LoginModelListener loginModelListener){
        HashMap<String,String> map = new HashMap<>();
        map.put("mobile",id);
        map.put("password",pad);
        RetrofitManager.get("user/login", map, new BaseObserver<LoginBean>() {

            @Override
            public void success(LoginBean loginBean) {
                if (loginModelListener!=null){
                    loginModelListener.success(loginBean);
                }
            }

            @Override
            public void failure(int code) {

            }

        });
    }
}
