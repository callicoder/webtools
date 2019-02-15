package main

import (
	"fmt"
	"log"
	"net/url"
)

func main() {
	encodedValue := "Hell%C3%B6+W%C3%B6rld%40Golang"
	parsedValue, err := url.QueryUnescape(encodedValue)
	if err != nil {
		log.Fatal(err)
		return
	}
	fmt.Println(parsedValue)
}
