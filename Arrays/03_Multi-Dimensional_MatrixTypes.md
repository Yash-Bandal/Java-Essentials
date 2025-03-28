# **Types of Matrices in Java**

## **1. Simple (2D) Matrix**
A **simple matrix** is a rectangular array of elements, arranged in rows and columns.

### **Example:**
```java
public class SimpleMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Printing matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

---

## **2. Jagged Matrix**
A **jagged matrix** is an array of arrays where each row can have a different number of columns.

### **Example:**
```java
public class JaggedMatrix {
    public static void main(String[] args) {
        int[][] jagged = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };
        
        // Printing jagged matrix
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

---

## **3. Spiral Matrix**
A **spiral matrix** is a matrix in which elements are arranged in a spiral order, typically moving right, down, left, and up.

### **Example:**
```java
public class SpiralMatrix {
    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = new int[n][n];
        
        int num = 1;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        
        while (num <= n * n) {
            for (int i = left; i <= right; i++) matrix[top][i] = num++;
            top++;
            for (int i = top; i <= bottom; i++) matrix[i][right] = num++;
            right--;
            for (int i = right; i >= left; i--) matrix[bottom][i] = num++;
            bottom--;
            for (int i = bottom; i >= top; i--) matrix[i][left] = num++;
            left++;
        }
        
        // Printing spiral matrix
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
```

---

## **4. Identity Matrix**
An **identity matrix** is a square matrix with 1s on the diagonal and 0s elsewhere.

### **Example:**
```java
public class IdentityMatrix {
    public static void main(String[] args) {
        int n = 3;
        int[][] identity = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            identity[i][i] = 1;
        }
        
        // Printing identity matrix
        for (int[] row : identity) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
```

---

## **5. Upper and Lower Triangular Matrix**
An **upper triangular matrix** has all non-zero elements in or above the diagonal, while a **lower triangular matrix** has them below the diagonal.

### **Example:**
```java
public class TriangularMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Upper Triangular Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j < i) System.out.print("0 ");
                else System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Lower Triangular Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j > i) System.out.print("0 ");
                else System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

---

## **Conclusion**
- ✅ **Simple Matrix**: Standard 2D array.
- ✅ **Jagged Matrix**: Rows can have different lengths.
- ✅ **Spiral Matrix**: Filled in a spiral order.
- ✅ **Identity Matrix**: Diagonal elements are 1.
- ✅ **Upper/Lower Triangular Matrix**: Non-zero elements positioned accordingly.

🔹 **Matrices are fundamental in data processing, graphics, and machine learning!** 🚀

