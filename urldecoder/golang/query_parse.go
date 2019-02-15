package main

import (
	"fmt"
	"log"
	"net/url"
)

func main() {
	queryStr := "name=Rajeev%20Singh&phone=%2B9199999999&phone=%2B628888888888"
	params, err := url.ParseQuery(queryStr)
	if err != nil {
		log.Fatal(err)
		return
	}

	fmt.Println("Query Params: ")
	for key, value := range params {
		fmt.Printf("  %v = %v\n", key, value)
	}
}
