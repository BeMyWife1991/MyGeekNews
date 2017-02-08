package com.smile.mygeeknews.ui.main.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.smile.mygeeknews.R;
import com.smile.mygeeknews.model.bean.HotListBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Descripe:
 * Created by Tough
 * Data: 2017/2/8  17:46
 */
public class HotAdapter extends RecyclerView.Adapter {

    private final Context context;
    private final List<HotListBean.RecentBean> mList;

    public HotAdapter(Context context, List<HotListBean.RecentBean> mList) {
        this.context = context;
        this.mList = mList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.item_hot, parent, false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        
    }

    @Override
    public int getItemCount() {
        return mList != null ? mList.size() : 0;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.iv_item)
        ImageView ivItem;
        @BindView(R.id.tv_daily_item_title)
        TextView tvDailyItemTitle;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
