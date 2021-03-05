package behavioural.adapter;

public class WeatherUI {

//    private WeatherAdapter adapter;
//
//    public void setAdapter(WeatherAdapter adapter) {
//        this.adapter = adapter;
//    }

    public void showTemp(int zipcode) {
//        System.out.println("Temp is " + adapter.findCityAndGetTemp(zipcode));
        WeatherAdapter adapter = new WeatherAdapter();
        System.out.println("Temp is " + adapter.findCityAndGetTemp(zipcode));
    }
}
