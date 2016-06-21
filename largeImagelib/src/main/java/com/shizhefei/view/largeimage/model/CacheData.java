package com.shizhefei.view.largeimage.model;

import android.graphics.Bitmap;

import java.util.Map;

/**
 * Created by JC on 2016/6/21.
 */
public class CacheData {
    public int scale;
    public Map<Position, Bitmap> images;

    public CacheData(int scale, Map<Position, Bitmap> images) {
        super();
        this.scale = scale;
        this.images = images;
    }
}
