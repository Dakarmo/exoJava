package bj.highFive;
import bj.highFive.Person;

public class Programmeur extends Person{
    int x;
    {
        System.out.println("boc d'instance");
    }
    
    public Programmeur() {
        super("tomy",20);
        System.out.println("constructeur programmeur");
        System.out.println("super.finger ==>" + super.finger);
        
    }

    @Override
   final public void presente () {
        System.out.println("Je suis "); 
     }
}
