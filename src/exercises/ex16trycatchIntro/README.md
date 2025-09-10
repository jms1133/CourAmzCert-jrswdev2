## What is a try-catch block?
A try-catch block is a programming construct that is used in many programming languages to handle Exceptions. In Java, try-catch blocks can be used to handle Exceptions that occur during compile time or runtime.

The try-catch operation is a Java mechanism that you can use to gracefully manage exceptional situations in programs and prevent program interruption or termination.

The try block encloses the code that might cause an exception, and the catch block is what performs the actual exception handling.

```try {

// Code that may cause an exception

} catch (Exception_Type e) {
// Code that handles the exception
}
```

## How does the try-catch block work?
The try block encloses the code that may cause an Exception. The catch block, also known as the Exception handler, contains code that should be executed if and when an Exception occurs and the Exception handler or the catch block is invoked. 

If the code enclosed in the try block causes a problem, the Java runtime system/environment invokes the catch block. An exception object is created and handed over to it. This is also known as throwing an exception. 

The Java runtime invokes the catch block, passing it the Exception object that was handed over to it (the Exception type that’s passed in as a parameter to the catch block as indicated in the syntax of the try-catch block above). The catch block then uses the information that is contained in the Exception object to handle it in an appropriate manner. 

In this code, it is important that you declare an Exception type in the catch block that matches the Exception type that happens within the try block. In other words, the exception type that’s thrown in the try block. So, what constitutes a match? The Java runtime considers it a match if the thrown exception object can be assigned to the catch block or the exception handler's argument. This means that their types should match.

> Keep in mind that the catch block gets executed only if an Exception is thrown. If not, the code you put in doesn’t get executed. 

## Example of how a try-catch works. 

```java
public class ExceptionHandler {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};

        System.out.println(a[5]);
	
        System.out.println("Some more code");
    }
}
```
> Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
* Notice that the code line that prints out “Some more code” never gets executed!

## Steps
1. First, you enclose the code that causes the problem in a try block.
```java
try {
       int[] a = {1, 2, 3, 4, 5};
       System.out.println(a[5]);
} 
```
2. Next, you define the catch block with an Exception type parameter. The Exception type here can be the Exception super class itself or it can be the specific subclass of the Exception class that is the ArrayIndexOutOfBoundsException class.

> **Remember:** It is always best practice to use the specific Exception type or class
```java
catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("You are trying to access an element that's out of the index boundary");
}
```
3. So it should look when put all together:
```java
public class ExceptionHandler {
    public static void main(String[] args) {

        try {
            int[] a = {1, 2, 3, 4, 5};
            System.out.println(a[5]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("You are trying to access an element that's out of the index boundary");
        }

        System.out.println("Some more code");
    }
}
```
When you run this code, you should receive a nice, clean output with an error message saying: You are trying to access an element that's out of the index boundary.

> Also, because of the try-catch, the rest of the code gets executed, and the “Some more code” message is printed in the output.
## What are the benefits of using the try-catch block?
- As a user, you feel better because you can understand what the output says since it’s in plain language and does not contain any technical jargon. 
- What is most important, though, is that your program didn’t terminate unexpectedly.  This is what’s meant by handling exceptions gracefully.

# Multiple catch blocks
