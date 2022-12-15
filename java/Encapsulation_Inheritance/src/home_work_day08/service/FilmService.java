package home_work_day08.service;

import home_work_day08.model.Movie;
import home_work_day08.model.Serial;
import home_work_day08.repository.FilmRepository;

public class FilmService {
    FilmRepository filmRepository = new FilmRepository();
    Movie movie = new Movie();
    Serial serial = new Serial();

    public void findFilmByTitle(String title) {
        int count = 0;
        for (Movie movie : filmRepository.findMovie()) {
            if (movie.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println(movie);
                count++;
            }
        }

        for (Serial serial : filmRepository.findSerial()) {
            if (serial.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println(serial);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("\nKhông có phim có title là: " + title);
        }
    }

    public void showFilm() {
        for (Movie movie : filmRepository.findMovie()) {
            System.out.println(movie);
        }
        for (Serial serial : filmRepository.findSerial()) {
            System.out.println(serial);
        }
    }
}
