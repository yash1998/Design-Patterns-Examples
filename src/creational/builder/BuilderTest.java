package creational.builder;

public class BuilderTest {
    public static void main(String[] args) {
        HttpClient client1 = new HttpClient("POST", "http://test.com", null, null, null, "{}");
        HttpClient client2 = new HttpClient.HttpClientBuilder()
                .body("{}")
                .method("POST")
                .url("http://test.com")
                .build();
        System.out.println(client1);
        System.out.println(client2);
    }
}
