package AbstractInterface.Challange_83;

public class Square extends Shape{

    private int side;

    @Override
    public double calculateArea(){
        return side*side;
    }

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
