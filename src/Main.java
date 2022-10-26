import java.util.ArrayList;
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

        int numberWords = 3;

        listPerson.sort((o1, o2) -> {
            int peopleLength1 = o1.getSurname().split("(?U)\\W+").length;
            int peopleLength2 = o2.getSurname().split("(?U)\\W+").length;
            if ((peopleLength1 >= numberWords) & (peopleLength2 >= numberWords)) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
            if (peopleLength1 == peopleLength2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
            if (peopleLength1 > peopleLength2) {
                return 1;
            } else if (peopleLength1 < peopleLength2) {
                return -1;
            }
            return 0;
        });
        System.out.println("Список после сортировки: " + listPerson);


    }
}