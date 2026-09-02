import java.time.LocalDate;

public class WeatherNote implements Describable{
    private LocalDate data;
    private double temperatureC;
    private String conditions;

    public WeatherNote(LocalDate date, double temperatureC, String conditions){
        this.data = data;
        this.temperatureC =temperatureC;
        this.conditions = conditions;
    }

    @Override
    public String describe() {
        return String.format("Weather on %: %.1f degree C, %s", data, temperatureC, conditions);
    }
}
