import java.util.Arrays;

public class Manager extends Person {
    Person[] stuff;

    String[] skillSet;

    int couterOfStuff;



    public void addPerson(Person newStuff) {
       if (stuff == null) {
            stuff = new Person[5];
        }
        if(couterOfStuff==stuff.length) {
            Person[] stuff2 = new Person[stuff.length*2];
            for (int i = 0; i < stuff.length; i++) {
                stuff2[i] = stuff[i];
            }
            stuff=stuff2;
        }

        stuff[couterOfStuff++]=newStuff;

    }

    @Override
    public String toString() {
        return "Manager{" +
                "stuff=" + Arrays.toString(stuff) +
                ", skillSet=" + Arrays.toString(skillSet) +
                ", couterOfStuff=" + couterOfStuff +
                '}';
    }

    public static void main(String[] args) {
        Person igorek= new Developer();
        //igorek.name="irorr";
        Manager igorIvanovich= new Manager();
        igorIvanovich.addPerson(igorek);
        igorIvanovich.stuff[0].printName();
        System.out.println(igorIvanovich);
    }
//???? я забыл то это !!!!!!!!!
    @Override
    public Person[] getPersons(){
        for(Person person: stuff) {
            person.getPersons();
        }
         return stuff;
    }


}

