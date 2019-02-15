class CharToAsciiCodeExample {
    public static void main(String[] args) {
        char ch = 'A';
        int asciiValue = ch;  // char is automatically casted to int

        System.out.printf("Ascii Value of %c = %d\n", ch, asciiValue);
    }
}
