package java11.httpClientAPI;

import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.ProxySelector;
import java.net.http.HttpClient;
import java.time.Duration;

/**
 * The introduction of the HttpClient API in Java 11 marked a significant update from the older HttpURLConnection class
 * that was commonly used in Java 8 and earlier versions. This new API, part of the java.net.http package, brought several
 * new features and improvements, making HTTP requests and processing HTTP responses more efficient and easier to handle.
 * Here are some of the key features and enhancements:
 * HTTP/2 Support: Java 11's HttpClient natively supports the more efficient HTTP/2 protocol, unlike Java 8.
 * Asynchronous Programming: It allows for asynchronous HTTP requests, enabling non-blocking operations and better resource utilization.
 * Modern API Design: The API is more modern and fluent, using a builder pattern for ease of use, a significant improvement over Java 8's HttpURLConnection.
 * WebSocket Support: Java 11 includes a new WebSocket API for real-time, bidirectional communication.
 * Improved Timeout and Error Handling: Enhanced mechanisms for handling timeouts and HTTP responses are provided.
 */
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
