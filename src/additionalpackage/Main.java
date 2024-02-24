package additionalpackage;

import mainpackage.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Account account1 = new Account();
        Account account2 = new Account("Ali Aliyev",2);

        // Person
        System.out.println("Person class");
        System.out.println("Person.numOfPersons = " + Person.numOfPersons);
        System.out.println();


        // person
        System.out.println("person object");
        System.out.println("person.numOfPersons = " + person.numOfPersons);
//        System.out.println(person.name);  // name is private
//        System.out.println("Age of person: " + person.age); // name is default
        System.out.println();

        // Account
        System.out.println("Account class");
        System.out.println("Account.bank = " + Account.bank);
        System.out.println();

        // account1
        System.out.println("account1 object");
        System.out.println("account1.bank = " + account1.bank);
        System.out.println("account1.owner = " + account1.owner);
        System.out.println("account1.balance = " + account1.balance);
        System.out.println();

        // account2
        System.out.println("account2 object");
        System.out.println("account2.bank = " + account2.bank);
        System.out.println("account2.owner = " + account2.owner);
        System.out.println("account2.balance = " + account2.balance);
        System.out.println();
    }
}
