public class Person {
    private int age;

    public int salary;

    public int weight;

    public String name;

    public String surename;

    public Person(int age, int salary, int weight, String name, String surename) {
        this.age = age;
        this.salary = salary;
        this.weight = weight;
        this.name = name;
        this.surename = surename;
    }
    public void printName() {
        System.out.println(name);
    }

    public Person() {
    }

    public static void main(String[] args) {
        Person igor = new Person(5,1111,55, "Igor", "Bakums");
        Person[] massIgor = new Person[2];
        massIgor[0]=new Person(5,1111,55, "Igor", "Bakums");
        massIgor[1]=new Person(15,2111,155, "DIgor", "DBakums");
        massIgor[0].printName();
        Developer Vano = new Developer();
        Vano.numberOfLines=17;
        Vano.name="devEgor";
        Vano.printName();

    }

}
