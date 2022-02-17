package app.coach;

public class CricketCoach implements Coach {

    private HappyFortuneService fortuneService;

    public CricketCoach(HappyFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public CricketCoach() {
        System.out.println("no-arg constructor invoked");
    }

    public void setFortuneService(HappyFortuneService fortuneService) {
        System.out.println("inside setter method");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "practice fast bowling";
    }

    @Override
    public String getDailyFortune() {
        return "";
    }
}
