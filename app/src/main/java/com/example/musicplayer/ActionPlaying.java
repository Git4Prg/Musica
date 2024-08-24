package com.example.musicplayer;

import java.io.IOException;

public interface ActionPlaying {

    void playPauseBtnClicked() throws IOException;
    void nextBtnClicked() throws IOException;
    void prevBtnClicked() throws IOException;
}
