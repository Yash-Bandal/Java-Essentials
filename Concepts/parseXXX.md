# **Understanding `parseInt` and Related Methods in Java**

Java provides several methods in wrapper classes to convert **strings into primitive data types** and **vice versa**. These methods are useful for handling user input, data conversion, and processing numerical values stored as strings.

---

## **1. `parseXxx()` Methods**
These methods convert a **string representation of a number** into a **primitive data type**.  

### **Example: `Integer.parseInt()`**
```java
public class ParseExample {
    public static void main(String[] args) {
        String numberStr = "100";

        // Convert String to int
        int number = Integer.parseInt(numberStr);

        System.out.println("Converted int: " + number); // Output: 100
    }
}
```
✅ Works for numeric strings only.  
❌ Throws `NumberFormatException` for non-numeric strings.

### **Other `parseXxx()` Methods**
| Wrapper Class | Method                | Returns |
|--------------|-----------------------|---------|
| `Integer`    | `Integer.parseInt(s)`  | `int`   |
| `Double`     | `Double.parseDouble(s)`| `double`|
| `Float`      | `Float.parseFloat(s)`  | `float` |
| `Long`       | `Long.parseLong(s)`    | `long`  |
| `Short`      | `Short.parseShort(s)`  | `short` |
| `Byte`       | `Byte.parseByte(s)`    | `byte`  |

---

## **2. `valueOf()` Method**
Similar to `parseXxx()`, but it returns a **wrapper object** instead of a primitive.

### **Example: `Integer.valueOf()`**
```java
public class ValueOfExample {
    public static void main(String[] args) {
        String str = "200";

        // Convert String to Integer object
        Integer obj = Integer.valueOf(str);

        System.out.println("Integer object: " + obj);
    }
}
```
✅ Useful when working with collections like `ArrayList<Integer>`.  

### **Comparison of `parseInt()` vs. `valueOf()`**
| Method           | Returns  | Example Output |
|-----------------|----------|---------------|
| `parseInt("123")`  | `int`      | `123`        |
| `valueOf("123")`   | `Integer`  | `123`        |

---

## **3. `xxxValue()` Methods**
Used to convert **wrapper objects to primitive types**.

### **Example: `intValue()`**
```java
public class XxxValueExample {
    public static void main(String[]args) {
        Integer obj = 50;

        // Convert Integer to int
        int num = obj.intValue();

        System.out.println("Primitive int: " + num); // Output: 50
    }
}
```

### **Common `xxxValue()` Methods**
| Wrapper Class | Method            | Returns |
|--------------|------------------|---------|
| `Integer`    | `intValue()`      | `int`   |
| `Double`     | `doubleValue()`   | `double`|
| `Float`      | `floatValue()`    | `float` |
| `Long`       | `longValue()`     | `long`  |

---

### **Quick Summary**
| Method        | Purpose |
|--------------|---------|
| `parseXxx()` | Convert String → primitive |
| `valueOf()`  | Convert String → Wrapper object |
| `xxxValue()` | Convert Wrapper → primitive |

---


