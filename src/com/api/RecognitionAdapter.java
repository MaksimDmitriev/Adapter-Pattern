package com.api;

import com.sun.istack.internal.NotNull;

public class RecognitionAdapter {

    private RecognitionEngine recognitionEngine;
    private NewRecognitionEngine newRecognitionEngine;

    public RecognitionAdapter(@NotNull RecognitionEngine recognitionEngine) {
        this.recognitionEngine = recognitionEngine;
    }

    public RecognitionAdapter(@NotNull NewRecognitionEngine newRecognitionEngine) {
        this.newRecognitionEngine = newRecognitionEngine;
    }

    public int getQuality() {
        if (recognitionEngine != null) {
            return recognitionEngine.getQuality();
        } else {
            return newRecognitionEngine.getQuality();
        }
    }

    public int getFilter() {
        return 0;
    }

    public int getParam1() {
        if (recognitionEngine != null) {
            return recognitionEngine.getParam1();
        }
        return -1;
    }

    public int getParam2() {
        if (recognitionEngine != null) {
            return recognitionEngine.getParam2();
        }
        return -1;
    }

    public int getParam3() {
        if (recognitionEngine != null) {
            return recognitionEngine.getParam3();
        }
        return -1;
    }

    @Override
    public String toString() {
        if (recognitionEngine != null) {
            return recognitionEngine.toString();
        } else {
            return newRecognitionEngine.toString();
        }
    }
}
