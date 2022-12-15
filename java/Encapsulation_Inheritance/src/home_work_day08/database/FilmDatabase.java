package home_work_day08.database;

import home_work_day08.model.Movie;
import home_work_day08.model.Serial;

public class FilmDatabase {
    public static Movie[] movies = {
            new Movie(1, "Doctor Strange", "Action", "Jonh", 2022, 180),
            new Movie(2, "Avenger: End Game", "Action", "Alex", 2021, 210),
    };

    public static Serial[] serials = {
            new Serial(3, "Batman", "Action", "David", 2018, 3, 40),
            new Serial(4, "Wonder Women", "Action", "Tom", 2017, 5, 29),

    };
}
