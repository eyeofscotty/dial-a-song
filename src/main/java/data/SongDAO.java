package data;

import java.util.List;

public interface SongDAO {
    public List<Song> getAllSongs();
    public Song getSong(int songID);
    public void updateSong(Song song);
    public void deleteSong(Song song);
}
