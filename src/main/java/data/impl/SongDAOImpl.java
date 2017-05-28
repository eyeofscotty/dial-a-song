package data.impl;

import data.Song;
import data.SongDAO;
import database.Connector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SongDAOImpl implements SongDAO {

    //list is working as a database
    List<Song> songs;

    public SongDAOImpl(){

    }

    @Override
    public boolean deleteSong(int id) {
        Connector connector = new Connector();
        Connection connection = connector.getConnection();
        boolean deleteSuccess = false;
        try {
            PreparedStatement stmt = connection.prepareStatement("delete from songs where id=?");
            stmt.setInt(1,id);
            int i = stmt.executeUpdate();
            if(i == 1){
                deleteSuccess = true;
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return deleteSuccess;
    }

    @Override
    public List<Song> getAllSongs() {
        Connector connector = new Connector();
        Connection connection = connector.getConnection();
        Song song;
        List<Song> songs = new ArrayList<Song>();
        try {
            PreparedStatement stmt = connection.prepareStatement("select * from songs");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                song = extractSongFromResultSet(rs);
                songs.add(song);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return songs;
    }


    @Override
    public Song getSong(int id) {
        Connector connector = new Connector();
        Connection connection = connector.getConnection();
        Song song = new Song();
        try {
            PreparedStatement stmt = connection.prepareStatement("select * from songs where id=?");
            stmt.setInt(1,id);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                song = extractSongFromResultSet(rs);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return song;
    }

    @Override
    public boolean insertSong(Song song) {
        Connector connector = new Connector();
        Connection connection = connector.getConnection();
        boolean updateSuccess = false;
        try {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO songs VALUES (?, ?, ?)");
            ps.setInt(1, song.getId());
            ps.setString(2, song.getName());
            ps.setString(3, song.getArtist());
            int i = ps.executeUpdate();
            if(i == 1) {
                updateSuccess = true;
            }
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return updateSuccess;
    }

    @Override
    public boolean updateSong(Song song) {
        Connector connector = new Connector();
        Connection connection = connector.getConnection();
        boolean updateSuccess = false;
        try {
            PreparedStatement ps = connection.prepareStatement("UPDATE songs SET name=?, artist=?, WHERE id=?");
            ps.setString(1, song.getName());
            ps.setString(2, song.getArtist());
            ps.setInt(3,song.getId());
            int i = ps.executeUpdate();
            if(i == 1) {
                updateSuccess =  true;
            }
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return updateSuccess;
    }

    private Song extractSongFromResultSet(ResultSet rs) throws SQLException {
        Song song = new Song();

        song.setId(rs.getInt("id"));
        song.setName(rs.getString("name"));
        song.setArtist(rs.getString("artist"));

        return song;
    }
}
