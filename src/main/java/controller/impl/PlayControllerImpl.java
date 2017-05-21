package controller.impl;

import controller.controller.PlayController;
import data.Song;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by Scott on 5/12/2017.
 */
public class PlayControllerImpl  implements PlayController{
    private Clip clip;

    public void playSong(AudioInputStream ais) {
        try {
            clip = AudioSystem.getClip();
            clip.open(ais);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void stopSong(){
        if(this.clip != null){
            this.clip.close();
            this.clip = null;
        }
    }

    public Clip getClip(){
        return this.clip;
    }

}
