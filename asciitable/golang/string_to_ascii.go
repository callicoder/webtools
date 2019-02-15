package main

import "fmt"

func main() {
	str := "GOLANG"
	runes := []rune(str)

	var result []int

	for i := 0; i < len(runes); i++ {
		result = append(result, int(runes[i]))
	}

	fmt.Println(result)
}
