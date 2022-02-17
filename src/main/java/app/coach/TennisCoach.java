package app.coach;

public class TennisCoach implements Coach {

    private HappyFortuneService fortuneService;

    public TennisCoach() {}

    public TennisCoach(HappyFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune() {
        return "not a lucky day, sorry";
    }

    public String getDailyWorkout() {
        return "run 5km";
    }
}
