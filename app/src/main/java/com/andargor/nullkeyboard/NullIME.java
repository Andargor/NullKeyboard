package com.andargor.nullkeyboard;

import android.inputmethodservice.InputMethodService;
import android.view.View;

public class NullIME extends InputMethodService {
    @Override
    public View onCreateInputView() {
        // Explicitly prevents any virtual keyboard layout from drawing
        return null;
    }

    @Override
    public View onCreateCandidatesView() {
        // Strips out prediction/suggestions bars completely
        return null;
    }
}