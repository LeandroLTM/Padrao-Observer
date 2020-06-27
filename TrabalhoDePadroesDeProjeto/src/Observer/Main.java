package Observer;
/**
 *
 * @author Leandro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MovieEditor marvel = new MovieEditor();
       MovieEditor dc = new MovieEditor();
       
       marvel.newMovie("Capitao America 1");
       Observer saulo = new People("Saulo",marvel);
       marvel.newMovie("Capitao America 2");
       
       dc.newMovie("Super Homem");
       Observer julio = new People("Julio",dc);
       dc.newMovie("Liga da justica");
       
       marvel.registerObserver(julio);
       marvel.newMovie("Deadpool");
    }
    
}
