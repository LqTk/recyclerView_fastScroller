package com.org.lqtk.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.org.lqtk.fastscroller.RecyclerFastScroller;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv_demo;
    RecyclerFastScroller fastScroller;
    List<String> strs = new ArrayList<>();
    Context context;
    RcvAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        rcv_demo = findViewById(R.id.rcv_demo);
        fastScroller = findViewById(R.id.fast_scroll);

        initData();
        initView();
        initFastScroll();
    }

    private void initFastScroll() {
        fastScroller.setHidingEnabled(false);
        fastScroller.touchIsDrawable(true);
        fastScroller.setTouchTargetWidth(25);
        fastScroller.setMarginLeft(10);
//        fastScroller.setDrawable(getResources().getDrawable(R.drawable.thumb01),getResources().getDrawable(R.drawable.thumb02));

        fastScroller.attachRecyclerView(rcv_demo);
    }

    private void initView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rcv_demo.setLayoutManager(linearLayoutManager);

        adapter = new RcvAdapter(R.layout.rcv_item,strs);
        rcv_demo.setAdapter(adapter);
    }

    private void initData() {
        for (int i=0;i<500;i++){
            strs.add("测试数据第"+i+"条");
        }
    }
}
