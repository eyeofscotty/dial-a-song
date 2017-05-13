package controller.impl;

import controller.controller.PlayController;
import data.Song;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.File;

/**
 * Created by Scott on 5/12/2017.
 */
public class PlayControllerImpl  implements PlayController{


    public void playSong(AudioStream audioStream){
        AudioPlayer.player.start(audioStream);
    }

    public void stopSong(AudioStream audioStream){
        AudioPlayer.player.stop(audioStream);
    }
}
