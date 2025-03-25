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
