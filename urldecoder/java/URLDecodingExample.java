import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class URLDecodingExample {

    // Decodes a URL encoded string using UTF-8 encoding scheme
    public static String decodeValue(String value) {
        try {
            return URLDecoder.decode(value, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException ex) {
            throw new RuntimeException(ex.getCause());
        }
    }

    public static void main(String[] args) {
        String encodedValue = "Hell%C3%B6%20W%C3%B6rld%40Java";

        // Decoding the URL encoded string
        String decodedValue = decodeValue(encodedValue);

        System.out.println(decodedValue);
    }
}