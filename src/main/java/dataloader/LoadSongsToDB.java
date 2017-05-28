package dataloader;

import data.Song;
import data.SongDAO;
import data.impl.SongDAOImpl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.RandomAccess;

/**
 * Created by Scott on 5/28/2017.
 */
public class LoadSongsToDB {
    static final String DEFAULT_PATH = "D:/Songs/";
    private SongDAO songDAO = new SongDAOImpl();

    public void loadSongs(String path){
        File songFolder = new File(path);
        File[] artistList = songFolder.listFiles();
        for(File artist: artistList){
            File[] songtList = artist.listFiles();
            for(File song: songtList){
                String songName = song.getName().replace(".wav", "");
                createSong(songName, artist.getName());
            }
        }
    }

    private void createSong(String songName, String artist){
        boolean songAdded = false;
        while(!songAdded){
            Song song = new Song(generateID(), songName, artist);
            System.out.println(song.toString());
            songAdded = songDAO.insertSong(song);
        }
    }

    private int generateID(){
        int id = 0;

        while(id < 9999){
            id = (int) (Math.random() * 100000);
        }
        System.out.println(id);
        return id;
    }

    private void removeAllSongs(){

    }
}
