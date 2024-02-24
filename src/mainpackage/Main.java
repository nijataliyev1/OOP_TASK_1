package mainpackage;

import additionalpackage.Account;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Nijat",18);
//        Account account1 = new Account();
        Account account2 = new Account("Nijat Aliyev",100.0);

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
//        System.out.println("Account.bank = " + Account.bank); // bank is default
        System.out.println();

        // account2
        System.out.println("account2 object");
//        System.out.println("account2.bank = " + account2.bank); // bank is default
        System.out.println("account2.owner = " + account2.owner);
//        System.out.println("account2.balance = " + account2.balance); // balance is default
        System.out.println();
    }
}
