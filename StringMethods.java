1. String Length and Empty Checks
length(): Returns the length of the string.

java
Copy
String str = "Hello";
System.out.println(str.length()); // Output: 5
isEmpty(): Checks if the string is empty.

java
Copy
String str = "";
System.out.println(str.isEmpty()); // Output: true
2. Character Access
charAt(int index): Returns the character at the specified index.

java
Copy
String str = "Hello";
System.out.println(str.charAt(1)); // Output: 'e'
codePointAt(int index): Returns the Unicode code point of the character at the specified index.

java
Copy
String str = "Hello";
System.out.println(str.codePointAt(1)); // Output: 101 (Unicode for 'e')
3. String Comparison
equals(Object obj): Compares the string to another object.

java
Copy
String str1 = "Hello";
String str2 = "hello";
System.out.println(str1.equals(str2)); // Output: false
equalsIgnoreCase(String str): Compares strings, ignoring case.

java
Copy
String str1 = "Hello";
String str2 = "hello";
System.out.println(str1.equalsIgnoreCase(str2)); // Output: true
compareTo(String str): Compares strings lexicographically.

java
Copy
String str1 = "apple";
String str2 = "banana";
System.out.println(str1.compareTo(str2)); // Output: -1 (apple < banana)
4. String Searching
contains(CharSequence s): Checks if the string contains a specific sequence.

java
Copy
String str = "Hello World";
System.out.println(str.contains("World")); // Output: true
indexOf(String str): Returns the index of the first occurrence of a substring.

java
Copy
String str = "Hello World";
System.out.println(str.indexOf("World")); // Output: 6
startsWith(String prefix): Checks if the string starts with a specific prefix.

java
Copy
String str = "Hello World";
System.out.println(str.startsWith("Hello")); // Output: true
endsWith(String suffix): Checks if the string ends with a specific suffix.

java
Copy
String str = "Hello World";
System.out.println(str.endsWith("World")); // Output: true
5. Substring Extraction
substring(int beginIndex): Extracts a substring from the specified index to the end.

java
Copy
String str = "Hello World";
System.out.println(str.substring(6)); // Output: "World"
substring(int beginIndex, int endIndex): Extracts a substring between two indices.

java
Copy
String str = "Hello World";
System.out.println(str.substring(0, 5)); // Output: "Hello"
6. String Manipulation
concat(String str): Concatenates two strings.

java
Copy
String str1 = "Hello";
String str2 = " World";
System.out.println(str1.concat(str2)); // Output: "Hello World"
replace(char oldChar, char newChar): Replaces all occurrences of a character.

java
Copy
String str = "Hello";
System.out.println(str.replace('l', 'x')); // Output: "Hexxo"
toLowerCase(): Converts the string to lowercase.

java
Copy
String str = "Hello";
System.out.println(str.toLowerCase()); // Output: "hello"
toUpperCase(): Converts the string to uppercase.

java
Copy
String str = "Hello";
System.out.println(str.toUpperCase()); // Output: "HELLO"
trim(): Removes leading and trailing whitespace.

java
Copy
String str = "  Hello  ";
System.out.println(str.trim()); // Output: "Hello"
7. String Splitting and Joining
split(String regex): Splits the string into an array based on a regex.

java
Copy
String str = "apple,banana,orange";
String[] fruits = str.split(",");
System.out.println(Arrays.toString(fruits)); // Output: ["apple", "banana", "orange"]
join(CharSequence delimiter, CharSequence... elements): Joins strings with a delimiter.

java
Copy
String result = String.join("-", "apple", "banana", "orange");
System.out.println(result); // Output: "apple-banana-orange"
8. String Formatting
format(String format, Object... args): Formats a string.

java
Copy
String str = String.format("Name: %s, Age: %d", "John", 25);
System.out.println(str); // Output: "Name: John, Age: 25"
9. String Conversion
toCharArray(): Converts the string to a character array.

java
Copy
String str = "Hello";
char[] chars = str.toCharArray();
System.out.println(Arrays.toString(chars)); // Output: ['H', 'e', 'l', 'l', 'o']
getBytes(): Converts the string to a byte array.

java
Copy
String str = "Hello";
byte[] bytes = str.getBytes();
System.out.println(Arrays.toString(bytes)); // Output: [72, 101, 108, 108, 111]
10. Miscellaneous
matches(String regex): Checks if the string matches a regex.

java
Copy
String str = "12345";
System.out.println(str.matches("\\d+")); // Output: true
isBlank(): Checks if the string is empty or contains only whitespace.

java
Copy
String str = "  ";
System.out.println(str.isBlank()); // Output: true
repeat(int count): Repeats the string a specified number of times.

java
Copy
String str = "Hello";
System.out.println(str.repeat(3)); // Output: "HelloHelloHello"
