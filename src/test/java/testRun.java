import controller.controller.LocateAudioStream;
import controller.impl.LocateAudioStreamImpl;
import data.Song;

import java.io.IOException;

/**
 * Created by Scott on 5/12/2017.
 */
public class testRun {

    LocateAudioStream las = new LocateAudioStreamImpl();
    Song song1 = new Song(12345, "Noodles", "Don't matter", "Noodles and CO", "11:33");

    public testRun(){
//        try {
//            las.getAudioStream(song1);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }


}
