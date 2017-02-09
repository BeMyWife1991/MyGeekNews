package com.smile.mygeeknews.ui.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.smile.mygeeknews.R;
import com.smile.mygeeknews.model.api.HotContract;
import com.smile.mygeeknews.model.bean.HotListBean;
import com.smile.mygeeknews.presenter.HotPresenter;
import com.smile.mygeeknews.ui.main.adapter.HotAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainForMvpActivity extends AppCompatActivity implements HotContract.View {

    private static final String TAG = "MainForMvpActivity";
    @BindView(R.id.rv_content)
    RecyclerView rvContent;

    private List<HotListBean.RecentBean> mList = new ArrayList<HotListBean.RecentBean>();
    private HotAdapter hotAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initData();
    }

    private void initData() {
        HotPresenter hotPresenter = new HotPresenter();
        hotPresenter.attachView(this);

        rvContent.setLayoutManager(new LinearLayoutManager(this));
        hotAdapter = new HotAdapter(this, mList);
        rvContent.setAdapter(hotAdapter);

        hotPresenter.getHotData();

    }

    @Override
    public void showContent(HotListBean hotListBean) {
        Log.e(TAG, "showContent: ");
        mList.clear();
        mList.addAll(hotListBean.getRecent());
        hotAdapter.notifyDataSetChanged();
    }

    @Override
    public void showError(String msg) {

    }

    @Override
    public void useNightMode(boolean isNight) {

    }
}
