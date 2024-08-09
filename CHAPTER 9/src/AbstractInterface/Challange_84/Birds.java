package AbstractInterface.Challange_84;

public abstract class Birds {

    private final String breed;

    public Birds(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public abstract void fly();
}
