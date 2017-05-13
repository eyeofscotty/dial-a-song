import controller.controller.LocateAudioStream;
import controller.controller.PlayController;
import controller.impl.LocateAudioStreamImpl;
import controller.impl.PlayControllerImpl;
import data.Song;
import sun.audio.AudioStream;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Scott on 5/12/2017.
 */
public class Run {
    Scanner sc = new Scanner(System.in);
    String nextLine = "";
    LocateAudioStream las = new LocateAudioStreamImpl();
    PlayController pc = new PlayControllerImpl();
    AudioStream audioStream;


    public void run(){

        while(!nextLine.equals("quit")) {
            nextLine = sc.nextLine();
            if(nextLine.equals("stop")){
                pc.stopSong(audioStream);
            }

            else{
                Song song1 = new Song(12345, nextLine, "", "Noodles and CO", "11:33");
                try {
                    audioStream = las.getAudioStream(song1);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                pc.playSong(audioStream);
            }
        }
    }
}
