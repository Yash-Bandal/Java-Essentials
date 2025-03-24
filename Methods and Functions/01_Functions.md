# **Java Methods and Functions**

In Java, **methods** (also called functions in other languages) are blocks of code that perform a specific task and can be reused multiple times.

## **1. What is a Method?**
A method is a set of statements grouped together to perform an operation. It helps in **code reusability** and **modularity**.

### **Syntax of a Method:**
```java
returnType methodName(parameters) {
    // method body
    return value; // if return type is not void
}
```

---

## **2. Types of Methods in Java**

### **2.1 Predefined Methods (Built-in Methods)**
Java provides many built-in methods (e.g., `Math.sqrt()`, `System.out.println()`).

Example:
```java
public class Example {
    public static void main(String[] args) {
        int number = 25;
        System.out.println(Math.sqrt(number)); // Output: 5.0
    }
}
```

### **2.2 User-Defined Methods**
Programmers can create their own methods.

Example:
```java
public class Greetings {
    // User-defined method
    public static void sayHello() {
        System.out.println("Hello, Java!");
    }
    
    public static void main(String[] args) {
        sayHello(); // Calling the method
    }
}
```
**Output:**
```
Hello, Java!
```

---

## **3. Method Parameters and Return Types**
Methods can accept **parameters** (inputs) and return **values**.

### **3.1 Method with Parameters**
```java
public class SumExample {
    public static void add(int a, int b) { // Method with parameters
        System.out.println("Sum: " + (a + b));
    }
    
    public static void main(String[] args) {
        add(5, 10); // Calling method with arguments
    }
}
```
**Output:**
```
Sum: 15
```

### **3.2 Method with Return Type**
```java
public class SquareCalculator {
    public static int square(int num) {
        return num * num;
    }
    
    public static void main(String[] args) {
        int result = square(4);
        System.out.println("Square: " + result);
    }
}
```
**Output:**
```
Square: 16
```

---

## **4. Method Overloading**
A class can have **multiple methods with the same name** but different **parameters**.

Example:
```java
public class OverloadingExample {
    // Method with two int parameters
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Method with three int parameters
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        System.out.println(add(5, 10));     // Calls first method
        System.out.println(add(5, 10, 15)); // Calls second method
    }
}
```
**Output:**
```
15
30
```

---

## **5. Static vs. Non-Static Methods**

### **5.1 Static Methods** (Belong to the class, called without creating an object)
```java
public class StaticExample {
    public static void show() {
        System.out.println("This is a static method.");
    }
    
    public static void main(String[] args) {
        show(); // Directly calling static method
    }
}
```

### **5.2 Non-Static Methods** (Require an object to be called)
```java
public class NonStaticExample {
    public void display() {
        System.out.println("This is a non-static method.");
    }
    
    public static void main(String[] args) {
        NonStaticExample obj = new NonStaticExample(); // Creating object
        obj.display(); // Calling non-static method
    }
}
```

---

## **6. Recursive Methods**
A **method calling itself** is called **recursion**.

Example (Factorial Calculation):
```java
public class RecursionExample {
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    
    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));
    }
}
```
**Output:**
```
Factorial of 5: 120
```

---

## **7. Pass by Value in Java**
Java **always** passes arguments **by value**.

Example:
```java
public class PassByValueExample {
    public static void modify(int a) {
        a = a + 10;
    }
    
    public static void main(String[] args) {
        int num = 5;
        modify(num);
        System.out.println("Value after method call: " + num); // Remains 5
    }
}
```
**Output:**
```
Value after method call: 5
```

---

## **Summary Table**
| Concept | Description | Example |
|---------|-------------|---------|
| **Predefined Methods** | Built-in methods in Java | `Math.sqrt(25)` |
| **User-Defined Methods** | Created by the programmer | `void greet() {}` |
| **Method with Parameters** | Takes inputs | `void add(int a, int b)` |
| **Method with Return Type** | Returns a value | `int square(int x)` |
| **Method Overloading** | Same method name, different parameters | `add(int a, int b)`, `add(int a, int b, int c)` |
| **Static Method** | Called without object | `static void show()` |
| **Non-Static Method** | Requires an object to call | `void display()` |
| **Recursive Method** | Calls itself | `factorial(n)` |
| **Pass by Value** | Java passes copies of variables | `modify(int a)` |

---
