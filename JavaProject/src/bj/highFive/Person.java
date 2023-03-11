package bj.highFive;
import bj.highFive.Adress;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Adress adress;
    public static int foot; 
    public String metier = "programmeur";
    public int finger = 20;
    {
        System.out.println("instance parentv");
    }

    static { foot =2;
        System.out.println("appelle du bloc static ");
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getMetier() {
        return this.metier;
    }

    public int getAge(){
        return this.age;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setMetier(int newMetier) {
        this.age = newMetier;
    }


    // public Person(String firstName) {
    //     this.firstName = firstName;
    // }

    // public Person(String firstName, String lastName) {
    //     this.firstName = firstName;
    //     this.lastName = lastName;
    // }

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age= age;
        System.out.println("super" + this.firstName);
    }

    public Person() {
        

    }


    public Person(String firstName, String lastName, int age, Adress adress, String metier) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.adress = adress;
        this.metier = metier;
    }

    // public Person(String firstName, String lastName, int age, String metier) {
    //     this.firstName = firstName;
    //     this.lastName = lastName;
    //     this.age = age;
    //     this.metier = metier;

    // }

    
    // public String toString () {
    //     return this.getFirstName() + ", " + ", " + this.getLastName() + ", " + this.getAge();
    // }
    
     public void presente () {
       System.out.println("Je suis " + this.getFirstName() + ", " + "j'ai " + this.getAge()+" ans"); 
       this.adress.showAddress();
    }

}
