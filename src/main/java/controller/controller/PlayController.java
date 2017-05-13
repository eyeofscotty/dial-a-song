package controller.controller;

import sun.audio.AudioStream;

/**
 * Created by Scott on 5/12/2017.
 */
public interface PlayController {

    void playSong(AudioStream audioStream);
    void stopSong(AudioStream audioStream);
}
