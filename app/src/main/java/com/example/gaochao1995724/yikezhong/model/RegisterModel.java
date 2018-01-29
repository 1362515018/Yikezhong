package com.example.gaochao1995724.yikezhong.model;



import com.example.gaochao1995724.yikezhong.model.bean.RegisterBean;
import com.example.gaochao1995724.yikezhong.utils.BaseObserver;
import com.example.gaochao1995724.yikezhong.utils.RetrofitManager;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gaochao1995724 on 2018/1/22.
 */

public class RegisterModel {
    public void getData(String id, String pad, final RegisterModelListener registerModelListener){
        Map<String,String> map = new HashMap<>();
        map.put("mobile",id);
        map.put("password",pad);
        //map.put("regType",regType);
        RetrofitManager.get("quarter/register", map, new BaseObserver<RegisterBean>() {


            @Override
            public void success(RegisterBean registerBean) {
                if (registerModelListener!=null){
                    registerModelListener.success(registerBean);
                }
            }

            @Override
            public void failure(int code) {

            }


        });
    }
}
