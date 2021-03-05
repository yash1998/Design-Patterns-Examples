package creational.builder;

public class HttpClient {
    private final String method;
    private final String url;
    private final String username;
    private final String password;
    private final String headers;
    private final String body;

    public HttpClient(String method, String url, String username, String password, String headers, String body) {
        this.method = method;
        this.url = url;
        this.username = username;
        this.password = password;
        this.headers = headers;
        this.body = body;
    }

    @Override
    public String toString() {
        return "HttpClient{" +
                "method='" + method + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", headers='" + headers + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    public HttpClient(HttpClientBuilder httpClientBuilder) {
        this.method = httpClientBuilder.method;
        this.url = httpClientBuilder.url;
        this.username = httpClientBuilder.username;
        this.password = httpClientBuilder.password;
        this.headers = httpClientBuilder.headers;
        this.body = httpClientBuilder.body;
    }

    public static class HttpClientBuilder {
        private String method;
        private String url;
        private String username;
        private String password;
        private String headers;
        private String body;

        public HttpClientBuilder method(String method) {
            this.method = method;
            return this;
        }

        public HttpClientBuilder url(String url) {
            this.url = url;
            return this;
        }

        public HttpClientBuilder username(String username) {
            this.username = username;
            return this;
        }

        public HttpClientBuilder password(String password) {
            this.password = password;
            return this;
        }

        public HttpClientBuilder headers(String headers) {
            this.headers = headers;
            return this;
        }

        public HttpClientBuilder body(String body) {
            this.body = body;
            return this;
        }

        public HttpClient build() {
            return new HttpClient(this);
        }
    }
}
