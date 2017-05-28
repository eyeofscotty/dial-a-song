import java.io.*;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * This is an example program that demonstrates how to play back an audio file
 * using the Clip in Java Sound API.
 * @author www.codejava.net
 *
 */
public class main {


    public static void main(String args[]) throws LineUnavailableException, IOException, UnsupportedAudioFileException, InterruptedException {

        //TODO's
        //Add config file
        //Add queueing system
        //Export all songs to Excel sheet of sorts
        //Smart add songs, only add songs if not already in DB

        Run run = new Run();
        run.run();
//        LoadSongsToDB l = new LoadSongsToDB();
//        l.loadSongs("D:/Songs/");
    }
}
