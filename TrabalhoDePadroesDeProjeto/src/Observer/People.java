package Observer;

/**
 *
 * @author Leandro
 */
public class People implements Observer{
    private String nome;
    
    public People(String nome, Subject subject){
        this.nome = nome;
        subject.registerObserver(this);
    } 
    @Override
    public void update(String text) {
        System.out.println(this.nome + " o filme " + text + " está em cartaz partir de hoje. ");
    }
}
