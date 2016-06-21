package com.shizhefei.view.largeimage.manager;

import android.graphics.BitmapRegionDecoder;

import java.io.IOException;

/**
 * Created by JC on 2016/6/21.
 */
public interface BitmapRegionDecoderFactory {
    BitmapRegionDecoder made() throws IOException;
}
