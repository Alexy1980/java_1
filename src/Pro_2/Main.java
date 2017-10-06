package Pro_2;

import ru.javaweb.webapp.model.Link;

import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static void main(String[] args){
        // обращаемся к конструктору
        Link l1 = new Link("test", "test.ru");
        AtomicReference<Link> l2 = new AtomicReference<>(l1);
        Link l3 = new Link(l2.get());
        // вывод полного пути класса l1
        System.out.println(l1.getClass());
        // проверим равенство объектов
        System.out.println(l1.equals(l2.get()));
        System.out.println(l1.equals(l3));
    }
}
