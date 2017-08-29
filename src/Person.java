public abstract class Person {
    private int age;

    private int salary;

    private int weight;

    private String name;

    private String surename;

    private Manager boss;

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


     public abstract Person[] getPersons();

}
