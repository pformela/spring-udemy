package app.coach;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String[] args) {
        FileSystemXmlApplicationContext context =
                new FileSystemXmlApplicationContext("/WEB-INF/config/applicationContext.xml");

        Coach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);

        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyFortune());

        context.close();
    }
}
