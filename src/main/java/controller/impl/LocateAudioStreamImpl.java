package controller.impl;

import controller.controller.LocateAudioStream;
import data.Song;
import sun.audio.AudioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Scott on 5/12/2017.
 */
public class LocateAudioStreamImpl implements LocateAudioStream {

    static final String DEFAULT_PATH = "D:/Songs";

    public AudioStream getAudioStream(Song song) throws IOException {
        String filePath = constructPath(song);
        InputStream inputStream = new FileInputStream(filePath);
        AudioStream audioStream = new AudioStream(inputStream);
        return audioStream;
    }

    private String constructPath(Song song){
        return DEFAULT_PATH + addToPath(song.getArtist()) + addToPath(song.getName() + ".wav");
    }

    private String addToPath(String pathAdd){
        String returnString;
        if(pathAdd.equals("") || pathAdd == null){
            returnString = "";
        }
        else{
            returnString = "/" + pathAdd;
        }
        System.out.println(returnString);
        return returnString;
    }

}
