package com.smile.mygeeknews.ui.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.smile.mygeeknews.R;
import com.smile.mygeeknews.model.bean.HotListBean;
import com.smile.mygeeknews.ui.main.adapter.HotAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rv_content)
    RecyclerView rvContent;

    private List<HotListBean.RecentBean> mList = new ArrayList<HotListBean.RecentBean>();
    private HotAdapter hotAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initView();
        initData();
    }

    private void initData() {
        rvContent.setLayoutManager(new GridLayoutManager(this,2));
        hotAdapter = new HotAdapter(this, mList);


    }

    private void initView() {

    }
}
