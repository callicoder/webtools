package main

import "fmt"

func main() {
	c := 'A' // rune (characters in Go are represented using `rune` data type)
	asciiValue := int(c)

	fmt.Printf("Ascii Value of %c = %d\n", c, asciiValue)
}
