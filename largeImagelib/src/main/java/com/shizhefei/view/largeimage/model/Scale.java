package com.shizhefei.view.largeimage.model;

/**
 * Created by JC on 2016/6/22.
 */
public class Scale {
    private volatile float scale;
    private volatile int fromX;
    private volatile int fromY;

    public Scale(float scale, int fromX, int fromY) {
        this.scale = scale;
        this.fromX = fromX;
        this.fromY = fromY;
    }

    public float getScale() {
        return scale;
    }

    public void setScale(float scale) {
        this.scale = scale;
    }

    public int getFromX() {
        return fromX;
    }

    public void setFromX(int fromX) {
        this.fromX = fromX;
    }

    public int getFromY() {
        return fromY;
    }

    public void setFromY(int fromY) {
        this.fromY = fromY;
    }
}
