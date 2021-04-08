package structural.adapter;

public class WeatherAdapter {
    public int findCityAndGetTemp(int zipcode) {
        WeatherFinder finder = new WeatherFinderImpl();
        int temp = 0;
        if (zipcode == 11) {
            temp = finder.find("delhi");
        } else if (zipcode == 22) {
            temp = finder.find("mumbai");
        } else if (zipcode == 177) {
            temp = finder.find("shimla");
        }
        return temp;
    }
}
