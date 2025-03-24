# **Java Predefined Functions (Built-in Methods)**

Java provides many predefined methods in its standard library to perform common operations. These methods are grouped into various packages like `java.lang`, `java.util`, `java.io`, and `java.math`.

---

## **1. java.lang (Core Methods)**
The `java.lang` package is automatically imported in every Java program.

### **1.1 Math Class Methods**
| Method | Description | Example |
|--------|-------------|---------|
| `Math.abs(x)` | Returns the absolute value of `x` | `Math.abs(-5) → 5` |
| `Math.sqrt(x)` | Returns the square root of `x` | `Math.sqrt(25) → 5.0` |
| `Math.pow(a, b)` | Returns `a` raised to the power `b` | `Math.pow(2, 3) → 8.0` |
| `Math.max(a, b)` | Returns the maximum of `a` and `b` | `Math.max(10, 20) → 20` |
| `Math.min(a, b)` | Returns the minimum of `a` and `b` | `Math.min(10, 20) → 10` |
| `Math.random()` | Returns a random number between `0.0` and `1.0` | `Math.random() → 0.678` |

### **1.2 String Class Methods**
| Method | Description | Example |
|--------|-------------|---------|
| `str.length()` | Returns the length of the string | `"Java".length() → 4` |
| `str.toUpperCase()` | Converts to uppercase | `"java".toUpperCase() → "JAVA"` |
| `str.toLowerCase()` | Converts to lowercase | `"JAVA".toLowerCase() → "java"` |
| `str.charAt(index)` | Returns the character at `index` | `"Java".charAt(1) → 'a'` |
| `str.contains("sub")` | Checks if string contains substring | `"Hello".contains("ell") → true` |
| `str.replace(old, new)` | Replaces occurrences of `old` with `new` | `"abc".replace('a', 'x') → "xbc"` |

---

## **2. java.util (Utility Methods)**

### **2.1 Arrays Class Methods** (From `java.util.Arrays`)
| Method | Description | Example |
|--------|-------------|---------|
| `Arrays.sort(arr)` | Sorts an array | `Arrays.sort(arr)` |
| `Arrays.toString(arr)` | Converts array to string | `Arrays.toString(arr) → "[1, 2, 3]"` |
| `Arrays.binarySearch(arr, key)` | Searches for `key` in sorted array | `Arrays.binarySearch(arr, 3)` |

### **2.2 Collections Class Methods** (From `java.util.Collections`)
| Method | Description | Example |
|--------|-------------|---------|
| `Collections.sort(list)` | Sorts a list | `Collections.sort(myList)` |
| `Collections.max(list)` | Returns max value in list | `Collections.max(myList)` |
| `Collections.min(list)` | Returns min value in list | `Collections.min(myList)` |

---

## **3. java.io (Input/Output Methods)**
| Method | Description | Example |
|--------|-------------|---------|
| `System.out.print(x)` | Prints `x` without a newline | `System.out.print("Hello")` |
| `System.out.println(x)` | Prints `x` with a newline | `System.out.println("Hello")` |
| `System.in.read()` | Reads a single character | `char c = (char) System.in.read();` |

---

## **4. java.time (Date and Time Methods)**
| Method | Description | Example |
|--------|-------------|---------|
| `LocalDate.now()` | Returns current date | `LocalDate.now() → 2025-03-22` |
| `LocalTime.now()` | Returns current time | `LocalTime.now() → 12:30:45` |
| `LocalDateTime.now()` | Returns current date-time | `LocalDateTime.now()` |

---

## **5. java.math (Big Numbers Methods)**
| Method | Description | Example |
|--------|-------------|---------|
| `BigInteger.add(BigInteger)` | Adds two big numbers | `a.add(b)` |
| `BigDecimal.multiply(BigDecimal)` | Multiplies big decimals | `a.multiply(b)` |

---

## **Summary**
Java provides many predefined methods that help with:
✔ Math operations (`Math.sqrt()`, `Math.pow()`)
✔ String manipulation (`str.length()`, `str.toUpperCase()`)
✔ Array handling (`Arrays.sort()`, `Arrays.toString()`)
✔ Collections (`Collections.sort()`, `Collections.max()`)
✔ Input/Output (`System.out.println()`, `System.in.read()`)
✔ Date/Time (`LocalDate.now()`, `LocalTime.now()`)
✔ Large number operations (`BigInteger`, `BigDecimal`)


