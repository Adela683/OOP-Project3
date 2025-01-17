package app.user;

import java.util.ArrayList;
import java.util.List;

import app.audio.Collections.Album;
import app.audio.Collections.AlbumOutput;
import app.audio.Collections.Notification;
import app.audio.Files.Song;
import app.pages.ArtistPage;
import lombok.Getter;

/**
 * The type Artist.
 */
public final class Artist extends ContentCreator {
    /**
     * -- GETTER --
     *  Gets albums.
     *
     * @return the albums
     */
    @Getter
    private ArrayList<Album> albums;
    /**
     * -- GETTER --
     *  Gets merch.
     *
     * @return the merch
     */
    @Getter
    private ArrayList<Merchandise> merch;
    /**
     * -- GETTER --
     *  Gets events.
     *
     * @return the events
     */
    @Getter
    private ArrayList<Event> events;
    private ArrayList<User> subscribers;


    /**
     * Instantiates a new Artist.
     *
     * @param username the username
     * @param age      the age
     * @param city     the city
     */
    public Artist(final String username, final int age, final String city) {
        super(username, age, city);
        albums = new ArrayList<>();
        merch = new ArrayList<>();
        events = new ArrayList<>();
        subscribers = new ArrayList<>();

        super.setPage(new ArtistPage(this));
    }


    /**
     * Gets event.
     *
     * @param eventName the event name
     * @return the event
     */
    public Event getEvent(final String eventName) {
        for (Event event : events) {
            if (event.getName().equals(eventName)) {
                return event;
            }
        }

        return null;
    }

    /**
     * Gets album.
     *
     * @param albumName the album name
     * @return the album
     */
    public Album getAlbum(final String albumName) {
        for (Album album : albums) {
            if (album.getName().equals(albumName)) {
                return album;
            }
        }

        return null;
    }

    /**
     * Gets all songs.
     *
     * @return the all songs
     */
    public List<Song> getAllSongs() {
        List<Song> songs = new ArrayList<>();
        albums.forEach(album -> songs.addAll(album.getSongs()));

        return songs;
    }

    /**
     * Show albums array list.
     *
     * @return the array list
     */
    public ArrayList<AlbumOutput> showAlbums() {
        ArrayList<AlbumOutput> albumOutput = new ArrayList<>();
        for (Album album : albums) {
            albumOutput.add(new AlbumOutput(album));
        }

        return albumOutput;
    }

    /**
     * Get user type
     *
     * @return user type string
     */
    public String userType() {
        return "artist";
    }

    @Override
    public List<User> getSubscribers() {
        return subscribers;
    }

    @Override
    public User getSubscriber(User user) {
        for(User subscriber : subscribers) {
            if(subscriber.equals(user)) {
                return subscriber;
            }
        }

        return null;
    }

    @Override
    public void addSubscriber(User user) {
        subscribers.add(user);
    }

    @Override
    public void removeSubscriber(User user) {
        subscribers.remove(user);
    }
}
