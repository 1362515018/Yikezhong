package com.example.gaochao1995724.yikezhong.persenter;


import com.example.gaochao1995724.yikezhong.model.AdvModel;
import com.example.gaochao1995724.yikezhong.model.bean.DataDataBean;

/**
 * Created by gaochao1995724 on 2018/1/27.
 */

public class AdvPersenter {

    AdvModel advModel;
    public AdvPersenter() {

        advModel = new AdvModel();
    }
    public void getData(final GetSuccess getSuccess){
        advModel.getData(new GetSuccess() {
            @Override
            public void success(DataDataBean dataDataBean) {
                if (getSuccess!=null){
                    getSuccess.success(dataDataBean);
                }
            }
        });
    }

   /* GetSucces getSucces;
    public void SetSuccess(GetSucces getSucces){
        this.getSucces=getSucces;
    }
    public interface GetSucces{
        void Success(VideoBean bean);
    }*/

    GetSuccess getSuccess;
    public void SetSuccess(GetSuccess getSuccess){
        this.getSuccess =getSuccess;
    }
    public interface GetSuccess{
        void success(DataDataBean dataDataBean);
    }
}
