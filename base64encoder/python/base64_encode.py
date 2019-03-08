import base64

data = "abc123!?$*&()'-=@~"

# Standard Base64 Encoding
encodedBytes = base64.b64encode(data.encode("utf-8"))
encodedStr = str(encodedBytes, "utf-8")
print(encodedStr)

# URL and Filename Safe Base64 Encoding
urlSafeEncodedBytes = base64.urlsafe_b64encode(data.encode("utf-8"))
urlSafeEncodedStr = str(urlSafeEncodedBytes, "utf-8")
print(urlSafeEncodedStr)
