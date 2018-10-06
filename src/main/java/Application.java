import comparator.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Person> people = getListOfPeople();

        people.sort(Comparator.comparingInt(Person::getAge));
        people.sort(Comparator.comparing(Person::getFirstName));
        people.sort(Comparator.comparing(Person::isNinja));

        people.forEach(value->
                System.out.println(value.getFirstName() +"  \t\t"+ value.getAge())
        );

    }

    private static List<Person> getListOfPeople() {
        List<Person> people = new ArrayList<>();
        Person person1 = new Person("Sihle", "Zenzile", 36, true);
        Person person2 = new Person("Mphile", "Shoyisa", 26, false);
        Person person3 = new Person("Namhla", "Zaba", 25, false);
        Person person4 = new Person("Amanda", "Black", 22, true);
        Person person5 = new Person("Wendy", "Dadlana", 23, false);
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);

        return people;
    }
}
