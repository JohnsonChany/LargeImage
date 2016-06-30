package com.shizhefei.view.largeimage.model;

import android.graphics.Bitmap;
import android.graphics.Rect;

/**
 * Created by JC on 2016/6/21.
 */
public class DrawData {

    public static final int FILL_LEFT = 1;
    public static final int FILL_RIGHT = 2;
    public int fillType;

    public Bitmap bitmap;
    public Rect srcRect;
    public Rect imageRect;

    public DrawData(Bitmap bitmap, Rect srcRect, Rect imageRect) {
        this.bitmap = bitmap;
        this.srcRect = srcRect;
        this.imageRect = imageRect;
    }

    public DrawData(Bitmap bitmap, Rect srcRect, Rect imageRect, int fillType) {
        this(bitmap, srcRect, imageRect);
        this.fillType = fillType;
    }
}
