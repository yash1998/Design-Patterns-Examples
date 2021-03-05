package behavioural.template;

public class TemplateExampleTest {
    public static void main(String[] args) {
        DataRenderer renderer1 = new XmlDataRenderer();
        renderer1.render();

        DataRenderer renderer2 = new CsvDataRenderer();
        renderer2.render();
    }
}
