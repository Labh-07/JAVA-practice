package AbstractInterface;

public abstract class vehicle implements Transport {
//here for interface responsiblities not complsoury to define becuase it is abstarct we can also implement here
    private int niOfTiers;

    public abstract void makeStartSound();   //no need to specify the method definition
                                           //for declaration of abstract child it is necessary to have abstract class
                                           //it is responsibilities to child to define this methods
@Override
public void getSetGo(){
    System.out.println("Started !");
}

    /*
advantage of abstarct methos :
if we have some proparty that depends on child ex. statrting sound then we declare that method abstracted

 */

    public vehicle(int noOfTiers){
        this.niOfTiers=noOfTiers;
    }

    public int getNoOfTires(){
        return niOfTiers;
    }

    public void setNiOfTiers(int niOfTiers){
        this.niOfTiers=niOfTiers;
    }

    public void commute(){
        System.out.println("going.....");
    }

}
