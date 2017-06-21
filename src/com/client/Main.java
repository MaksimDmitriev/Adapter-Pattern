package com.client;

import com.api.RecognitionAdapter;
import com.api.RecognitionEngine;
import com.api.RecognitionEngineFactory;

class Main {

    public static void main(String[] args) {
        // Before
        RecognitionEngine recognitionEngine = RecognitionEngineFactory.createRecognitionEngine();
        System.out.println(recognitionEngine);

        // After NewRecognitionEngine, an interface incompatible with RecognitionEngine, was introduced.
        RecognitionAdapter recognitionAdapter = new RecognitionAdapter(RecognitionEngineFactory.createNewRecognitionEngine());
        System.out.println(recognitionAdapter);
    }
}
