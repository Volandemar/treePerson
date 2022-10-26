import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> listPerson = new ArrayList<>();
        listPerson.add(new Person("Николай", "Куплинов-Морозов", 21));
        listPerson.add(new Person("Елена", "Корпетова Великая", 29));
        listPerson.add(new Person("Оля", "Алетнова красна девица", 29));
        listPerson.add(new Person("Иван", "Попов из села Поповки", 35));
        listPerson.add(new Person("Сергей", "Коробкин-Мясников-Иванов", 25));
        System.out.println("Список без сотритровки: " + listPerson);
        Collections.sort(listPerson, new SortPersonLength(4));
        System.out.println("Список после сортировки: " + listPerson);



    }
}