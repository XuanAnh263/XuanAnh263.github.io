package home_work_day08.repository;

import home_work_day08.database.FilmDatabase;
import home_work_day08.model.Movie;
import home_work_day08.model.Serial;

public class FilmRepository {
    public Movie[] findMovie() {
        return FilmDatabase.movies;
    }
    public Serial[] findSerial() {
        return FilmDatabase.serials;
    }
}
