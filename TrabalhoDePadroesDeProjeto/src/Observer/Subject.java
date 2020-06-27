package Observer;

/**
 *
 * @author Leandro
 */
public interface Subject {
    
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyAllObserver();
    
}
