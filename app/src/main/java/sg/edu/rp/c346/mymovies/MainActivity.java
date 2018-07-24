package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvMovies;
    ArrayList<Movies> alMovieList;
    CustomAdapter caMovieList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_item);

        lvMovies = findViewById(R.id.listViewMovies);
        alMovieList = new ArrayList<>();

        Calendar Moviedate1 = Calendar.getInstance();
        Moviedate1.set(2014,10,15);
        Calendar Moviedate2 = Calendar.getInstance();
        Moviedate2.set(2015,4,15);

        Movies Movie1 = new Movies("The Avengers","2012", "pg13", "Action | Sci-Fi", Moviedate1, "Golden Village - Bishan", "Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army.");
        Movies Movie2 = new Movies("Planes", "2013", "pg", "Animation | Comedy", Moviedate2, "Cathay - AMK Hub", "A crop-dusting plane with a fear of heights lives his dream of competing in a famous around-the-world aerial race.");

        alMovieList.add(Movie1);
        alMovieList.add(Movie2);

        caMovieList = new CustomAdapter(this, R.layout.movie_content, alMovieList);

        lvMovies.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent (getBaseContext(), Movie)
            }
        });
    }
}
