# **Arrays in Java**

## **Introduction**
An **array** in Java is a collection of elements of the **same data type**, stored in contiguous memory locations. Arrays are used to store multiple values in a single variable instead of declaring separate variables for each value.

---

## **Types of Arrays in Java**
1. **Single-Dimensional Array**
2. **Multi-Dimensional Array**

---

## **1. Single-Dimensional Array**
A single-dimensional array stores elements in a linear form.

### **Declaration & Initialization**
```java
// Declaration
int[] numbers; 

// Initialization
numbers = new int[5]; // Creates an array of size 5

// Declaration and Initialization in one step
int[] numbers = {10, 20, 30, 40, 50};
```

### **Accessing Elements**
```java
System.out.println(numbers[0]); // Output: 10
System.out.println(numbers[2]); // Output: 30
```

### **Iterating Over an Array**
```java
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

### **Enhanced for Loop (For-Each Loop)**
```java
for (int num : numbers) {
    System.out.println(num);
}
```

### **Common Array Methods**
```java
int[] arr = {5, 1, 8, 3, 2};
Arrays.sort(arr);  // Sorting the array
System.out.println(Arrays.toString(arr)); // Output: [1, 2, 3, 5, 8]
```

---

## **2. Multi-Dimensional Arrays**
A multi-dimensional array is an array of arrays, used for matrix-like structures.

### **Declaration & Initialization**
```java
// 2D Array Declaration
int[][] matrix = new int[3][3];

// Initializing with values
int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
```

### **Accessing Elements**
```java
System.out.println(matrix[0][1]); // Output: 2
```

### **Iterating Over a 2D Array**
```java
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

---

## **Array Operations**
### **1. Copying an Array**
```java
int[] original = {1, 2, 3, 4, 5};
int[] copy = Arrays.copyOf(original, original.length);
System.out.println(Arrays.toString(copy)); // Output: [1, 2, 3, 4, 5]
```

### **2. Searching in an Array**
```java
int index = Arrays.binarySearch(original, 3);
System.out.println(index); // Output: 2 (index of element 3)
```

### **3. Filling an Array**
```java
int[] arr = new int[5];
Arrays.fill(arr, 7);
System.out.println(Arrays.toString(arr)); // Output: [7, 7, 7, 7, 7]
```

### **4. Comparing Two Arrays**
```java
int[] arr1 = {1, 2, 3};
int[] arr2 = {1, 2, 3};
System.out.println(Arrays.equals(arr1, arr2)); // Output: true
```

---

## **Jagged Arrays (Irregular Arrays)**
A **jagged array** is an array where sub-arrays have different lengths.

### **Declaration & Initialization**
```java
int[][] jaggedArray = new int[3][];
jaggedArray[0] = new int[2]; // First row has 2 columns
jaggedArray[1] = new int[3]; // Second row has 3 columns
jaggedArray[2] = new int[1]; // Third row has 1 column
```

### **Iterating Over a Jagged Array**
```java
for (int i = 0; i < jaggedArray.length; i++) {
    for (int j = 0; j < jaggedArray[i].length; j++) {
        System.out.print(jaggedArray[i][j] + " ");
    }
    System.out.println();
}
```

---

## **Conclusion**
✔ Arrays in Java store multiple values of the same type.
✔ They can be **single-dimensional** or **multi-dimensional**.
✔ Java provides various **built-in methods** in the `Arrays` class for sorting, searching, copying, and filling arrays.
✔ Jagged arrays allow different column sizes in a multi-dimensional array.


---

# **Arrays in Java**

## **Introduction**
An **array** in Java is a collection of elements of the **same data type**, stored in contiguous memory locations. Arrays are used to store multiple values in a single variable instead of declaring separate variables for each value.

---

## **1. Declaring and Creating Arrays**

### **1.1 Declaring an Array**
Arrays in Java are declared using the following syntax:
```java
// Declaring an array
int[] numbers;  // Preferred way
int numbers[];  // Valid but less recommended
```

### **1.2 Creating an Array**
Once declared, an array must be instantiated (allocated memory) using the `new` keyword.
```java
// Creating an array of size 5
numbers = new int[5];
```

### **1.3 Declaring and Creating Together**
```java
int[] numbers = new int[5];
```

### **1.4 Initializing an Array**
Arrays can be initialized during declaration:
```java
int[] numbers = {10, 20, 30, 40, 50};
```

---

## **2. Accessing and Modifying Array Elements**
### **2.1 Accessing Elements**
Array elements are accessed using their index (starting from `0`).
```java
System.out.println(numbers[0]); // Output: 10
System.out.println(numbers[2]); // Output: 30
```

### **2.2 Modifying Elements**
```java
numbers[1] = 25; // Changing the second element to 25
System.out.println(numbers[1]); // Output: 25
```

---

## **3. Iterating Over an Array**
### **3.1 Using a For Loop**
```java
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

### **3.2 Using an Enhanced For Loop (For-Each Loop)**
```java
for (int num : numbers) {
    System.out.println(num);
}
```

---

## **4. Multi-Dimensional Arrays**
A **multi-dimensional array** is an array of arrays, useful for storing matrix-like structures.

### **4.1 Declaring and Creating a 2D Array**
```java
int[][] matrix = new int[3][3];
```

### **4.2 Initializing a 2D Array**
```java
int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
```

### **4.3 Accessing and Modifying Elements**
```java
System.out.println(matrix[0][1]); // Output: 2
matrix[1][1] = 15; // Modify element
```

### **4.4 Iterating Over a 2D Array**
```java
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

---

## **5. Array Operations**
### **5.1 Copying an Array**
```java
int[] original = {1, 2, 3, 4, 5};
int[] copy = Arrays.copyOf(original, original.length);
System.out.println(Arrays.toString(copy)); // Output: [1, 2, 3, 4, 5]
```

### **5.2 Sorting an Array**
```java
int[] arr = {5, 1, 8, 3, 2};
Arrays.sort(arr);
System.out.println(Arrays.toString(arr)); // Output: [1, 2, 3, 5, 8]
```

### **5.3 Searching in an Array**
```java
int index = Arrays.binarySearch(arr, 3);
System.out.println(index); // Output: 2 (index of element 3)
```

### **5.4 Filling an Array**
```java
int[] arr = new int[5];
Arrays.fill(arr, 7);
System.out.println(Arrays.toString(arr)); // Output: [7, 7, 7, 7, 7]
```

### **5.5 Comparing Two Arrays**
```java
int[] arr1 = {1, 2, 3};
int[] arr2 = {1, 2, 3};
System.out.println(Arrays.equals(arr1, arr2)); // Output: true
```

---

## **6. Jagged Arrays (Irregular Arrays)**
A **jagged array** is a multi-dimensional array where sub-arrays can have different sizes.

### **6.1 Declaration & Initialization**
```java
int[][] jaggedArray = new int[3][];
jaggedArray[0] = new int[2];
jaggedArray[1] = new int[3];
jaggedArray[2] = new int[1];
```

### **6.2 Iterating Over a Jagged Array**
```java
for (int i = 0; i < jaggedArray.length; i++) {
    for (int j = 0; j < jaggedArray[i].length; j++) {
        System.out.print(jaggedArray[i][j] + " ");
    }
    System.out.println();
}
```

---

## **7. Passing Arrays to Methods**
Arrays can be passed as arguments to methods.
```java
public class ArrayExample {
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        printArray(numbers);
    }
}
```

---

## **8. Returning an Array from a Method**
```java
public class ArrayReturn {
    static int[] getArray() {
        return new int[]{1, 2, 3, 4, 5};
    }
    public static void main(String[] args) {
        int[] arr = getArray();
        System.out.println(Arrays.toString(arr));
    }
}
```

---

## **Conclusion**
✔ Arrays in Java store multiple values of the same type.
✔ They can be **single-dimensional**, **multi-dimensional**, or **jagged arrays**.
✔ Java provides various **built-in methods** in the `Arrays` class for sorting, searching, copying, and filling arrays.
✔ Arrays can be passed to methods and returned from methods.




---
