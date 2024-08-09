package AbstractInterface;

public class TestAbstraction {
    public static void main(String[] args) {
       // vehicle vc = new vehicle(); here we do not make object of asbtracted class
        Car c = new Car();

        c.commute(); //we can access vehicle by child
        System.out.println(c.getNoOfTires());
        c.makeStartSound();
    }
}
