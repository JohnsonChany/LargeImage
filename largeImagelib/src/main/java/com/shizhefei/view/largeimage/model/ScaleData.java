package com.shizhefei.view.largeimage.model;

/**
 * Created by JC on 2016/6/22.
 */
public class ScaleData {
    public volatile float scale;
    public volatile int fromX;
    public volatile int fromY;

    public ScaleData(float scale, int fromX, int fromY) {
        this.scale = scale;
        this.fromX = fromX;
        this.fromY = fromY;
    }
}
