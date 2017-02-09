package com.smile.mygeeknews.presenter;

import com.smile.mygeeknews.model.api.HotContract;
import com.smile.mygeeknews.model.api.HotForRxJavaApi;
import com.smile.mygeeknews.model.bean.HotListBean;
import com.smile.mygeeknews.model.http.RetrofitHelper;
import com.smile.mygeeknews.utils.RxUtil;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

/**
 * Descripe:
 * Created by Tough
 * Data: 2017/2/9  17:19
 */
public class HotPresenter implements HotContract.Presenter {


    private HotContract.View mView;

    @Override
    public void getHotData() {

        new RetrofitHelper().getApiService().getHotForObserveList();

        new RetrofitHelper().getApiService().getHotForObserveList()
                .compose(RxUtil.<HotListBean>rxSchedulerHelper())
                .map(new Func1<HotListBean, HotListBean>() {
                    @Override
                    public HotListBean call(HotListBean hotListBean) {
                        return hotListBean;
                    }
                })
                .subscribe(new Action1<HotListBean>() {
                    @Override
                    public void call(HotListBean hotListBean) {
                        mView.showContent(hotListBean);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {

                    }
                });

    }

    @Override
    public void attachView(HotContract.View view) {
        mView = view;
    }

    @Override
    public void detachView() {

    }
}
