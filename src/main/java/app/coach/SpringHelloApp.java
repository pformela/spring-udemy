package app.coach;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringHelloApp {

    public static void main(String[] args) {
        // załadowanie pliku konfiguracyjnego xml
        FileSystemXmlApplicationContext context =
                new FileSystemXmlApplicationContext("WEB-INF/config/applicationContext.xml");

//        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach tennisCoach = context.getBean("myTennisCoach", Coach.class);

        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyFortune());

        context.close();
    }

}
