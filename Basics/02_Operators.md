# **Java Operators**

Operators in Java are symbols that perform operations on variables and values. Java provides different types of operators:

---

## **1. Arithmetic Operators**
Used for mathematical operations.

| Operator | Description | Example (`a = 10, b = 5`) | Output |
|----------|-------------|-----------------|--------|
| `+` | Addition | `a + b` | `15` |
| `-` | Subtraction | `a - b` | `5` |
| `*` | Multiplication | `a * b` | `50` |
| `/` | Division | `a / b` | `2` |
| `%` | Modulus (remainder) | `a % b` | `0` |

### **Example Code:**
```java
public class ArithmeticExample {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
    }
}
```

---

## **2. Relational (Comparison) Operators**
Used to compare values. Returns `true` or `false`.

| Operator | Description | Example (`a = 10, b = 5`) | Output |
|----------|-------------|-----------------|--------|
| `==` | Equal to | `a == b` | `false` |
| `!=` | Not equal to | `a != b` | `true` |
| `>` | Greater than | `a > b` | `true` |
| `<` | Less than | `a < b` | `false` |
| `>=` | Greater than or equal to | `a >= b` | `true` |
| `<=` | Less than or equal to | `a <= b` | `false` |

### **Example Code:**
```java
public class RelationalExample {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a > b);  // true
        System.out.println(a < b);  // false
    }
}
```

---

## **3. Logical Operators**
Used to perform logical operations.

| Operator | Description | Example (`a = true, b = false`) | Output |
|----------|-------------|-----------------|--------|
| `&&` | Logical AND | `a && b` | `false` |
| `II` | Logical OR | `a II b` | `true` |
| `!` | Logical NOT | `!a` | `false` |

### **Example Code:**
```java
public class LogicalExample {
    public static void main(String[] args) {
        boolean a = true, b = false;
        System.out.println(a && b); // false
        System.out.println(a || b); // true
        System.out.println(!a);     // false
    }
}
```

---

## **4. Bitwise Operators**
Used for bit-level operations.

| Operator | Description | Example (`a = 5, b = 3`) | Output |
|----------|-------------|-----------------|--------|
| `&` | Bitwise AND | `a & b` | `1` |
| `I` | Bitwise OR | `a I b` | `7` |
| `^` | Bitwise XOR | `a ^ b` | `6` |
| `~` | Bitwise Complement | `~a` | `-6` |
| `<<` | Left Shift | `a << 1` | `10` |
| `>>` | Right Shift | `a >> 1` | `2` |

### **Example Code:**
```java
public class BitwiseExample {
    public static void main(String[] args) {
        int a = 5, b = 3;
        System.out.println(a & b); // 1
        System.out.println(a | b); // 7
        System.out.println(a ^ b); // 6
        System.out.println(~a);    // -6
        System.out.println(a << 1); // 10
        System.out.println(a >> 1); // 2
    }
}
```

---

## **5. Assignment Operators**
Used to assign values to variables.

| Operator | Example (`a = 10`) | Equivalent To |
|----------|-----------------|-----------------|
| `=` | `a = 10` | `a = 10` |
| `+=` | `a += 5` | `a = a + 5` |
| `-=` | `a -= 5` | `a = a - 5` |
| `*=` | `a *= 5` | `a = a * 5` |
| `/=` | `a /= 5` | `a = a / 5` |
| `%=` | `a %= 5` | `a = a % 5` |

### **Example Code:**
```java
public class AssignmentExample {
    public static void main(String[] args) {
        int a = 10;
        a += 5;
        System.out.println(a); // 15
    }
}
```

---

## **6. Unary Operators**
Used with a single operand.

| Operator | Description | Example (`a = 10`) | Output |
|----------|-------------|-----------------|--------|
| `+` | Positive | `+a` | `10` |
| `-` | Negative | `-a` | `-10` |
| `++` | Increment | `a++` | `11` |
| `--` | Decrement | `a--` | `9` |

### **Example Code:**
```java
public class UnaryExample {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a); // 11
        System.out.println(a--); // 11
        System.out.println(a);   // 10
    }
}
```

---

## **7. Ternary Operator (`?:`)**
A shorthand for `if-else` conditions.

### **Example Code:**
```java
public class TernaryExample {
    public static void main(String[] args) {
        int a = 10, b = 5;
        int min = (a < b) ? a : b;
        System.out.println("Minimum: " + min);
    }
}
```

### **Output:**
```
Minimum: 5
```

---

### **Quick Summary**
| Operator Type | Examples |
|--------------|----------|
| Arithmetic | `+`, `-`, `*`, `/`, `%` |
| Relational | `==`, `!=`, `>`, `<`, `>=`, `<=` |
| Logical | `&&`, `||`, `!` |
| Bitwise | `&`, `|`, `^`, `~`, `<<`, `>>` |
| Assignment | `=`, `+=`, `-=`, `*=`, `/=`, `%=` |
| Unary | `++`, `--`, `+`, `-` |
| Ternary | `condition ? trueValue : falseValue` |

---

# **Java Bitwise Shift Operators - Shortcut Formulas**
n is the number of shift positions
Bitwise shift operators in Java allow efficient multiplication and division by powers of 2.

---

## **1. Left Shift (`<<`)**
Shifts bits **left**, filling with `0`s.  
### **Formula:**
\[ x << n = x \times 2^n \]

### **Example:**  
```java
int x = 5;   // Binary: 0000 0101
int result = x << 2;  // Shift left by 2 positions
System.out.println(result); // Output: 20
```

### **Calculation:**  
\[ 5 << 2 = 5 *times 2^2 = 5 \times 4 = 20 \]

---

## **2. Right Shift (`>>`)**
Shifts bits **right**, filling with the sign bit (`0` for positive, `1` for negative).  
### **Formula:**
\[ x >> n = x ÷div 2^n \]

### **Example:**  
```java
int x = 20;  // Binary: 0001 0100
int result = x >> 2;  // Shift right by 2 positions
System.out.println(result); // Output: 5
```

### **Calculation:**  
\[ 20 >> 2 = 20 ÷div 2^2 = 20 \div 4 = 5 \]

---

## **3. Unsigned Right Shift (`>>>`)**
Shifts bits **right**, filling with `0`s **always**, even for negative numbers.  
### **Formula:**
\[ x >>> n = x \text{ divided by } 2^n \text{ (ignoring sign)} \]

### **Example:**  
```java
int x = -20;  // Binary: 1111 1111 1111 1111 1111 1111 1110 1100 (32-bit representation)
int result = x >>> 2;  // Shift right by 2 positions
System.out.println(result); // Output: 1073741819
```

### **Calculation (ignoring sign bit):**  
\[ -20 >>> 2 = 	ext{Huge positive number} \]

---

## **Quick Reference Table**
| Operator | Formula | Example (`x = 8, n = 1`) | Output |
|----------|---------|-----------------|--------|
| `x << n` | `x * 2^n` | `8 << 1` | `16` |
| `x >> n` | `x / 2^n` | `8 >> 1` | `4` |
| `x >>> n` | `x / 2^n` (always positive) | `-8 >>> 1` | Large positive number |

---

🚀 **Happy Coding!** 🚀

