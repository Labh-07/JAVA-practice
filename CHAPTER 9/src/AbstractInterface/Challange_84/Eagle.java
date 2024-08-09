package AbstractInterface.Challange_84;

public class Eagle extends Birds{

    Eagle(){
        super("Flyable");
    }

    @Override
    public void fly(){
        System.out.println("Eagle is flying");
    }
}
