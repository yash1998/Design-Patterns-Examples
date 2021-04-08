package structural.adapter;

public class WeatherFinderImpl implements WeatherFinder {

    @Override
    public int find(String city) {
        if (city.equalsIgnoreCase("delhi")) {
            return 23;
        } else if (city.equalsIgnoreCase("mumbai")) {
            return 30;
        } else if (city.equalsIgnoreCase("shimla")) {
            return 12;
        }
        return 0;
    }

}
