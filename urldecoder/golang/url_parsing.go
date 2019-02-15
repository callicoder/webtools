package main

import (
	"fmt"
	"log"
	"net/url"
)

func main() {
	u, err := url.Parse("https://www.website.com/person?name=Rajeev%20Singh&phone=%2B919999999999&phone=%2B628888888888")

	if err != nil {
		log.Fatal(err)
		return
	}

	fmt.Println("Scheme: ", u.Scheme)
	fmt.Println("Host: ", u.Host)

	queries := u.Query()
	fmt.Println("Query Strings: ")
	for key, value := range queries {
		fmt.Printf("  %v = %v\n", key, value)
	}
	fmt.Println("Path: ", u.Path)
}
