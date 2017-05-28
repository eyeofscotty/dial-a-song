import controller.LogicPlayer;
import controller.impl.LogicPlayerImpl;
import javax.sound.sampled.*;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Scott on 5/12/2017.
 */
public class Run {
    Scanner sc = new Scanner(System.in);
    LogicPlayer lp = new LogicPlayerImpl();

    public void run() throws IOException, InterruptedException, LineUnavailableException, UnsupportedAudioFileException {
        String nextLine = "";
        while (true) {
            nextLine = sc.nextLine();
            lp.parseInput(nextLine);
        }
    }
}
