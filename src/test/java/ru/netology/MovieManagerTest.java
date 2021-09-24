package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfishaRepositoryTest {

    @Test
    void shouldFindAll() {
        AfishaRepository repository = new AfishaRepository();
        MovieItems movie1 = new MovieItems(1, "Image", "Бладшот", "Боевик");
        MovieItems movie2 = new MovieItems(2, "Image", "Вперед", "Мультфильм");
        MovieItems movie3 = new MovieItems(3, "Image", "Отель Белград", "Комедия");
        repository.save(movie1);
        repository.save(movie2);
        repository.save(movie3);
        repository.findAll();
        assertEquals(3, repository.getItemsLength());
    }

    @Test
    void shouldSaveMovieItemMin() {
        AfishaRepository repository = new AfishaRepository();
        MovieItems movie1 = new MovieItems(1, "Image", "Бладшот", "Боевик");
        repository.save(movie1);
        assertEquals(1, repository.getItemsLength());
    }

    @Test
    void shouldSaveMovieItemMiddle() {
        AfishaRepository repository = new AfishaRepository();
        MovieItems movie1 = new MovieItems(1, "Image", "Бладшот", "Боевик");
        MovieItems movie2 = new MovieItems(2, "Image", "Вперед", "Мультфильм");
        MovieItems movie3 = new MovieItems(3, "Image", "Отель Белград", "Комедия");
        MovieItems movie4 = new MovieItems(4, "Image", "Джентельмены", "Боевик");
        MovieItems movie5 = new MovieItems(5, "Image", "Человек-невидимка", "Ужасы");
        repository.save(movie1);
        repository.save(movie2);
        repository.save(movie3);
        repository.save(movie4);
        repository.save(movie5);
        assertEquals(5, repository.getItemsLength());
    }

    @Test
    void shouldFindById() {
        AfishaRepository repository = new AfishaRepository();
        MovieItems movie1 = new MovieItems(1, "Image", "Бладшот", "Боевик");
        MovieItems movie2 = new MovieItems(2, "Image", "Вперед", "Мультфильм");
        MovieItems movie3 = new MovieItems(3, "Image", "Отель Белград", "Комедия");
        repository.save(movie1);
        repository.save(movie2);
        repository.save(movie3);
        repository.findById(2);
        assertEquals(2, repository.getIdNumber());
    }

    @Test
    void shouldRemoveById() {
        AfishaRepository repository = new AfishaRepository();
        MovieItems movie1 = new MovieItems(1, "Image", "Бладшот", "Боевик");
        MovieItems movie2 = new MovieItems(2, "Image", "Вперед", "Мультфильм");
        MovieItems movie3 = new MovieItems(3, "Image", "Отель Белград", "Комедия");
        repository.save(movie1);
        repository.save(movie2);
        repository.save(movie3);
        repository.removeById(2);
        assertEquals(true, repository.getResultRemove());
    }

    @Test
    void shouldRemoveAll() {
        AfishaRepository repository = new AfishaRepository();
        MovieItems movie1 = new MovieItems(1, "Image", "Бладшот", "Боевик");
        MovieItems movie2 = new MovieItems(2, "Image", "Вперед", "Мультфильм");
        MovieItems movie3 = new MovieItems(3, "Image", "Отель Белград", "Комедия");
        repository.save(movie1);
        repository.save(movie2);
        repository.save(movie3);
        repository.removeAll();
        assertEquals(true, repository.getResultRemove());
    }




}