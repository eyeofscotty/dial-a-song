package controller.impl;

import controller.LocateAudioStream;
import data.Song;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import java.io.*;

/**
 * Created by Scott on 5/12/2017.
 */
public class LocateAudioStreamImpl implements LocateAudioStream {

    static final String DEFAULT_PATH = "D:/Songs/";

    public AudioInputStream getAudioStream(Song song) {
        AudioInputStream ais = null;
        try {
            ais = AudioSystem.getAudioInputStream(new File(constructPath(song)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ais;
    }

    private String constructPath(Song song){
        return DEFAULT_PATH + song.getArtist() + addToPath(song.getName() + ".wav");
    }

    private String addToPath(String pathAdd){
        String returnString;
        if(pathAdd.equals("") || pathAdd == null){
            returnString = "";
        }
        else{
            returnString = "/" + pathAdd;
        }
        System.out.println(": " + returnString);
        return returnString;
    }
}
