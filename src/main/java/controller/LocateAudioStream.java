package controller;

import data.Song;
import javax.sound.sampled.AudioInputStream;

/**
 * Created by Scott on 5/12/2017.
 */
public interface LocateAudioStream {

    AudioInputStream getAudioStream(Song song);
}
