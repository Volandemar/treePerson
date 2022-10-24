import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> listPerson = new ArrayList<>();
        listPerson.add(new Person("Nikolay", "Kuplinkov", 21));
        listPerson.add(new Person("Helena", "Kislovoskova", 29));
        listPerson.add(new Person("Olya", "Alientkova", 29));
        listPerson.add(new Person("Ivan", "Popov", 35));
        listPerson.add(new Person("Sergey", "Kuplinkov", 25));
        System.out.println("Список без сотритровки: " + listPerson);
        Collections.sort(listPerson, new sortPersonLength(4));
        System.out.println("Список после сортировки: " + listPerson);

    }
}