package data;

import java.util.List;

public interface SongDAO {
    List<Song> getAllSongs();
    Song getSong(int id);
    boolean updateSong(Song song);
    boolean deleteSong(int id);
    boolean insertSong(Song song);
}
