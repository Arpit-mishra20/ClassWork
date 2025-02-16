DATE: 15-02-2025
Linear Search Linear search is one of the simplest searching algorithms used to find a target value within a list or array. It works by checking each element in the list one by one until the target element is found or the end of the list is reached.

Binary Search Binary Search is an efficient searching algorithm used to find an element in a sorted dataset. Unlike Linear Search, which checks each element one by one, Binary Search repeatedly divides the search space in half, reducing the time complexity to O(log n).

In Java, String is immutable, meaning every modification creates a new object in memory. To handle frequent string manipulations efficiently, Java provides StringBuilder and StringBuffer, which are mutable alternatives to String.

StringBuilder It is mutable, meaning it modifies the same object instead of creating a new one. Fast because it is not synchronized (no locking mechanisms). Ideal for single-threaded applications.

StringBuffer Similar to StringBuilder but synchronized, meaning it is thread-safe. Slightly slower due to synchronization overhead. Used in multi-threaded applications.

Buffered Reader BufferedReader is a Java class in the java.io package that reads text from an input stream efficiently. It buffers the input to improve performance, making it faster than reading characters one by one.

File Reader and Input Stream Reader Both FileReader and InputStreamReader are classes in the java.io package that are used to read data from files or other input streams. However, there are differences in their usage and underlying mechanisms.

Input Stream Reader Converts byte streams into character streams, making it useful when dealing with input streams (like reading from a file or network socket) that provide byte data. It is a bridge between byte streams and character streams, and it can be used with any InputStream (e.g., FileInputStream, BufferedInputStream). Encoding: Allows specifying the character encoding (e.g., UTF-8, ISO-8859-1), which makes it more flexible than FileReader.
<details>
<summary>Files</summary>
BinarySearchFirstLast.java CompareStringBufferStringBuilder.java ConcatenateStrings.java ConvertByteStreamToCharStream.java CountWordOccurences.java MatrixSearch.java PeakElement.java ReadFileLineByLine.java ReadInputAndWriteToFile.java RemoveDuplicates.java ReverseString.java RotatedSortedArray.java SearchAndFind.java Solution.java Solution2.java StringAndFileOperations.java
</details>