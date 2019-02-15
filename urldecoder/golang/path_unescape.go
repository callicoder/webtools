package main

import (
	"fmt"
	"log"
	"net/url"
)

func main() {
	path := "path%20with%3Freserved+characters"
	unescapedPath, err := url.PathUnescape(path)
	if err != nil {
		log.Fatal(err)
	}
	fmt.Println(unescapedPath)
}
