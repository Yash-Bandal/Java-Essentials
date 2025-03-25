### 1. can we create instationize abstraction?
- In Java, we cannot instantiate an abstract class directly because an abstract class
-  is meant to be a blueprint for other classes. However, there are a few ways to use an abstract class indirectly:

### 2. Why Java Does Not Support Pointers?
- Memory Safety – Prevents memory corruption & segmentation faults.
- Security – Avoids unauthorized memory access.
- Garbage Collection – JVM manages memory automatically.
- Simplicity – Eliminates pointer-related complexity.
- Platform Independence – Ensures portability across different systems.
### 3. What Replaces Pointers in Java?
Java uses references instead of pointers. References allow access to objects without exposing memory addresses.

```java
class Example {
    int num;
}

public class Main {
    public static void main(String[] args) {
        Example obj1 = new Example();  // obj1 is a reference
        obj1.num = 10;

        Example obj2 = obj1;  // obj2 refers to the same object
        obj2.num = 20;

        System.out.println(obj1.num);  // Output: 20 (Both obj1 and obj2 refer to the same object)
    }
}

```

### 4. Difference Between public class and class in Java

| Feature              | `public class`                          | `class` (default access)   (Package - private)             |
|----------------------|----------------------------------------|-----------------------------------------|
| **Access Level**     | Accessible from anywhere (any package). | Accessible only within the same package. |
| **Usage**           | Used when a class needs to be global (accessible in different packages). | Used when a class should be restricted to a specific package. |
| **File Naming Rule** | The file must have the same name as the public class (e.g., `MyClass.java` for `public class MyClass`). | No such restriction; multiple non-public classes can exist in the same file. |
