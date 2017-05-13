package controller.controller;

import data.Song;
import sun.audio.AudioStream;

import java.io.IOException;

/**
 * Created by Scott on 5/12/2017.
 */
public interface LocateAudioStream {

    AudioStream getAudioStream(Song song) throws IOException;
}
