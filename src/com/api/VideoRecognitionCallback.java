package com.api;

public interface VideoRecognitionCallback {

    void onRecognized(int top, int left, String text, TextFormattingInfo textFormattingInfo);

    void onRecognitionFailed();
}
