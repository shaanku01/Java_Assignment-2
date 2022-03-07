package shanker.assignment.data;
interface MyCycle{
    public void method();
}

class UnicycleA implements MyCycle{

    @Override
    public void method() {
        System.out.println("In Unicycle Class");
    }
}
class BicycleA implements MyCycle{

    @Override
    public void method() {
        System.out.println("In Bicycle Class");
    }
}
class TricycleA implements MyCycle{

    @Override
    public void method() {
        System.out.println("In Tricycle Class");
    }
}

class Factory{
    public static void myMethod(MyCycle ref){
        // Implementation Logic::::
        ref.method();
    }
}

public class Question4 {

    public static void main(String args[]){
        BicycleA objc = new BicycleA();
        Factory.myMethod(objc);

    }

}
