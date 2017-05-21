import controller.controller.LocateAudioStream;
import controller.controller.LogicPlayer;
import controller.controller.PlayController;
import controller.impl.LocateAudioStreamImpl;
import controller.impl.LogicPlayerImpl;
import controller.impl.PlayControllerImpl;
import data.Song;
import sun.audio.AudioStream;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Scott on 5/12/2017.
 */
public class Run {
    Scanner sc = new Scanner(System.in);
    LogicPlayer lp = new LogicPlayerImpl();

    public void run() throws IOException, InterruptedException, LineUnavailableException, UnsupportedAudioFileException {
        String nextLine;
        while (true) {
            nextLine = sc.nextLine();
            System.out.println(nextLine);
            lp.startPlaying(nextLine);
        }
    }
}
