package behavioural.template;

public class CsvDataRenderer extends DataRenderer {
    @Override
    public String readData() {
        // parse xml file here
        return "Csv data";
    }

    @Override
    public String processData(String data) {
        // parse xml data here
        return "Processed " + data;
    }
}
