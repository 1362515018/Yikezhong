package com.example.gaochao1995724.yikezhong.persenter;


import com.example.gaochao1995724.yikezhong.model.VideoModel;
import com.example.gaochao1995724.yikezhong.model.bean.VideoBean;

/**
 * Created by gaochao1995724 on 2018/1/26.
 */

public class VideoPersenter {

    VideoModel videoModel;

    public VideoPersenter() {

        videoModel = new VideoModel();
    }
    public void getData(final GetSucces getSucces){
        videoModel.getData(new GetSucces() {
            @Override
            public void success(VideoBean bean) {
                if (getSucces!=null){
                    getSucces.success(bean);
                }
            }

        });
    }
    GetSucces getSucces;
    public void SetSuccess(GetSucces getSucces){
        this.getSucces=getSucces;
    }
    public interface GetSucces{
        void success(VideoBean bean);
    }


}

