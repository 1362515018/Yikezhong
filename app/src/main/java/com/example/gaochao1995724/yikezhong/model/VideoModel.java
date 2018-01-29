package com.example.gaochao1995724.yikezhong.model;

import android.util.Log;

import com.example.gaochao1995724.yikezhong.model.bean.VideoBean;
import com.example.gaochao1995724.yikezhong.persenter.VideoPersenter;
import com.example.gaochao1995724.yikezhong.utils.BaseObserver;
import com.example.gaochao1995724.yikezhong.utils.RetrofitManager;

import java.util.HashMap;

/**
 * Created by gaochao1995724 on 2018/1/26.
 */

public class VideoModel {
    public void getData(final VideoPersenter.GetSucces getSucces){
       // String url = "http://is.snssdk.com/neihan/stream/mix/v1/?mpic=1&webp=1&essence=1&content_type=-101&message_cursor=-1&longitude=116.4121485&latitude=39.9365054&am_longitude=116.41828&am_latitude=39.937848&am_city=%E5%8C%97%E4%BA%AC%E5%B8%82&am_loc_time=1483686438786&count=30&min_time=1483929653&screen_width=1080&iid=7164180604&device_id=34822199408&ac=wifi&channel=baidu&aid=7&app_name=joke_essay&version_code=590&version_name=5.9.0&device_platform=android&ssmix=a&device_type=Nexus%2B5&device_brand=google&os_api=25&os_version=7.1&uuid=359250050588035&openudid=12645e537a2f0f25&manifest_version_code=590&resolution=1080*1776&dpi=480&update_version_code=5903";
        HashMap<String,String> map = new HashMap<>();
        RetrofitManager.get("neihan/stream/mix/v1/?mpic=1&webp=1&essence=1&content_type=-101&message_cursor=-1&longitude=116.4121485&latitude=39.9365054&am_longitude=116.41828&am_latitude=39.937848&am_city=%E5%8C%97%E4%BA%AC%E5%B8%82&am_loc_time=1483686438786&count=30&min_time=1483929653&screen_width=1080&iid=7164180604&device_id=34822199408&ac=wifi&channel=baidu&aid=7&app_name=joke_essay&version_code=590&version_name=5.9.0&device_platform=android&ssmix=a&device_type=Nexus%2B5&device_brand=google&os_api=25&os_version=7.1&uuid=359250050588035&openudid=12645e537a2f0f25&manifest_version_code=590&resolution=1080*1776&dpi=480&update_version_code=5903", map, new BaseObserver<VideoBean>() {


            @Override
            public void success(VideoBean bean) {

                if (getSucces != null){
                    getSucces.success(bean);
                    Log.e("bean",bean.toString());
                }
            }

            @Override
            public void failure(int code) {

            }


        });
    }


}
