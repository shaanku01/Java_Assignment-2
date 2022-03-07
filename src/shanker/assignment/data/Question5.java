package shanker.assignment.data;

class OuterClass1{
    public OuterClass1(){
        System.out.println("Outer class Constructor -A");
    }
    class Inner1{
        public Inner1(int a){
            System.out.println(a);
            System.out.println("Inner class Constructor -A");
        }
    }
}

class OuterClass2 extends OuterClass1{
    public OuterClass2(){
        System.out.println("Outer class Constructor -B");
    }
    class Inner2{
        public Inner2(int a){
            System.out.println(a);
            System.out.println("Inner class Constructor -B");
        }
    }
}



public class Question5 {
    public static void main(String args[]){
        OuterClass2.Inner2 obj = new OuterClass2().new Inner2(22);

    }

}
