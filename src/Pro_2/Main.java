package Pro_2;

import ru.javaweb.webapp.model.Link;

public class Main {
    public static void main(String[] args){
        // обращаемся к конструктору
        Link l1 = new Link("test", "test.ru");
        Link l2 = l1;
        Link l3 = new Link(l2);
        // вывод полного пути класса l1
        System.out.println(l1.getClass());
        // проверим равенство объектов
        System.out.println(l1.equals(l2));
        System.out.println(l1.equals(l3));
    }
}
