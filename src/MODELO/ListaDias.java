package MODELO;

import java.util.*;

public class ListaDias {
	private ArrayList forecastDay;

	public ArrayList getForecastDay() {
		return forecastDay;
	}

	public void setForecastDay(ArrayList forecastDay) {
		this.forecastDay = forecastDay;
	}

	@Override
	public String toString() {
		return "ListaDias [forecastDay=" + forecastDay + "]";
	}

}
