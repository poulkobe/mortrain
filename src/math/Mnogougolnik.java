package math;

public class Mnogougolnik extends Shape {
    private static final String SHAPE_ID="Mngo-golnik";
    int Storona;
    int Storona2;
    @Override
    public void printInfo() {
        System.out.println("this mnogougolnik");
    }

    @Override
    public String getShapeID() {
        return SHAPE_ID;
    }
    public void setStorona(int inpStorona, int inpStorona2){
        Storona=inpStorona;
        Storona2=inpStorona2;
    }
    @Override
    public int getPerimert() {
        return 2*Storona+2*Storona2;
    }

}
