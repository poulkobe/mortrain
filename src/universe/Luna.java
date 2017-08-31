package universe;

public class Luna implements Object {
String name;
String type;

    public Luna(String name, String type) {
        this.name=name;
        this.type=type;
    }

    public String getTypeOfObject(){
        return type;
    }
    public String getNameOfObject(){
      return name;
    }




  //  Object[] getListOfObjects();
}
