package com.shizhefei.view.largeimage.model;

import android.graphics.Bitmap;
import android.graphics.Rect;

/**
 * Created by JC on 2016/6/21.
 */
public class DrawData {
    public Bitmap bitmap;
    public Rect srcRect;
    public Rect imageRect;

    public DrawData(Bitmap bitmap, Rect srcRect, Rect imageRect) {
        super();
        this.bitmap = bitmap;
        this.srcRect = srcRect;
        this.imageRect = imageRect;
    }
}
