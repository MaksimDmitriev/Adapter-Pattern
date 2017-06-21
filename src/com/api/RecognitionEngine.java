package com.api;

import java.util.Set;

public interface RecognitionEngine {

    /**
     * from 1 to 100
     **/
    int getQuality();

    Set<Mode> getSupportedModes();

    // Suppose the methods below are consequences of poor design
    int getParam1();

    int getParam2();

    int getParam3();
}
