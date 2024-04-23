[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/jeMzT2CB)
# Lab 1: Java Basics Assignment

## Introduction
Welcome to your Java programming assignment! In this task, you will be creating a Basic Calculator application that can perform simple arithmetic operations like addition, subtraction, multiplication, and division. This assignment is designed to help you practice Java fundamentals including variables, data types, operations, loops, and selection statements.

## Objective
- Understand and implement basic Java syntax and control structures.
- Develop functions to perform arithmetic operations.
- Handle user input and output in a console application.
- Implement error handling for common input errors.

## Instructions
1. **Create Two Classes:**
- Inside the project folder (src/main/java/lab1), create two Java classes:
  - `Main.java`: This class should contain the `main` method and handle user interactions.
  - `BasicCalculator.java`: This class should contain methods for addition, subtraction, multiplication, and division. Each method must take two `double` parameters and return a `double` value as the result.

2. **Implement Arithmetic Methods:**
  - Each arithmetic operation (add, subtract, multiply, divide) should be implemented in the `BasicCalculator` class.
  - Ensure to handle division by zero with appropriate error messaging.

3. **User Interface in the Main Class:**
  - Use a loop to allow the user to perform multiple calculations.
  - Prompt the user to select an operation.
  - Get the user’s input for two numbers.
  - Display the result of the calculation.
  - Allow the user to continue with new calculations or exit.

4. **Error Handling:**
  - Add error handling to manage non-numeric inputs.
  - Ensure the application does not crash for unexpected inputs.

## Example Output
```
Welcome to the Basic Calculator!
Choose an operation:
1: Addition
2: Subtraction
3: Multiplication
4: Division
5: Exit
Select (1-5): 1
Enter the first number: 5
Enter the second number: 3
Result: 8.0
Do another calculation? (yes/no): no
Thank you for using the Basic Calculator!
```

## Submission
- After completing the assignment, submit it by pushing the repository to GitHub.
- Ensure all source code and additional files necessary to compile and run your program are included.

## Evaluation Criteria
- **Functionality:** All functions work as expected without errors.
- **Code Efficiency:** Code is well-organized without redundancy.
- **Error Handling:** All user input errors are handled gracefully.
- **Documentation:** Code is well-documented with comments explaining key sections.