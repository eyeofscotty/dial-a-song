import controller.LocateAudioStream;
import controller.impl.LocateAudioStreamImpl;
import data.Song;
import data.SongDAO;
import data.impl.SongDAOImpl;
import database.Connector;

import java.util.List;

/**
 * Created by Scott on 5/12/2017.
 */
public class testRun {

    LocateAudioStream las = new LocateAudioStreamImpl();
    Song song1 = new Song(12345, "Noodles", "Don't matter");

    public testRun(){
        Connector c = new Connector();
        c.getConnection();
        SongDAO songDAO = new SongDAOImpl();
//        Song song1 = new Song(12345, "Noodles", "Don't matter", "Noodles and CO");
        List<Song> list = songDAO.getAllSongs();
        for(Song s: list){
            System.out.println(s.toString());
        }
        Song song1 = songDAO.getSong(1);
        System.out.println(song1.toString());
        System.out.println(songDAO.updateSong(song1));
        song1 = songDAO.getSong(1);
        System.out.println(song1.toString());
//
//        Song song2 = new Song( "Noodles", "Don't matter", "Noodles and CO");
//        System.out.println(songDAO.insertSong(song2));
//        System.out.println(":::::::");
//        list = songDAO.getAllSongs();
//        for(Song s: list){
//            System.out.println(s.toString());
//        }

//        List<Song> list = songDAO.getAllSongs();
//        for(Song s: list){
//            System.out.println(s.toString());
//        }
//        System.out.println(songDAO.deleteSong(3));
//
//        list = songDAO.getAllSongs();
//        for(Song s: list){
//            System.out.println(s.toString());
//        }
    }


}
