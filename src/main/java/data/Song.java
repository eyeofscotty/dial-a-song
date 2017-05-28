package data;

import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by Scott on 5/4/2017.
 */
public class Song {
    private int id;
    private String name;
    private String artist;
    private String album;

    public Song(){}

    public Song(int id, String name, String artist) {
        this.id = id;
        this.name = name;
        this.artist = artist;
    }

    public Song(String name, String artist){
        this.name = name;
        this.artist = artist;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }


    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
