package com.example.gaochao1995724.yikezhong.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gaochao1995724.yikezhong.R;
import com.example.gaochao1995724.yikezhong.model.adapter.RecyAdapter;
import com.example.gaochao1995724.yikezhong.persenter.AdvPersenter;
import com.example.gaochao1995724.yikezhong.persenter.VideoPersenter;

/**
 * Created by gaochao1995724 on 2018/1/29.
 */

public class Fragment_home_one extends Fragment {

    private View view;
    private RecyclerView recyclerView;
    private AdvPersenter advPersenter;
    private VideoPersenter videoPersenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_one, null);
       // initView();
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
//        advPersenter = new AdvPersenter();
//        videoPersenter = new VideoPersenter();
//        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
//        new RecyAdapter(getActivity(), videoPersenter,advPersenter);


    }

//    private void initView() {
//        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
//    }


}
