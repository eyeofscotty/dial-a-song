package impl;

import data.Song;
import data.SongDAO;

import java.util.ArrayList;
import java.util.List;

public class SongDAOImpl implements SongDAO {

    //list is working as a database
    List<Song> songs;

    public SongDAOImpl(){
        songs = new ArrayList<Song>();
        Song song1 = new Song();
        Song song2 = new Song();
        songs.add(song1);
        songs.add(song2);
    }
    @Override
    public void deleteSong(Song song) {
        songs.remove(song.getId());
        System.out.println("Song: Roll No " + song.getId() + ", deleted from database");
    }

    @Override
    public List<Song> getAllSongs() {
        return songs;
    }
    

    @Override
    public Song getSong(int rollNo) {
        return songs.get(rollNo);
    }

    @Override
    public void updateSong(Song song) {
        songs.get(song.getId()).setName(song.getName());
        System.out.println("Song: Roll No " + song.getId() + ", updated in the database");
    }
}
