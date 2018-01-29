package com.example.gaochao1995724.yikezhong.model.adapter;

import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.gaochao1995724.yikezhong.persenter.AdvPersenter;
import com.example.gaochao1995724.yikezhong.persenter.VideoPersenter;

/**
 * Created by gaochao1995724 on 2018/1/29.
 */

public class RecyAdapter extends RecyclerView.Adapter{

    int ONE =0;
    int TWO =1;

    FragmentActivity context;
    VideoPersenter videoPersenter;
    AdvPersenter advPersenter;
    public RecyAdapter(FragmentActivity context, VideoPersenter videoPersenter, AdvPersenter advPersenter) {
        this.context = context;
        this.videoPersenter = videoPersenter;
        this.advPersenter = advPersenter;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    class ViewHoldet1 extends RecyclerView.ViewHolder {

        public ViewHoldet1(View itemView) {
            super(itemView);
        }
    }
}
