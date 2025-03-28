```
#include<>bits/stdc++.h>
import java.util.*;
```

# Array Working and Types

---

### Uninitialized Array Element Default Zero:
```java
int[] a = new int[5];

for (int i = 0; i < a.length; i++) {
  System.out.print(a[i] + " ");
}
//op : a = [0 0 0 0 0]
```

### All Items Must Be of the Same Type:
```
float[] a = {10.5f, 15.8f, 13.3f};
// Array contains only float elements.
```

### Primitives Are Stored at Contiguous Locations:
### Non-Primitive References Are Stored at Contiguous Locations:

### Vector -> ArrayList

```cpp
vector<int> arr(size);
```

ArrayList
```java
import java.util.ArrayList;
ArrayList<Integer> arr = new ArrayList<>();
```



# **ArrayList in Java**

## **1. Introduction**
`ArrayList` is a part of the **Java Collections Framework**. It is a **resizable** array implementation of the `List` interface, allowing dynamic memory allocation, unlike traditional arrays.

### **Key Features:**
- **Dynamic size**: Grows and shrinks as needed.
- **Allows duplicate elements**.
- **Maintains insertion order**.
- **Provides fast random access (O(1) for `get()`)**.
- **Not synchronized (Not thread-safe by default).**

---

## **2. Importing ArrayList**
Before using `ArrayList`, import the package:
```java
import java.util.ArrayList;
```

---

## **3. Creating an ArrayList**
```java
ArrayList<String> list = new ArrayList<>();
```
- The `<>` (diamond operator) allows **type inference**.
- Can store only **objects**, not primitive types (Use wrapper classes like `Integer`, `Double`, etc.).

Example:
```java
ArrayList<Integer> numbers = new ArrayList<>();
```

---

## **4. Adding Elements**
```java
ArrayList<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");
names.add("Charlie");
names.add(1, "David"); // Adds "David" at index 1

//syntax
arr.add(index, value)
```

---

## **5. Accessing Elements**
```java
String name = names.get(2); // Returns "Charlie"
```
```cpp
    vector<int> v = {1, 3, 4, 9};
    cout << v.at(2);
```
---

## **6. Modifying Elements**
```java
names.set(1, "Daniel"); // Changes "David" to "Daniel"
//syntax
arr.set(index, value)
```

---

## **7. Removing Elements**
```java
names.remove(2); // Removes element at index 2
names.remove("Daniel"); // Removes "Daniel" by value
```

---

## **8. Iterating Over an ArrayList**
### **Using for-each loop:**
```java
for (String name : names) {
    System.out.println(name);
}
```

### **Using for loop:**
```java
for (int i = 0; i < names.size(); i++) {
    System.out.println(names.get(i));
}
```

### **Using Iterator:**
```java
import java.util.Iterator;
Iterator<String> iterator = names.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
```

---

## **9. Checking Size & Clearing List**
```java
System.out.println(names.size()); // Get number of elements
names.clear(); // Removes all elements
```

---

## **10. Searching in an ArrayList**
```java
boolean contains = names.contains("Alice"); // true if "Alice" exists
int index = names.indexOf("Bob"); // Returns index of "Bob", -1 if not found
```

---

## **11. Sorting an ArrayList**
```java
import java.util.Collections;
Collections.sort(names);
```
```cpp
arr.sort(arr.begin(), arr.end());
```


## **12. Converting ArrayList to Array**
```java
String[] arr = names.toArray(new String[0]);
Integer[] arr = numbers.toArray(new Integer[0]);
```

---

## **13. Converting Array to ArrayList**
```java
import java.util.Arrays;
List<String> nameList = new ArrayList<>(Arrays.asList(arr));
```
```cpp
/Array to vector
vector<int> arr(Array.begin(), Array.end());
```
---

## **14. Synchronizing an ArrayList (Thread-Safe)**
```java
import java.util.Collections;
import java.util.List;
List<String> syncList = Collections.synchronizedList(new ArrayList<>());
```

---

## **15. Using ArrayList with Custom Objects**
```java
class Student {
    String name;
    int age;
    
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

ArrayList<Student> students = new ArrayList<>();
students.add(new Student("Alice", 20));
students.add(new Student("Bob", 22));


//eg
ArrayList<datatype> List = new ArrayList<>();
List.add(data)

ArrayList< object_datatype> objList = new ArrayList<>();
List.add(new objList("value"))
```

---

## **Conclusion**
✔ `ArrayList` is a dynamic alternative to arrays.
✔ Provides **fast access, insertion, and deletion**.
✔ **Not thread-safe by default**, use `Collections.synchronizedList()` if needed.
✔ Can store custom objects and be used efficiently with Java Collections.

🚀 **Mastering ArrayLists helps handle dynamic data efficiently!**

