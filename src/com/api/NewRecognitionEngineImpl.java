package com.api;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class NewRecognitionEngineImpl implements NewRecognitionEngine {

    // TODO: it might be a bad idea to have a set a filters in every instance of NewRecognitionEngineImpl
    // unless the API part is responsible for NewRecognitionEngineImpl instances creation. In this project I have
    // RecognitionEngineFactory, and client code cannot createRecognitionEngine NewRecognitionEngineImpl.
    // But anyway, the issue is worth discussing with Dima.
    private final Set<Mode> modes;

    NewRecognitionEngineImpl() {
        modes = new HashSet<>();
        modes.add(Mode.BLACK_AND_WHITE);
        modes.add(Mode.GREYSCALE);
        modes.add(Mode.COLOR);
    }

    @Override
    public int getQuality() {
        return 90;
    }

    @Override
    public Set<Mode> getSupportedModes() {
        return Collections.unmodifiableSet(modes);
    }

    @Override
    public void startVideoRecognition(VideoRecognitionCallback callback) {

    }

    @Override
    public String toString() {
        return "modes=" + modes + " quality=" + getQuality();

    }
}
