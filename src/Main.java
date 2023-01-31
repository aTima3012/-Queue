import javax.annotation.processing.Generated;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Person person;

        Queue<Person> list = new LinkedList<>(generateClients());

                while (!list.isEmpty()) {
                    person = list.poll();

                    if (person.ticket != 0) {
                        System.out.println(person + " прокатился на атракционе ");
                        person.ticket -=1;
                        list.offer(person);

                    }
                }
        }
        public static List<Person>generateClients() {
        List<Person> list = new LinkedList<>();
        list.add(new Person("Наташа", "Иванова", 6));
        list.add(new Person("Иммануил", "Кант", 8));
        list.add(new Person("Козьма", "Прутков", 4));
        list.add(new Person("Фёдор", "Конюхов", 3));
        list.add(new Person("Янка", "Дягилева", 9));
        return list;
    }
}