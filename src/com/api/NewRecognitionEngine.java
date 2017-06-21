package com.api;

import java.util.Set;

public interface NewRecognitionEngine {

    /**
     * from 1 to 100
     **/
    int getQuality();

    Set<Mode> getSupportedModes();

    void startVideoRecognition(VideoRecognitionCallback callback);
}
