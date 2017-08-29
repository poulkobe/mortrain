package math;

public class Kvadrat extends Shape {
    public int Storona;
    private static final String SHAPE_ID="Kvadrat";
    @Override
    public void printInfo() {
        System.out.println("this kvadrat");
    }

    @Override
    public String getShapeID() {
        return SHAPE_ID;
    }
    public void setStorona(int inpStorona){
        Storona=inpStorona;
    }
    @Override
    public int getPerimert() {
        return 4*Storona;
    }
}
