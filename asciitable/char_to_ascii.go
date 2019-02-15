package main

import "fmt"

func main() {
	asciiValue := 97
	character := rune(asciiValue)

	fmt.Printf("Character corresponding to Ascii Code %d = %c\n", asciiValue, character)
}
