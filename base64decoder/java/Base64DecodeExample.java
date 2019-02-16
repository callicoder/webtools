import java.nio.charset.StandardCharsets;
import java.util.Base64;

class Base64DecodeExample {

    private static String base64Decode(String value) {
        try {
            byte[] decodedValue = Base64.getDecoder().decode(value);
            return new String(decodedValue, StandardCharsets.UTF_8.toString());        
        } catch(UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
    }

    private static String base64UrlDecode(String value) {
        try {
            byte[] decodedValue = Base64.getUrlDecoder().decode(value);
            return new String(decodedValue, StandardCharsets.UTF_8.toString());        
        } catch(UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
    }

    private static String base64Encode(String value) {
        try {
            return Base64.getEncoder()
                        .encodeToString(value.getBytes(StandardCharsets.UTF_8.toString()));        
        } catch(UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
    }

    private static String base64UrlEncode(String value) {
        try {
            return Base64.getUrlEncoder()
                        .encodeToString(value.getBytes(StandardCharsets.UTF_8.toString()));
        } catch(UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
    }
    public static void main(String[] args) {
        String data = "Hello World !?$%";

        encodedData = base64Encode(data);
        System.out.println(base64Decode(encodedData));

        urlEncodedData = base64UrlEncode(data);
        System.out.println(base64UrlDecode(urlEncodedData));
    }
}