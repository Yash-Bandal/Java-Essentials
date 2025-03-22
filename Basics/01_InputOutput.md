# **Java Input and Output (I/O) Basics**

Java provides various ways to take input and display output. The most common methods are using `Scanner` for input and `System.out.println()` for output.

---

## **1. Output in Java (`System.out.println()`)**
Java uses `System.out.println()` to print text to the console.

### **Example: Printing Output**
```java
public class OutputExample {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");  // Prints with a new line
        System.out.print("Welcome to Java!"); // Prints without a new line
        System.out.printf("%nFormatted output: %d", 100); // Prints formatted output
    }
}
```
### **Output:**
```
Hello, Java!
Welcome to Java!Formatted output: 100
```

### **Other Output Methods**
| Method               | Description |
|---------------------|-------------|
| `System.out.print()` | Prints text without a new line |
| `System.out.println()` | Prints text with a new line |
| `System.out.printf()` | Formats and prints output |

---

## **2. Input in Java (`Scanner` Class)**
Java provides the `Scanner` class to take user input from the keyboard.

### **Example: Taking Input**
```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Reads a string
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Reads an integer
        
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        
        scanner.close(); // Close the scanner
    }
}
```

### **Example Input/Output:**
```
Enter your name: John
Enter your age: 25
Hello, John! You are 25 years old.
```

### **Common `Scanner` Methods**
| Method               | Description |
|---------------------|-------------|
| `nextInt()`         | Reads an `int` value |
| `nextDouble()`      | Reads a `double` value |
| `nextLine()`        | Reads a full line of text |
| `next()`            | Reads a single word |
| `nextBoolean()`     | Reads a `boolean` value (true/false) |
| `next().charAt(index)`    | Reads a `character`|

---

## **3. Input Handling for Different Data Types**
### **Example: Taking Different Types of Input**
```java
import java.util.Scanner;

public class MultiInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        System.out.print("Enter a decimal number: ");
        double decimal = scanner.nextDouble();

        System.out.print("Enter a single word: ");
        String word = scanner.next();

        scanner.nextLine(); // Consume newline left-over

        System.out.print("Enter a full sentence: ");
        String sentence = scanner.nextLine();

        System.out.println("You entered: " + num + ", " + decimal + ", " + word + ", " + sentence);
        scanner.close();
    }
}
```

### **Example Input/Output:**
```
Enter an integer: 10
Enter a decimal number: 5.75
Enter a single word: Java
Enter a full sentence: Java is awesome!
You entered: 10, 5.75, Java, Java is awesome!
```

---

## **4. BufferedReader for Faster Input**
If performance is a concern, use `BufferedReader` for fast input reading.

### **Example: Using BufferedReader**
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a string: ");
        String input = reader.readLine();

        System.out.println("You entered: " + input);
    }
}
```

## Escaope Sequence
| Escape Sequence | Description                      |
|----------------|----------------------------------|
| `\t`          | Inserts a tab                    |
| `\b`          | Inserts a backspace              |
| `\n`          | Inserts a newline                |
| `\r`          | Inserts a carriage return        |
| `\f`          | Inserts a form feed              |
| `\'`          | Inserts a single quote (`'`)     |
| `\"`          | Inserts a double quote (`"`)     |
| `\\`          | Inserts a backslash (`\`)        |

System.out.println("welcome to \\"GeeksforGeeks\\"");
---

### **Quick Summary**
| Concept | Method |
|---------|--------|
| Output | `System.out.print()`, `System.out.println()`, `System.out.printf()` |
| Input (Simple) | `Scanner` (`nextInt()`, `nextDouble()`, `nextLine()`) |
| Input (Fast) | `BufferedReader.readLine()` |

---
