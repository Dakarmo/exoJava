import bj.highFive.Compteur;
import bj.highFive.Programmeur;
import bj.highFive.Person;
import bj.highFive.Adress;

public class App  {


    public static void main(String[] args) throws Exception {
        Compteur compt1 = new Compteur();
        Compteur compt2 = new Compteur();
        Compteur compt3 = new Compteur();
        // Programmeur pro = new Programmeur();

        // System.out.println(compt1);
        // System.out.println(compt2);
        // System.out.println(compt3);
        // System.out.println(pro);

        Adress monAdress = new Adress("Bénin", "Cotonou");//aggrégation
        Person myPerson = new Person("Armel", "DOVENON", 20, monAdress, "Programmeur");

        myPerson.presente();




        
    }
}
