package Questions.questions9;

import java.util.LinkedList;
import java.util.Stack;

public class CollectionsExample2 {
    static void workWithPerson(Person person) {
        System.out.println(person.name + " take your ticket and get out!");
    }

    public static void main(String[] args) {
        System.out.println("FIFO");
        LinkedList<Person> queueFIFO = new LinkedList<>();
        queueFIFO.add(new Person());
        queueFIFO.add(new Person());
        queueFIFO.add(new Person());
        workWithPerson(queueFIFO.poll());
        queueFIFO.add(new Person());
        workWithPerson(queueFIFO.poll());

        workWithPerson(queueFIFO.poll());
        queueFIFO.add(new Person());
        queueFIFO.add(new Person());
        workWithPerson(queueFIFO.poll());
        workWithPerson(queueFIFO.poll());
        workWithPerson(queueFIFO.poll());
        System.out.println();
        System.out.println("LIFO");
        System.out.println();

        Person.refreshCounter();

        Stack<Person> stackLIFO = new Stack<>();
        stackLIFO.push(new Person());
        stackLIFO.push(new Person());
        workWithPerson(stackLIFO.pop());
        stackLIFO.push(new Person());
        stackLIFO.push(new Person());
        workWithPerson(stackLIFO.pop());
        stackLIFO.push(new Person());
        workWithPerson(stackLIFO.pop());
        workWithPerson(stackLIFO.pop());
        stackLIFO.push(new Person());
        workWithPerson(stackLIFO.pop());
        workWithPerson(stackLIFO.pop());
    }
}
