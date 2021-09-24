package ru.netology;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

public class AfishaManagerTest {

    private AfishaRepository repository = Mockito.mock(AfishaRepository.class);
    private AfishaManager manager = new AfishaManager(repository);
    private MovieItems movie1 = new MovieItems(1, "Image", "Бладшот", "Боевик");
    private MovieItems movie2 = new MovieItems(2, "Image", "Вперед", "Мультфильм");
    private MovieItems movie3 = new MovieItems(3, "Image", "Отель Белград", "Комедия");


    @Test
    void shouldAdd() {
        MovieItems[] returned = {movie1, movie2, movie3};
        doReturn(returned).when(repository).findAll();

        MovieItems[] expected = MovieItems[3];
        MovieItems[] actual = manager.getAll();
        assertArrayEquals(expected, actual);

        verify(repository).findAll();
    }

    @Test
    void shouldGetAll() {


    }

    @Test
    void shouldRemoveById() {
    }
}