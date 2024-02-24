package mainpackage;

public class Person {
    public static int numOfPersons = 0;
    private String name;
    int age;

    Person (String name,int age) {
        this.name = name;
        this.age = age;
        Person.numOfPersons++;
    }

    public Person () {
        this("",0);
    }

}
