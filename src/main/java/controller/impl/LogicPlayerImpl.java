package controller.impl;

import controller.controller.LocateAudioStream;
import controller.controller.LogicPlayer;
import controller.controller.PlayController;
import data.Song;

import javax.sound.sampled.Clip;
import java.io.IOException;

/**
 * Created by Scott on 5/21/2017.
 */
public class LogicPlayerImpl implements LogicPlayer {

    LocateAudioStream las = new LocateAudioStreamImpl();
    PlayController pc = new PlayControllerImpl();

    public void startPlaying(String input) throws IOException {
        Clip clip = pc.getClip();
        if (input.equals("stop")) {
            pc.stopSong();
        } else if (clip == null || !(clip.getMicrosecondPosition() < clip.getMicrosecondLength())) {
            Song song1 = new Song(12345, input, "", "Noodles and CO", "11:33");
            pc.playSong(las.getAudioStream(song1));
        }
    }

}
