package shanker.assignment.data;

abstract class Rodent{
    Rodent(){
        System.out.println("In Rodent Constructor");
    }
    public abstract void intro();
    public abstract void eatCheese();


}

class Mouse extends Rodent{

    public Mouse(){
        System.out.println("In Mouse Constructor");
    }

    @Override
    public void intro() {
        System.out.println("Hi I am a Mouse");
    }

    @Override
    public void eatCheese() {
        System.out.println("Mouse eating cheese");
    }
}

class Gerbil extends Rodent{
    public Gerbil(){
        System.out.println("In Gerbil Constructor");
    }

    @Override
    public void intro() {
        System.out.println("Hi I am a Gerbil");
    }

    @Override
    public void eatCheese() {
        System.out.println("Gerbil eating cheese");
    }
}

class Hamster extends Rodent{
    public Hamster(){
        System.out.println("In Hamster Constructor");
    }

    @Override
    public void intro() {
        System.out.println("Hi I am a Hamster");
    }

    @Override
    public void eatCheese() {
        System.out.println("Hamster eating cheese ");
    }
}


public class question1 {

    public static void main(String[] args) {
        Rodent arr[] = new Rodent[3];
        arr[0] = new Mouse();
        arr[0].intro();
        arr[0].eatCheese();

        arr[1] = new Gerbil();
        arr[1].intro();
        arr[1].eatCheese();

        arr[2] = new Hamster();
        arr[2].intro();
        arr[2].eatCheese();

    }
}
