package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {


    @Test
    void shouldCheckDefaultMovieAmount() {
        MovieManager manager = new MovieManager(10);
        assertEquals(10, manager.maxLength);
    }

    @Test
    void shouldAddMoviesMin() {
        MovieManager manager = new MovieManager();
        manager.setItems(1);
        assertEquals(1, manager.getItems());
    }

    @Test
    void shouldAddMoviesOverMin() {
        MovieManager manager = new MovieManager();
        manager.setItems(2);
        assertEquals(2, manager.getItems());
    }

    @Test
    void shouldAddMoviesMiddle() {
        MovieManager manager = new MovieManager();
        manager.setItems(5);
        assertEquals(5, manager.getItems());
    }

    @Test
    void shouldAddMoviesUnderMax() {
        MovieManager manager = new MovieManager();
        manager.setItems(9);
        assertEquals(9, manager.getItems());
    }

    @Test
    void shouldAddMoviesMax() {
        MovieManager manager = new MovieManager();
        manager.setItems(10);
        assertEquals(10, manager.getItems());
    }

    @Test
    void shouldAddMoviesOverMax() {
        MovieManager manager = new MovieManager();
        manager.setItems(15);
        assertEquals(15, manager.getItems());
    }

    @Test
    void shouldRemoveByIdMin() {
        MovieManager manager = new MovieManager();
        MovieItems movie1 = new MovieItems(1, "Image", "Бладшот", "Боевик");
        manager.add(movie1);
        manager.removeById(1);
        assertEquals(0, manager.getItems());
    }

    @Test
    void shouldRemoveByIdOverMin() {
        MovieManager manager = new MovieManager();
        MovieItems movie1 = new MovieItems(1, "Image", "Бладшот", "Боевик");
        MovieItems movie2 = new MovieItems(2, "Image", "Вперед", "Мультфильм");
        manager.add(movie1);
        manager.add(movie2);
        manager.removeById(1);
        assertEquals(1, manager.getItems());
    }

    @Test
    void shouldCreateEmptyConstructor() {
        MovieManager manager = new MovieManager();
        MovieItems movie1 = new MovieItems();
        manager.add(movie1);
        assertEquals(1, manager.getItems());
    }


    @Test
    void shouldGetAllByDefault() {
        MovieManager manager = new MovieManager();
        manager.setItems(11);
        manager.getAll();
        assertEquals(10, manager.getResultLength());
    }

    @Test
    void shouldGetAllLessDefault() {
        MovieManager manager = new MovieManager();
        manager.setItems(7);
        manager.getAll();
        assertEquals(7, manager.getResultLength());
    }


}