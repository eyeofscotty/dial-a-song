package controller;

import sun.audio.AudioStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;

/**
 * Created by Scott on 5/12/2017.
 */
public interface PlayController {

    void playSong(AudioInputStream ais);
    void stopSong();
    Clip getClip();
}
