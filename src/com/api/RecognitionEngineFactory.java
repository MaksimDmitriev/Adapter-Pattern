package com.api;

public class RecognitionEngineFactory {

    private RecognitionEngineFactory() {
        throw new AssertionError();
    }

    public static RecognitionEngine createRecognitionEngine() {
        return new RecognitionEngineImpl();
    }

    public static NewRecognitionEngine createNewRecognitionEngine() {
        return new NewRecognitionEngineImpl();
    }

}
