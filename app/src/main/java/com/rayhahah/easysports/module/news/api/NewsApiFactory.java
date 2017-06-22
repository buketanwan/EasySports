package com.rayhahah.easysports.module.news.api;

import com.rayhahah.easysports.common.C;
import com.rayhahah.easysports.module.news.bean.NewsDetail;
import com.rayhahah.easysports.module.news.bean.NewsIndex;
import com.rayhahah.rbase.net.ApiClient;

import okhttp3.ResponseBody;
import rx.Observable;

/**
 * Created by a on 2017/5/16.
 */

public class NewsApiFactory {

    public static Observable<NewsIndex> getNewsIndex(String column) {
        return ApiClient
                .get(C.BaseURL.TECENT_SERVER)
                .create(NewsService.class)
                .getNewsIndex(column);
    }

    public static Observable<ResponseBody> getNewsItemJson(String column, String articleIds) {
        return ApiClient
                .get(C.BaseURL.TECENT_SERVER)
                .create(NewsService.class)
                .getNewsItem(column, articleIds);
    }

    public static Observable<ResponseBody> getVideoInfo(String vids) {
        return ApiClient
                .get(C.BaseURL.TECENT_VIDEO_SERVER_H5)
                .create(NewsService.class)
                .getVideosInfo(vids);
    }

    public static Observable<NewsDetail> getNewsDetail(String column, String articleId) {
        return ApiClient
                .get(C.BaseURL.TECENT_SERVER)
                .create(NewsService.class)
                .getNewsDetail(column, articleId);
    }
}
