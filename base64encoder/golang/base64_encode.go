package main

import (
	"encoding/base64"
	"fmt"
)

func main() {
	data := "hello world123!?$"

	// Base64 Standard Encoding
	sEnc := base64.StdEncoding.EncodeToString([]byte(data))
	fmt.Println(sEnc)

	// Base64 Url Encoding
	uEnc := base64.URLEncoding.EncodeToString([]byte(data))
	fmt.Println(uEnc)

	// ====================================

	// Base64 Encoding without Padding
	swEnc := base64.RawStdEncoding.EncodeToString([]byte(data))
	fmt.Println(swEnc)

	// Base64 Url Encoding without Padding
	uwEnc := base64.RawURLEncoding.EncodeToString([]byte(data))
	fmt.Println(uwEnc)
}
