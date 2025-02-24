DATE: 22-02-2025


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

