package com.shizhefei.view.largeimage.model;

import android.graphics.Bitmap;
import android.graphics.BitmapRegionDecoder;

import com.shizhefei.view.largeimage.manager.BitmapRegionDecoderFactory;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by JC on 2016/6/21.
 */
public class LoadData {

    public volatile CacheData mCurrentCacheData;
    /**
     * 保存显示区域中的各个缩放的图片切换
     */
    public List<CacheData> mCacheDatas = new LinkedList<>();

    /**
     * 保存预先显示的整张图
     */
    public volatile Bitmap mCacheImageData;
    /**
     * 保存整张图图片缩放级别
     */
    public volatile int mCacheImageScale;
    public volatile int mImageHeight;
    public volatile int mImageWidth;
    public volatile BitmapRegionDecoderFactory mFactory;
    public volatile BitmapRegionDecoder mDecoder;

    public LoadData(BitmapRegionDecoderFactory factory) {
        this.mFactory = factory;
    }
}
