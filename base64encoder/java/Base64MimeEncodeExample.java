import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;

class Base64MimeEncodeExample {

private static String base64MimeEncode(String value) {
    try {
        return Base64.getMimeEncoder()
                    .encodeToString(value.getBytes(StandardCharsets.UTF_8.toString()));        
    } catch(UnsupportedEncodingException ex) {
        throw new RuntimeException(ex);
    }
}  

    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder();
        for (int count = 0; count < 10; ++count) {
            buffer.append(UUID.randomUUID().toString());
        }
        System.out.println(base64MimeEncode(buffer.toString()));
    }
}