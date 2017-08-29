package math;

public class Triangle extends Shape {
    private static final String SHAPE_ID="Triangle";
    int Storona1;
    int Storona2;
    int Storona3;

    @Override
    public void printInfo() {
        System.out.println("this triangle");
    }

    @Override
    public String getShapeID() {
        return SHAPE_ID;
    }

    @Override
    public int getPerimert() {
        return Storona1*Storona2+Storona3;
    }
}
