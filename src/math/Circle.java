package math;


public class Circle extends Shape{

    private static final String SHAPE_ID="Circle";
    private final int radius;
    int Radius=8;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public void printInfo() {
        System.out.println("this circle");
        System.out.println(descriptption);
    }

    public static void main(String[] args) {
        Shape[] figures=new Shape[4];
        figures[0]=new Triangle();
        figures[1]=new Kvadrat();
        figures[2]=new Mnogougolnik();
        figures[3]=new Circle(8);
        for (Shape shape:figures
             ) {
            shape.printInfo();
        }
    }

    @Override
    public String getShapeID() {
        return SHAPE_ID;
    }

    @Override
    public int getPerimert() {
        return (int)(2*3.14*Radius*Radius);
    }
}
