package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        double fahrenheit  = (temperatureCelsius * 9.0/5.0) + 32.0;
        System.out.println(fahrenheit);
    }
}
