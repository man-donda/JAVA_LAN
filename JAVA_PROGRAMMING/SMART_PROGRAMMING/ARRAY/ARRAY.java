import java.util.*;

        //                     Types of Array
        //                             |
        //                             |
        //                -----------------------------
        //                |                           |  
        //                |                           |  
        //    Single Dimensional Array     Multi-Dimensional Array
        //         >>> 1-D Array               >>> 2-D Array
        //                                     >>> 3-D Array
        //                                     >>> Jagged Array
        //                                     >>> Matrix Array


        // ----------------- Features Of an Array -----------------
// 1. Fixed Size:
//   - Once declared, the size of an array cannot be changed.
// 2. Homogeneous Data:
//   - Stores elements of the same data type (e.g., int, String, char).
// 3. Zero-based Indexing:
//   - Array indexing starts from 0, making element access consistent in most programming languages.
// 4. Can Store Primitive and Object Types:
//   - Supports both primitive types (int, double) and reference types (String, Integer, custom objects).
// 5. Arrays are created at runtime:
//   - Arrays are always created at runtime, and this is called dynamic memory allocation.
//   - Even though you may write: int[] arr = new int[5]; // or int[] arr = {10, 20, 30);
//      = The actual memory for the array is not allocated during compilation.
//      = So, it's created at runtime, not at compile-time.
// 6. Arrays are Objects in Java:
//   - Whether it's int[], String[], or MyClass[], every array in Java is an object.
//   - All objects, including arrays, are allocated in the Heap Area.
// 7. Contiguous Memory Allocation:
//   - Array elements are stored in contiguous memory locations.

// -------------------- Advantages Of an Array --------------------
// 1. Single Name Storage:
//   - Stores multiple elements of the same type using just one variable name.
// 2. Used in Data Structures:
//   - Helps build structures like stacks, queues, trees, and graphs.
// 3. Type Safety:
//   - Only stores one data type, avoiding type mismatch errors.
// 4. No Object Conversion:
//   - No need to convert primitive to wrapper types, so execution is faster.
// 5. Memory Efficient:
//   - Efficiently uses memory when data size is fixed.
// 6. Fast Access:
//   - Accessing any element by index is instant (0(1) time).

// -------------------- Disadvantages Of an Array --------------------
// 1. Fixed Size:
//   - Once declared, array size cannot be changed during runtime.
// 2. Memory Wastage:
//   - Unused slots waste memory if fewer elements are stored than declared.
// 3. Type Restriction:
//   - Only similar data types can be stored in a single array.
// 4. Reduced Performance:
//   - Deleting or inserting elements requires shifting, which slows performance.
// 5. No Built-in Methods:
//   - Arrays don't support methods like add, remove, or insert directly.


public class ARRAY{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(arr[4]);
        System.out.println(arr.length);
        System.out.println(arr.length - 1);
    }
}
