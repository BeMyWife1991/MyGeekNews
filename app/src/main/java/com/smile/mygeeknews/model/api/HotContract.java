package com.smile.mygeeknews.model.api;

import com.smile.mygeeknews.base.BasePresenter;
import com.smile.mygeeknews.base.BaseView;
import com.smile.mygeeknews.model.bean.HotListBean;

/**
 * Descripe:
 * Created by Tough
 * Data: 2017/2/9  17:12
 */
public interface HotContract {

    interface View extends BaseView {
        void showContent(HotListBean hotListBean);
    }

    interface Presenter extends BasePresenter<View>{
        void getHotData();

    }

}
