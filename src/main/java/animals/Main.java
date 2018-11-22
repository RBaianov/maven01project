package animals;

//import animals.entities.*;
import animals.configs.MyConfig;
import animals.entities.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import weekdays.WeekDay;

public class Main {
    public static void main(String[] args) {
        //ApplicationContext context = new AnnotationConfigApplicationContext("animals.entities");
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Cat cat = context.getBean(Cat.class);
        Dog dog = (Dog) context.getBean("dog");
        cat.setName("Kisa");
        WeekDay weekDay = context.getBean(WeekDay.class);

        //Cat cat = context.getBean(Cat.class);
        //Dog dog = (Dog) context.getBean("dog");
        Parrot parrot = context.getBean("parrot-kesha", Parrot.class);

        System.out.println(cat.getName());
        System.out.println(dog.getName());
        System.out.println("Сегодня: " + weekDay.getWeekDayName() + "!");
        System.out.println(parrot.getName());

    }
}
