package java11.httpClientAPI;

import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.ProxySelector;
import java.net.http.HttpClient;
import java.time.Duration;

public class HttpClientExample {
    public static void main(String[] args) {
        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .followRedirects(HttpClient.Redirect.NORMAL)
                .connectTimeout(Duration.ofSeconds(20))
                .proxy(ProxySelector.of(new InetSocketAddress("proxy.yourcompany.com", 80)))
                .authenticator(Authenticator.getDefault())
                .build();
        System.out.println(httpClient);
    }
}
