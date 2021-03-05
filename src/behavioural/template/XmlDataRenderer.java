package behavioural.template;

public class XmlDataRenderer extends DataRenderer {
    @Override
    public String readData() {
        // parse xml file here
        return "Xml data";
    }

    @Override
    public String processData(String data) {
        // parse xml data here
        return "Processed " + data;
    }
}
