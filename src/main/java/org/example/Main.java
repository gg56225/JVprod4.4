package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();

        // Добавление
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);
        personDAO.addPerson(person1);
        personDAO.addPerson(person2);

        // Обновление
        person1 = personDAO.getPerson(person1.getId());
        person1.setName("Alice Updated");
        personDAO.updatePerson(person1);

        // Получение
        Person retrievedPerson = personDAO.getPerson(person1.getId());
        System.out.println("Retrieved Person: " + retrievedPerson);

        // Удаление
        personDAO.deletePerson(person1.getId());

        // Получение всех
        List<Person> allPersons = personDAO.getAllPersons();
        System.out.println("All Persons: " + allPersons);
    }
}
