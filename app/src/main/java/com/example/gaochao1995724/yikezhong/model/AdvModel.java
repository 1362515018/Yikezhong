package com.example.gaochao1995724.yikezhong.model;



import com.example.gaochao1995724.yikezhong.model.bean.DataDataBean;
import com.example.gaochao1995724.yikezhong.persenter.AdvPersenter;
import com.example.gaochao1995724.yikezhong.utils.BaseObserver;
import com.example.gaochao1995724.yikezhong.utils.RetrofitManager;

import java.util.HashMap;

/**
 * Created by gaochao1995724 on 2018/1/27.
 */

public class AdvModel {
    public void getData(final AdvPersenter.GetSuccess getSucces){
        HashMap<String,String> map = new HashMap<>();
        RetrofitManager.getBnner("quarter/getAd", map, new BaseObserver<DataDataBean>() {

            @Override
            public void success(DataDataBean dataDataBean) {
                if (getSucces !=null){
                    getSucces.success(dataDataBean);
                }
            }

            @Override
            public void failure(int code) {

            }
        });
    }

}
