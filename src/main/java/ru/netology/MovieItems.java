package ru.netology;

public class MovieItems {

    private int id;
    private String imgUrl;
    private String name;
    private String genre;


    public MovieItems() {
    }

    public MovieItems(int id, String imgUrl, String name, String genre) {
        this.id = id;
        this.imgUrl = imgUrl;
        this.name = name;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }


}