package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfishaRepositoryTest {

    @Test
    void shouldFindAllMin() {
        AfishaRepository repository = new AfishaRepository();
        MovieItems movie1 = new MovieItems(1, "Image", "Бладшот", "Боевик");
        repository.save(movie1);

        MovieItems[] expected = new MovieItems[]{movie1};
        MovieItems[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindAllOverMin() {
        AfishaRepository repository = new AfishaRepository();
        MovieItems movie1 = new MovieItems(1, "Image", "Бладшот", "Боевик");
        MovieItems movie2 = new MovieItems(2, "Image", "Вперед", "Мультфильм");
        repository.save(movie1);
        repository.save(movie2);

        MovieItems[] expected = new MovieItems[]{movie1, movie2};
        MovieItems[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindAllMiddle() {
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

        MovieItems[] expected = new MovieItems[]{movie1, movie2, movie3, movie4, movie5};
        MovieItems[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindAllUnderLimit() {
        AfishaRepository repository = new AfishaRepository();
        MovieItems movie1 = new MovieItems(1, "Image", "Бладшот", "Боевик");
        MovieItems movie2 = new MovieItems(2, "Image", "Вперед", "Мультфильм");
        MovieItems movie3 = new MovieItems(3, "Image", "Отель Белград", "Комедия");
        MovieItems movie4 = new MovieItems(4, "Image", "Джентельмены", "Боевик");
        MovieItems movie5 = new MovieItems(5, "Image", "Человек-невидимка", "Ужасы");
        MovieItems movie6 = new MovieItems(6, "Image", "Тролли. Мировой тур", "Мультфильм");
        MovieItems movie7 = new MovieItems(7, "Image", "Номер один", "Комедия");
        MovieItems movie8 = new MovieItems(8, "Image", "Босс-молокосос", "Мультфильм");
        MovieItems movie9 = new MovieItems(9, "Image", "Травиата", "Драма");
        repository.save(movie1);
        repository.save(movie2);
        repository.save(movie3);
        repository.save(movie4);
        repository.save(movie5);
        repository.save(movie6);
        repository.save(movie7);
        repository.save(movie8);
        repository.save(movie9);

        MovieItems[] expected = new MovieItems[]{movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9};
        MovieItems[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindAllLimit() {
        AfishaRepository repository = new AfishaRepository();
        MovieItems movie1 = new MovieItems(1, "Image", "Бладшот", "Боевик");
        MovieItems movie2 = new MovieItems(2, "Image", "Вперед", "Мультфильм");
        MovieItems movie3 = new MovieItems(3, "Image", "Отель Белград", "Комедия");
        MovieItems movie4 = new MovieItems(4, "Image", "Джентельмены", "Боевик");
        MovieItems movie5 = new MovieItems(5, "Image", "Человек-невидимка", "Ужасы");
        MovieItems movie6 = new MovieItems(6, "Image", "Тролли. Мировой тур", "Мультфильм");
        MovieItems movie7 = new MovieItems(7, "Image", "Номер один", "Комедия");
        MovieItems movie8 = new MovieItems(8, "Image", "Босс-молокосос", "Мультфильм");
        MovieItems movie9 = new MovieItems(9, "Image", "Травиата", "Драма");
        MovieItems movie10 = new MovieItems(10, "Image", "Холостяк на свадьбе", "Комедия");
        repository.save(movie1);
        repository.save(movie2);
        repository.save(movie3);
        repository.save(movie4);
        repository.save(movie5);
        repository.save(movie6);
        repository.save(movie7);
        repository.save(movie8);
        repository.save(movie9);
        repository.save(movie10);

        MovieItems[] expected = new MovieItems[]{movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
        MovieItems[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindAllOverLimit() {
        AfishaRepository repository = new AfishaRepository();
        MovieItems movie1 = new MovieItems(1, "Image", "Бладшот", "Боевик");
        MovieItems movie2 = new MovieItems(2, "Image", "Вперед", "Мультфильм");
        MovieItems movie3 = new MovieItems(3, "Image", "Отель Белград", "Комедия");
        MovieItems movie4 = new MovieItems(4, "Image", "Джентельмены", "Боевик");
        MovieItems movie5 = new MovieItems(5, "Image", "Человек-невидимка", "Ужасы");
        MovieItems movie6 = new MovieItems(6, "Image", "Тролли. Мировой тур", "Мультфильм");
        MovieItems movie7 = new MovieItems(7, "Image", "Номер один", "Комедия");
        MovieItems movie8 = new MovieItems(8, "Image", "Босс-молокосос", "Мультфильм");
        MovieItems movie9 = new MovieItems(9, "Image", "Травиата", "Драма");
        MovieItems movie10 = new MovieItems(10, "Image", "Холостяк на свадьбе", "Комедия");
        MovieItems movie11 = new MovieItems(11, "Image", "Небесная команда", "Драма");
        repository.save(movie1);
        repository.save(movie2);
        repository.save(movie3);
        repository.save(movie4);
        repository.save(movie5);
        repository.save(movie6);
        repository.save(movie7);
        repository.save(movie8);
        repository.save(movie9);
        repository.save(movie10);
        repository.save(movie11);

        MovieItems[] expected = new MovieItems[]{movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10, movie11};
        MovieItems[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
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

        MovieItems[] expected = new MovieItems[]{movie2};
        MovieItems[] actual = repository.findById(2);
        assertArrayEquals(expected, actual);
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
        MovieItems[] expected = new MovieItems[]{movie1, movie3};
        MovieItems[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
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
        MovieItems[] expected = new MovieItems[]{};
        MovieItems[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }


}