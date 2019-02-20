package main

import (
	"encoding/base64"
	"fmt"
)

func main() {
	data := "hello:world!?$*&()'-=@~"

	// Base64 Standard Decoding
	sEnc := base64.StdEncoding.EncodeToString([]byte(data))
	sDec, err := base64.StdEncoding.DecodeString(sEnc)
	if err != nil {
		fmt.Printf("Error decoding string: %s ", err.Error())
		return
	}
	fmt.Println(sDec)

	// Base64 Url Decoding
	uEnc := base64.URLEncoding.EncodeToString([]byte(data))
	uDec, err := base64.URLEncoding.DecodeString(uEnc)
	if err != nil {
		fmt.Printf("Error decoding string: %s ", err.Error())
		return
	}
	fmt.Println(uDec)

}
