
import base64

encodedStr = "aGVsbG8gd29ybGQxMjMhPyQ="

# Standard Base64 Decoding
decodedBytes = base64.b64decode(encodedStr)
decodedStr = str(decodedBytes, "utf-8")
print(decodedStr)

# Url Safe Base64 Decoding
decodedBytes = base64.urlsafe_b64decode(encodedStr)
decodedStr = str(decodedBytes, "utf-8")
print(decodedStr)
