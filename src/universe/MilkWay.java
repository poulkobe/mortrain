package universe;

public class MilkWay implements Universe {

    private static final String name="MilkWay";

    private Object[] objectStars;

    private int objectsCount=0;




    public Object[] getListOfStart(){
//        if(objectStars!=null){
//            for(Object objectOfUniverse:objectStars){
//                    return objectOfUniverse.getListOfStart();
//            }
//        }

        return objectStars;
    }


    public void addObject(Object object){
        ++objectsCount;
        if (objectStars ==null){
            objectStars =new Object[1];
            objectStars[0]=object;
        }
        if (objectStars.length<objectsCount){
            Object[] ObjectStars2=new Object[objectsCount];

            for (int j = 0; j < objectStars.length; j++) {
                ObjectStars2[j]= objectStars[j];
            }
            ObjectStars2[objectStars.length+1]=object;
            objectStars =ObjectStars2;
        }
    }
    public String getUniverseName(){
        return "Name";
    }

    public static void main(String[] args) {
        MilkWay milkway = new MilkWay();
        System.out.println("hello from - "+milkway.getListOfStart());
       // System.out.println(getUniverseName());
        Luna luna=new Luna("luna", "sputnik");
        Planeta planetaZemplya = new Planeta("Zemlya", "planeta");
        Planeta planetaMars = new Planeta("Mars", "planeta");
        Planeta planetaVenera = new Planeta("Venera", "planeta");
        planetaZemplya.addObject(luna);
        Star Solnce = new Star("solnce", "middle star");
        Solnce.addObject(planetaZemplya);
        Solnce.addObject(planetaVenera);
        Solnce.addObject(planetaMars);
        //milkway.addObject(planetaZemplya);
        milkway.addObject(Solnce);
        Star Vinus = new Star("vinus", "yellow star");
        Vinus.addObject(planetaZemplya);
        milkway.addObject(Vinus);

        milkway.getPlanetStars();
        milkway.getUniverseName();
    }

     public void getPlanetStars(){
        int StarNum=0;
        for (Object checkingstar:objectStars){
            System.out.println(checkingstar.getNameOfObject());
            System.out.println(checkingstar.getTypeOfObject());

        }
}




}
