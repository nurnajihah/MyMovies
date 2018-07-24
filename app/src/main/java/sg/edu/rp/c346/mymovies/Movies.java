package sg.edu.rp.c346.mymovies;

import java.util.Calendar;

/**
 * Created by 17010475 on 24/7/2018.
 */

public class Movies {

    private String title;
    private String date;
    private String rated;
    private String genre;
    private Calendar watched_on;
    private String in_theatres;
    private String description;

    public Movies(String title, String date, String rated, String genre, Calendar watched_on, String in_theatres, String description) {
        this.title = title;
        this.date = date;
        this.rated = rated;
        this.genre = genre;
        this.watched_on = watched_on;
        this.in_theatres = in_theatres;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getWatched_on_String() {
        return watched_on.get(Calendar.DAY_OF_MONTH) + "/" + (watched_on.get(Calendar.MONTH) + 1) + "/" + watched_on.get(Calendar.YEAR);
    }

    public void setWatched_on(Calendar watched_on) {
        this.watched_on = watched_on;
    }

    public String getIn_theatres() {
        return in_theatres;
    }

    public void setIn_theatres(String in_theatres) {
        this.in_theatres = in_theatres;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", rated='" + rated + '\'' +
                ", genre='" + genre + '\'' +
                ", watched_on=" + watched_on +
                ", in_theatres='" + in_theatres + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
