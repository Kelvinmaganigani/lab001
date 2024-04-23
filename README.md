# Lab 1: Java Basics Assignment

## Objective
To practice the basics of Java programming including variables, data types, operations, loops, and selection statements.

## Description
In this assignment, you will enhance a Java program, `Main.java`, to perform various tasks using scenarios in Java programming. The program will consist of multiple sections, each focusing on different Java fundamentals:

1. **Variables and Data Types**
2. **Arithmetic and Logical Operations**
3. **Loops**
4. **Selection Statements**

## Instructions
- Locate the file called `Main.java` at `src/main/java/lab1/Main.java`.
- Inside the class, you will find a main method that prints out results from four methods: `section1`, `section2`, `section3`, and `section4`.
- Implement the code in the appropriate methods as outlined below:

### Section 1: Variables and Data Types
- Declare and initialize variables: an integer `num` (42), a float `average` (95.5), a character `letter` ('A'), and a boolean `isTrue` (true).
- Challenge: Calculate the byte size of each data type using Java utilities and return a formatted string containing each variable along with its size using `StringBuilder`.

### Section 2: Arithmetic and Logical Operations
- Perform operations involving edge cases:
    - Compute `(num * 1000) / 3` and handle potential overflow.
    - Calculate the sine of `average` using `Math.sin`, considering the result's precision.
    - Use a ternary operation to decide between the modulus of `num` by an undefined value (0 by default) with error handling.
    - Evaluate a complex logical expression combining `isTrue`, `false`, and another condition that checks if `average` is a NaN.
- Use `StringBuilder` to construct a response string that explains each result, including error handling steps.

### Section 3: Loops
- Implement a for loop that calculates the factorial of numbers from 1 to `num` (consider using BigInteger for large results).
- Implement a while loop that continues until `num` is not a prime number, doubling `num` each iteration, and checking primality.
- Return the loop results using `StringBuilder`.

### Section 4: Selection Statements
- Implement an if-else statement that evaluates whether the ASCII value of `letter` is odd or even.
- Enhance the switch statement for `letter` with cases that involve lowercase and uppercase letters, and provide feedback on whether the input is uppercase (using `Character.isUpperCase`).
- Return results using `StringBuilder`.

## Submission
- After completing the assignment, submit it by pushing the repository to GitHub.
- Ensure all source code and additional files necessary to compile and run your program are included.

## Tips
- Utilize Java documentation to understand data type limits, operations, and methods like `Math.sin` and `BigInteger`.
- Handle exceptions and edge cases to make your program robust against common programming errors.