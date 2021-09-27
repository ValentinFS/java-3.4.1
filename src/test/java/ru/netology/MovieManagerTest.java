package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    @Test
    void shouldCheckAddMoviesMin() {

        MovieManager manager = new MovieManager(10);
        MovieItems movie1 = new MovieItems(1, "Image", "Бладшот", "Боевик");
        manager.add(movie1);

        MovieItems[] expected = new MovieItems[]{movie1};
        MovieItems[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }


    @Test
    void shouldCheckAddMoviesOverMin() {

        MovieManager manager = new MovieManager(10);
        MovieItems movie1 = new MovieItems(1, "Image", "Бладшот", "Боевик");
        MovieItems movie2 = new MovieItems(2, "Image", "Вперед", "Мультфильм");
        manager.add(movie1);
        manager.add(movie2);

        MovieItems[] expected = new MovieItems[]{movie2, movie1};
        MovieItems[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }


    @Test
    void shouldCheckMoviesUnderLimit() {

        MovieManager manager = new MovieManager(10);
        MovieItems movie1 = new MovieItems(1, "Image", "Бладшот", "Боевик");
        MovieItems movie2 = new MovieItems(2, "Image", "Вперед", "Мультфильм");
        MovieItems movie3 = new MovieItems(3, "Image", "Отель Белград", "Комедия");
        MovieItems movie4 = new MovieItems(4, "Image", "Джентельмены", "Боевик");
        MovieItems movie5 = new MovieItems(5, "Image", "Человек-невидимка", "Ужасы");
        MovieItems movie6 = new MovieItems(6, "Image", "Тролли. Мировой тур", "Мультфильм");
        MovieItems movie7 = new MovieItems(7, "Image", "Номер один", "Комедия");
        MovieItems movie8 = new MovieItems(8, "Image", "Босс-молокосос", "Мультфильм");
        MovieItems movie9 = new MovieItems(9, "Image", "Травиата", "Драма");
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        MovieItems[] expected = new MovieItems[]{movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        MovieItems[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }


    @Test
    void shouldCheckMoviesLimit() {

        MovieManager manager = new MovieManager(10);
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
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        MovieItems[] expected = new MovieItems[]{movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        MovieItems[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldCheckMoviesOverLimit() {

        MovieManager manager = new MovieManager(10);
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
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);
        MovieItems[] expected = new MovieItems[]{movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        MovieItems[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveByIdMin() {
        MovieManager manager = new MovieManager(10);
        MovieItems movie1 = new MovieItems(1, "Image", "Бладшот", "Боевик");
        manager.add(movie1);
        manager.removeById(1);
        MovieItems[] expected = new MovieItems[]{};
        MovieItems[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveByIdOverMin() {
        MovieManager manager = new MovieManager(10);
        MovieItems movie1 = new MovieItems(1, "Image", "Бладшот", "Боевик");
        MovieItems movie2 = new MovieItems(2, "Image", "Вперед", "Мультфильм");
        manager.add(movie1);
        manager.add(movie2);
        manager.removeById(1);
        MovieItems[] expected = new MovieItems[]{movie2};
        MovieItems[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveByIdMiddle() {
        MovieManager manager = new MovieManager(10);
        MovieItems movie1 = new MovieItems(1, "Image", "Бладшот", "Боевик");
        MovieItems movie2 = new MovieItems(2, "Image", "Вперед", "Мультфильм");
        MovieItems movie3 = new MovieItems(3, "Image", "Отель Белград", "Комедия");
        MovieItems movie4 = new MovieItems(4, "Image", "Джентельмены", "Боевик");
        MovieItems movie5 = new MovieItems(5, "Image", "Человек-невидимка", "Ужасы");
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.removeById(4);
        MovieItems[] expected = new MovieItems[]{movie5, movie3, movie2, movie1};
        MovieItems[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveByIdUnderLimit() {
        MovieManager manager = new MovieManager(10);
        MovieItems movie1 = new MovieItems(1, "Image", "Бладшот", "Боевик");
        MovieItems movie2 = new MovieItems(2, "Image", "Вперед", "Мультфильм");
        MovieItems movie3 = new MovieItems(3, "Image", "Отель Белград", "Комедия");
        MovieItems movie4 = new MovieItems(4, "Image", "Джентельмены", "Боевик");
        MovieItems movie5 = new MovieItems(5, "Image", "Человек-невидимка", "Ужасы");
        MovieItems movie6 = new MovieItems(6, "Image", "Тролли. Мировой тур", "Мультфильм");
        MovieItems movie7 = new MovieItems(7, "Image", "Номер один", "Комедия");
        MovieItems movie8 = new MovieItems(8, "Image", "Босс-молокосос", "Мультфильм");
        MovieItems movie9 = new MovieItems(9, "Image", "Травиата", "Драма");
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.removeById(7);
        MovieItems[] expected = new MovieItems[]{movie9, movie8, movie6, movie5, movie4, movie3, movie2, movie1};
        MovieItems[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveByIdLimit() {
        MovieManager manager = new MovieManager(10);
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
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.removeById(8);
        MovieItems[] expected = new MovieItems[]{movie10, movie9, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        MovieItems[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveByIdOverLimit() {
        MovieManager manager = new MovieManager(10);
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
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);
        manager.removeById(8);
        MovieItems[] expected = new MovieItems[]{movie11, movie10, movie9, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        MovieItems[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldCreateEmptyConstructor() {
        MovieManager manager = new MovieManager();
        MovieItems movie1 = new MovieItems();
        manager.add(movie1);
        MovieItems[] expected = new MovieItems[]{movie1};
        MovieItems[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }

}