package controller.impl;

import controller.LocateAudioStream;
import controller.LogicPlayer;
import controller.PlayController;
import data.Song;
import data.SongDAO;
import data.impl.SongDAOImpl;

import javax.sound.sampled.Clip;
import java.io.IOException;

/**
 * Created by Scott on 5/21/2017.
 */
public class LogicPlayerImpl implements LogicPlayer {

    LocateAudioStream las = new LocateAudioStreamImpl();
    PlayController pc = new PlayControllerImpl();
    SongDAO songDAO = new SongDAOImpl();
    String idBuilder = "";

    private void startPlaying(Song song) {
        Clip clip = pc.getClip();
        if (clip == null || !(clip.getMicrosecondPosition() < clip.getMicrosecondLength())) {
            pc.playSong(las.getAudioStream(song));
        }
    }

    private void stopPlaying(){
        pc.stopSong();
    }

    public void parseInput(String input) throws IOException {
        idBuilder += input;
        System.out.println(idBuilder);
        if (input.equals("#")) {
            stopPlaying();
            idBuilder = "";
        }

        if(idBuilder.length() >= 5){
            Song song = songDAO.getSong(Integer.parseInt(idBuilder));
            startPlaying(song);
            idBuilder = "";

        }
    }

}
