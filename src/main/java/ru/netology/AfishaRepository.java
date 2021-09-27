package ru.netology;

public class AfishaRepository {

    private MovieItems[] items = new MovieItems[0];
    boolean resultRemove = false;

    public void save(MovieItems item) {
        int length = items.length + 1;
        MovieItems[] tmp = new MovieItems[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public MovieItems[] findAll() {
        return items;
    }

    public MovieItems[] findById(int id) {
        MovieItems[] tmp = new MovieItems[1];
        int index = 0;
        for (MovieItems item : items) {
            if (item.getId() == id) {
                tmp[index] = item;
            }
        }
        items = tmp;
        return items;
    }


    public void removeById(int id) {
        int length = items.length - 1;
        MovieItems[] tmp = new MovieItems[length];
        int index = 0;
        for (MovieItems item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
            if (item.getId() == id) {
                resultRemove = false;
            } else {
                resultRemove = true;
            }
        }
        items = tmp;
    }

    public void removeAll() {
        items = new MovieItems[0];
        resultRemove = true;
    }

}
