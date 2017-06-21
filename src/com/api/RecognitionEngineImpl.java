package com.api;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Legacy filter
class RecognitionEngineImpl implements RecognitionEngine {

    private final Set<Mode> modes;

    RecognitionEngineImpl() {
        modes = new HashSet<>();
        modes.add(Mode.BLACK_AND_WHITE);
    }

    @Override
    public int getQuality() {
        return 50;
    }

    @Override
    public Set<Mode> getSupportedModes() {
        return Collections.unmodifiableSet(modes);
    }

    @Override
    public int getParam1() {
        return 1;
    }

    @Override
    public int getParam2() {
        return 2;
    }

    @Override
    public int getParam3() {
        return 3;
    }

    @Override
    public String toString() {
        return "modes=" + modes + " quality=" + getQuality() + " param1=" + getParam1() + " param2=" + getParam2() +
                " param3=" + getParam3();
    }
}
