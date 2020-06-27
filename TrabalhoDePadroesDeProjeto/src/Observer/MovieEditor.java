package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leandro
 */
public class MovieEditor implements Subject{
    private List<Observer> observers;
    private List<String> movies;
    
    public MovieEditor(){
        this.observers = new ArrayList<>();
        this.movies = new ArrayList<>();
    }
    
    public void newMovie(String movie){
        this.movies.add(movie);
        this.notifyAllObserver();
    }
    
    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
        }

    @Override
    public void removeObserver(Observer observer) {
        if(this.observers.indexOf(observer) >= 0){
            this.observers.remove(observer);
        }else{
            System.out.println("Observador não existe");
        }
     }

    @Override
    public void notifyAllObserver() {
        for(Observer observer : this.observers){
            observer.update(this.movies.get(this.movies.size()-1));
        }
     }
}
