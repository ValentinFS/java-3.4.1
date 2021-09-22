package ru.netology;

public class AfishaManager {

    public static void main(String[] args) {
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
        MovieItems movie12 = new MovieItems(12, "Image", "Дюна", "Фантастика");
        MovieItems movie13 = new MovieItems(13, "Image", "Литл Гром", "Мультфильм");
        MovieItems movie14 = new MovieItems(14, "Image", "Отчаянные аферистки", "Комедия");
        MovieItems movie15 = new MovieItems(15, "Image", "Семья года", "Комедия");

        MovieManager manager = new MovieManager();
        // MovieManager manager = new MovieManager(5);

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
        manager.add(movie12);
        manager.add(movie13);
        manager.add(movie14);
        manager.add(movie15);

        manager.getAll();

        manager.removeById(2);

    }

}