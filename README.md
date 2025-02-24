BridgeLabz Java Summary

19-01-25

Basic Java Problems:
Print "Welcome to Bridgelabz!"
Add two numbers (user input).
Convert Celsius to Fahrenheit.
Calculate area of a circle.
Calculate volume of a cylinder.
Calculate Simple Interest.
Calculate perimeter of a rectangle.
Power calculation.
Average of three numbers.
Convert kilometers to miles.

22-01-25 (Level 1)

Basic Java Problems:
Find Harry's age.
Average percent marks in PCM.
Convert kilometers to miles.
Calculate profit/loss.
Distribution of pens.
Calculate discounted amount and price.
Compute volume of Earth.
Convert kilometers to miles (user input).
Calculate discounted amount and price (user input).
Convert height into feet and inches.
Basic arithmetic operations (addition, subtraction, multiplication, division).
Area of a triangle.
Side of a square from perimeter.
Distance in yards and miles.
Calculate total price.
Maximum possible handshakes.

23-01-25 (Level 1)

Conditional Statements & Loops:
Check divisibility by 5.
Check if the first number is the smallest.
Find the largest of three numbers.
Check for natural numbers and sum them.
Check voting eligibility.
Check if a number is positive, negative, or zero.
Check for spring season.
Countdown using while loop.
Countdown using for loop.
Sum until user enters zero.
Sum using while loop/break statement.
Sum of natural numbers (formula and while loop).
Sum of natural numbers (formula and for loop).
Calculate factorial (while loop).
Calculate factorial (for loop).
Find odd and even numbers in a range.
Calculate bonus.
Multiplication of a number.

23-01-25 (Level 2)

Intermediate Problems:
Check if a year is a leap year.
Check leap year using operators.
Calculate percentage and find grades.
Check if a number is prime.
Fizz Buzz problem.
Fizz Buzz using while loop.
Calculate BMI and status.
Find the youngest and tallest among three friends.
Find the greatest factor of a number.
Find the power of a number.
Find factors of a number.
Find multiples of a number.

23-01-25 (Level 3)

Advanced Problems:
Check for Armstrong number.
Count the number of digits.
Check for Harshad number.
Check for Abundant number.
Day of the week calculation.
Create a calculator using switch case.
24-01-2025

Arrays:
Java Arrays: creation, access, modification.
Multi-dimensional arrays (2D arrays).
Accessing and finding size of multi-dimensional arrays.
Using System.err and exit() method.
28-01-2025

Methods:
User-defined methods.
Dynamic methods.
Recursive methods.
Static methods.
Java Standard Library methods (e.g., java.lang.Math).

29-01-2025

Strings:
Java Strings: creation, escape sequences.
String input and arrays.
String as method parameters.
String class built-in methods.
ASCII character codes.
Java exceptions and their hierarchy.
Common built-in functions (Random, Math).
Date and time handling.
30-01-2025

Procedural vs OOP:
Java as a procedural language.
Concepts of Object-Oriented Programming (OOP).
Comparison between procedural language and OOP.
Java classes and objects.

31-01-2025 & 01-02-2025

Constructors and Access Modifiers:
Key features of constructors.
Constructor overloading.
Access modifiers in Java.
Instance vs class variables.

03-02-2025

Keywords:
this keyword: uses and scope.
static keyword: definition, features, scope, advantages, and limitations.
final keyword.
instanceof operator: use cases.
Comparison between this, final, static, and instanceof keywords.

06-02-2025

Object Modeling: Object relationships and communication.
Assisted Problems: Create a Library with Books (Aggregation), allowing books to exist independently. Model a Bank with Customers (Association) to illustrate account relationships. Design a Company with Departments (Composition) to show hierarchical structure. Develop a School with Students and Courses (Association/Aggregation) and simulate a Hospital with Doctors and Patients (Association). Object Diagrams capture class instances and their relationships.
 
07-02-2025

Inheritance Concepts:
The assignment introduces various inheritance concepts in programming, including single, multilevel, hierarchical, and hybrid inheritance. It provides examples like animal hierarchies, employee management systems, and vehicle management systems. Key principles emphasize proper use of inheritance, favoring composition, maintaining "is-a" relationships, and ensuring polymorphism, while also addressing best practices for implementation.
 
08-02-2025

This assignment outlines best programming practices, emphasizing encapsulation, polymorphism, interfaces, and abstract classes. It includes practical examples such as an Employee Management System, E-Commerce Platform, Vehicle Rental System, and more. Each example demonstrates the application of these principles, ensuring code maintainability, readability, and flexibility through proper design patterns.
-*Encapsulation*: Ensure all sensitive fields are private and accessed through well-defined getter and setter methods. Include validation logic where applicable.<br>
-*Polymorphism*: Use abstract class references or interface references to handle objects of multiple types dynamically.<br>
-*Abstract Classes*: Use them to define a common structure and behavior while deferring specific details to subclasses.<br>
-*Interfaces*: Use them to define additional capabilities or contracts that are not tied to the class hierarchy.<br>

<details>
<summary> Files </summary>
BankingSystem.java
Product.java
EmployeeSystem.java
HospitalSystem.java
LibrarySystem.java
FoodDeliverySystem.java
RenetalSystem.java
VehicleSystem.java
</details>

11-02-2025
Singly Linked List: Each node contains data and a pointer to the next node. Traversal is only possible in one direction.
Doubly Linked List: Each node contains data, a pointer to the next node, and a pointer to the previous node. Traversal is possible in both directions.
Circular Linked List: In a circular linked list, the last node points back to the first node, creating a loop. Traversal can continue indefinitely.


Head & Tail Management: Always maintain the head (and tail in doubly and circular lists) to avoid traversing the entire list when accessing the first or last elements.
Null Checks: Before performing operations like deletion or traversal, check if the list is empty to prevent errors.
Efficient Insertion/Deletion: Insert at the beginning or end for O(1) time complexity. For operations in the middle, ensure proper pointer updates to maintain list integrity.
Memory Management: Properly nullify pointers (next, prev) when deleting nodes to prevent memory leaks, especially in languages without garbage collection.
Boundary Handling: Carefully handle edge cases like inserting/deleting at the head, tail, or middle of the list, ensuring correct pointer updates.
Avoid Infinite Loops (Circular Lists): Implement conditions to stop traversal after one complete cycle to avoid infinite loops.
<details>
<summary> Files </summary>
CPUSchedular.java InventoryManagement.java LibrarySystem.java MovieManagementSystem.java SocialMedia.java TaskScheduler.java TextEditorApp.java TicketReservationApp.java
</details>

DATE: 13-02-2025
Stack

A Stack is a linear data structure that follows the Last In, First Out (LIFO) principle. The element inserted last is the first to be removed. It is commonly used for scenarios where elements need to be processed in reverse order of their insertion.
Key Operations
push(E e): Adds an element to the top of the stack.
pop(): Removes and returns the top element of the stack.
peek(): Retrieves the top element without removing it.
isEmpty(): Checks if the stack is empty.

Queues

A Queue is a linear data structure that follows the First In, First Out (FIFO) principle, where the element added first is the first one to be removed. It is widely used in scenarios like scheduling, buffering, and resource management.
Types of Queues
Simple Queue: FIFO behavior.
PriorityQueue: Elements are ordered based on priority.
Deque (Double-Ended Queue): Allows insertion and deletion from both ends.

Key Operations
offer(E e): Adds an element to the queue.
poll(): Retrieves and removes the head of the queue.
peek(): Retrieves the head without removing it.
isEmpty(): Checks if the queue is empty.

HashMap

A HashMap in Java is a part of the java.util package and is used to store key-value pairs. It provides constant-time performance for most operations like insertion, deletion, and retrieval (in the average case).
Key Operations
put(K key, V value): Inserts or updates a key-value pair.
get(Object key): Retrieves the value for a given key.
containsKey(Object key): Checks if a key exists.
remove(Object key): Removes a key-value pair.
<details>
<summary> Files </summary>
CircularTour.java QueueusingStack.java SlidingWindowMaximum.java SortStackRecursively.java StockSpan.java CustomHashMap.java LongestConsecutiveSequence.java PairWithTargetSum.java TwoSum.java ZeroSumSubarrays.java
</details>

DATE: 14-02-2025
Bubble Sort Bubble Sort is a simple sorting algorithm that repeatedly compares adjacent elements and swaps them if they are in the wrong order. This process continues until the entire array is sorted.

Insertion Sort Insertion Sort works by building a sorted portion of the array one element at a time by picking an element and inserting it at the correct position within the sorted portion.

Merge Sort (Divide and Conquer) Merge Sort follows the Divide and Conquer approach, where an array is recursively divided into two halves, sorted individually, and merged back together.

Quick Sort (Divide and Conquer) Quick Sort is another Divide and Conquer algorithm that selects a pivot element, partitions the array around it, and recursively sorts the left and right sub-arrays.
<details>
<summary> Files </summary>
BubbleSort.java CountingSort.java HeapSort.java InsertionSort.java MergeSort.java QuickSort.java SelectionSort.java
</details>
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

DATE: 17-02-2025
Runtime Analysis - Runtime analysis evaluates how an algorithm's performance (time and space) scales with input size. The goal is to determine the efficiency of an algorithm before actual implementation.
Big-O Notation - Big-O notation describes the upper bound of an algorithm's complexity, representing the worst-case scenario in terms of execution time and space required.
Common Big-O Notations O(1) - Constant Time O(log N) -Logarithmic Time O(N) - Linear Time O(N log N) - Linearithmic Time O(N²) - Quadratic Time O(2^N) - Exponential Time O(N!) - Factorial Time
<summary>Files</summary>
DataStructureSearchComparison.java FibonacciComparison.java LargeFileReadingComparison.java SearchComparison.java SortingComparison.java StringConcatenationComparison.java
</details>
DATE: 18-02-2025
Java Generics allow developers to write flexible and reusable code while maintaining type safety. Generics enable classes, interfaces, and methods to operate on parameterized types, reducing runtime errors by shifting type checking to compile-time.

Wildcards in Generics

Wildcards (?) allow flexibility in specifying unknown types:

(Unbounded wildcard)
(Upper-bounded wildcard)
(Lower-bounded wildcard)
Java Generics provide a powerful way to create reusable, type-safe code. By leveraging generics, developers can build robust applications with fewer runtime errors and improved maintainability.
<summary>Files</summary>
MarketPlace.java PersonalizedMealPlan.java ResumeScreening.java SmartWareHouseSystem.java UniversityCourseManagement.java
</details>

DATE: 22-02-2025
Regex

Regular Expressions (Regex) are a sequence of characters defining a search pattern. They are commonly used for validations, searching, text manipulation, and data extraction. Java provides the java.util.regex package to handle regular expressions.
Java provides two main classes to work with regex:
**Pattern** → Represents a compiled regex pattern.
**Matcher** → Performs operations like searching, matching, and replacing.
3. Regex Metacharacters :
Metacharacters are special characters with a specific meaning in regex.

Regex Quantifiers :
Quantifiers define how many times a character or group appears in the text.
JUnit

JUnit is a Java unit testing framework used to write and execute automated tests. It helps developers ensure that their code functions correctly by verifying individual units (methods or classes) in an application.
JUnit Annotations

@Test - Marks a method as a test case
@BeforeEach - Runs before each test method
@AfterEach - Runs after each test method
@BeforeAll - Runs once before all test methods (Static)
@AfterAll - Runs once after all test methods (Static)
@DisplayName - Sets a custom test name
@Disabled - Skips a test method
@RepeatedTest(n) - Runs a test multiple times
@ParameterizedTest - Runs a test with different parameters
@Tag - Categorizes tests for filtering


DATE: 24-02-2025


Reflection
Reflection is a powerful feature in Java that allows us to inspect and manipulate classes, methods, fields, and constructors at runtime, even if their names are unknown at compile time.
Reflection allows runtime access to classes, methods, fields, and annotations.
We can modify private fields, call private methods, and create objects dynamically.
Reflection is useful but should be used cautiously due to performance overhead.
Annotations

Annotations are metadata added to Java code (classes, methods, fields, etc.) to provide additional information. They do not directly affect program execution but can be processed by:
Compilers (e.g., @Override for compile-time checks).

Runtime environments (e.g., JUnit’s @Test for test execution).

Frameworks (e.g., Spring’s @Autowired for dependency injection).


Core Java Annotations
@Override - Indicates a method is overriding a superclass method.

@Deprecated - Marks a method/class as obsolete and Triggers a compiler warning if used.

@SuppressWarnings - Suppresses compiler warnings for specific code blocks.

@FunctionalInterface - Ensures an interface has exactly one abstract method (for lambda compatibility).


Meta-Annotations (Annotations for Annotations)

@Retention - Specifies how long the annotation is retained: RetentionPolicy.SOURCE (discarded by the compiler). RetentionPolicy.CLASS (retained in class files, not runtime). RetentionPolicy.RUNTIME (accessible via reflection).

@Target - Defines where the annotation can be applied: ElementType.METHOD, ElementType.TYPE, ElementType.FIELD, etc.

@Inherited - Allows subclasses to inherit the annotation from a superclass.

@Documented - Includes the annotation in generated Javadoc.


