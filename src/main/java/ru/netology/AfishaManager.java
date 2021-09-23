package ru.netology;

public class AfishaManager {

    private AfishaRepository repository;

    public AfishaManager(AfishaRepository repository){
        this.repository=repository;
    }

    public void add(MovieItems item){
        repository.save(item);
    }

    public MovieItems[] getAll(){
        MovieItems[] items = repository.findAll();
        MovieItems[] result = new MovieItems[items.length];
        for (int i=0; i<result.length; i++) {
            result[i]=items[result.length-i-1];
        }
        return result;
    }

    public void removeById(int id){
        repository.removeById(id);
    }



}
