package shanker.assignment.data;


abstract class Cycle{
    public abstract void balance();
}

class Unicycle extends Cycle{

    @Override
    public void balance() {
        System.out.println("This is Unicycle and costs 10k");
    }
}
class Bicycle extends Cycle{

    @Override
    public void balance() {
        System.out.println("This is Bicycle and costs 20k");
    }
}

abstract class Tricycle extends Cycle{
// error since method is not overrided.

}

public class Question2 {
    public static void main(String args[]){
        Cycle arr[] = new Cycle[3];
        arr[0] = new Unicycle();
        arr[0].balance();
        arr[1] = new Bicycle();
        arr[1].balance();
//        arr[2] = new Tricycle();
//        arr[2].balance();


    }

}
