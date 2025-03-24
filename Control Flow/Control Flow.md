# **Java Control Flow Statements**

Control flow statements in Java determine the **order of execution** of statements in a program. Java provides the following types:

1. **Conditional Statements** (`if`, `if-else`, `switch`)
2. **Looping Statements** (`for`, `while`, `do-while`)
3. **Jump Statements** (`break`, `continue`, `return`)

---

## **1. Conditional Statements**
These statements allow the program to make decisions based on conditions.

### **1.1 if Statement**
Executes a block of code **only if** the condition is `true`.
```java
int num = 10;
if (num > 5) {
    System.out.println("Number is greater than 5");
}
```

### **1.2 if-else Statement**
Executes one block if the condition is `true`, otherwise executes another block.
```java
int num = 10;
if (num % 2 == 0) {
    System.out.println("Even number");
} else {
    System.out.println("Odd number");
}
```

### **1.3 if-else-if Ladder**
Used for checking multiple conditions.
```java
int marks = 85;
if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 80) {
    System.out.println("Grade B");
} else {
    System.out.println("Grade C");
}
```

### **1.4 switch Statement**
Used when there are multiple cases for a single variable.
```java
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
}
```

---

## **2. Looping Statements**
Loops execute a block of code **repeatedly** based on a condition.

### **2.1 for Loop**
Executes a block of code for a fixed number of iterations.
```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Iteration: " + i);
}
```

### **2.2 while Loop**
Executes a block **as long as** the condition is `true`.
```java
int i = 1;
while (i <= 5) {
    System.out.println("Iteration: " + i);
    i++;
}
```

### **2.3 do-while Loop**
Executes **at least once**, then continues while the condition is `true`.
```java
int i = 1;
do {
    System.out.println("Iteration: " + i);
    i++;
} while (i <= 5);
```

---

## **3. Jump Statements**
Used to alter the normal flow of loops and conditions.

### **3.1 break Statement**
Terminates the loop immediately.
```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        break; // Stops loop at 3
    }
    System.out.println("Iteration: " + i);
}
```

### **3.2 continue Statement**
Skips the current iteration and continues with the next.
```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue; // Skips 3
    }
    System.out.println("Iteration: " + i);
}
```

### **3.3 return Statement**
Exits from the current method.
```java
public static void testMethod() {
    System.out.println("Hello");
    return; // Exits method
    // Code here will not execute
}
```

---

## **Summary Table**
| Type | Statement | Description |
|------|------------|-------------|
| Conditional | `if`, `if-else`, `switch` | Executes based on conditions |
| Looping | `for`, `while`, `do-while` | Repeats execution |
| Jump | `break`, `continue`, `return` | Alters loop execution |

---


