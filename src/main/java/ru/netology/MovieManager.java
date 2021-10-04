package ru.netology;

public class MovieManager {
    private MovieItems[] items = new MovieItems[0];
    private int maxLength = 10;

    public MovieManager() {
    }

    public MovieManager(int maxLength) {
        this.maxLength = maxLength;
    }


    public void add(MovieItems item) {
        int length = items.length + 1;
        MovieItems[] tmp = new MovieItems[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
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
        }
        items = tmp;
    }

    public MovieItems[] getAll() {
        MovieItems[] result;
        int resultLength;
        if (items.length > maxLength) {
            resultLength = maxLength;
            result = new MovieItems[resultLength];
            for (int i = 0; i < resultLength; i++) {
                int index = resultLength - i - 1;
                result[i] = items[index];
//                System.out.println("Выводим последние фильмы (не более 10) " + i);
            }
        } else {
            result = new MovieItems[items.length];
            for (int i = 0; i < items.length; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
//                System.out.println("В массиве меньше 10 элементов  " + i);
            }
        }

        return result;
    }

}
