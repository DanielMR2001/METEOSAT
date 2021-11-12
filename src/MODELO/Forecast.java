package MODELO;

public class Forecast {

    private Object forecast;

    public Object getForecast() {
        return forecast;
    }

    public void setForecast(Object forecast) {
        this.forecast = forecast;
    }

    @Override
    public String toString() {
        return "Forecast [forecast=" + forecast + "]";
    }

}
