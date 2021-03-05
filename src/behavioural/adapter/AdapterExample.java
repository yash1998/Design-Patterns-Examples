package behavioural.adapter;

public class AdapterExample {
    public static void main(String[] args) {
        WeatherUI ui = new WeatherUI();
//        WeatherAdapter adapter = new WeatherAdapter();
//        ui.setAdapter(adapter);
        ui.showTemp(177);
    }
}
