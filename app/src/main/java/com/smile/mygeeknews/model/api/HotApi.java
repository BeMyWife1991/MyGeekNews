package com.smile.mygeeknews.model.api;

import com.smile.mygeeknews.model.bean.HotListBean;

import retrofit2.Call;
import retrofit2.http.GET;
import rx.Observable;

/**
 * Descripe:
 * Created by Tough
 * Data: 2017/2/9  10:14
 */
public interface HotApi {

    String HOST = "http://news-at.zhihu.com/api/4/";

    //retrofit请求
    @GET("news/hot")
    Call<HotListBean> getHotList();

    //RxJava结构
    @GET("news/hot")
    Observable<HotListBean> getHotForObserveList();
}
