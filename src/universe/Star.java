package universe;

public class Star implements Object {
    String name;

    String type;

    private Object[] objectStars;

    private int objectsCount=0;

    public Star(String name, String type) {
        this.name=name;
        this.type=type;
    }

    public String getTypeOfObject(){
        return type;
    }
    public String getNameOfObject(){
        return name;
    }





    public Object[] getListOfStart(){
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
}