# Java Advanced Calculator

This repository provides a **menu-driven calculator program** to perform basic arithmetic operations such as addition, subtraction, multiplication, division, square, cube, and square root with exception handling.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Classes and Methods](#classes-and-methods)
- [Exceptions Used](#exceptions-used)
- [How to Run](#how-to-run)

## Overview
The program allows users to interact with a calculator and perform basic mathematical operations. It offers multiple operations such as:

- Addition
- Subtraction
- Multiplication
- Division
- Square of a number
- Cube of a number
- Square root of a number

The project consists of the following classes:
- **`Main`**: Provides the menu-driven interface for user interaction.
- **`Operations`**: Contains methods for performing different operations like addition, subtraction, multiplication, and more.

## Features
- **Supports basic arithmetic operations**: Addition, subtraction, multiplication, division, square, cube, and square root.
- **Menu-driven interface**: Allows users to select an operation and input numbers.
- **Error handling**: Handles common errors like invalid input, division by zero, and large numbers with appropriate messages.
- **Custom input validation**: Ensures that the user inputs valid numeric values.

## Classes and Methods

### **Main Class**
Provides a **menu-driven** system for user interaction and input validation.

#### **Methods**
- `public static void main(String[] args)`: The entry point of the program where user interaction takes place. Displays a menu, handles input, and calls the appropriate methods from the `Operations` class.

#### **Workflow**
1. Displays a menu with different operation options.
2. Accepts user input for the operation choice and numbers.
3. Performs the corresponding calculations and displays the result.
4. Continues execution until the user chooses to exit.

### **Operations Class**
Contains the logic for performing different mathematical operations.

#### **Methods**
- `public double add(Double a, Double b)`: Performs addition of two numbers.
- `public double subtract(Double a, Double b)`: Performs subtraction of two numbers.
- `public double multiply(Double a, Double b)`: Performs multiplication of two numbers.
- `public double divide(Double a, Double b)`: Performs division of two numbers, with error handling for division by zero.
- `public double square(Double a)`: Computes the square of a number.
- `public double cube(Double a)`: Computes the cube of a number.
- `public double squareRoot(Double a)`: Computes the square root of a number, with error handling for negative inputs.

### **Helper Methods**
- **`parseInput(String input)`**: A helper method in the `Main` class to parse the user's input and ensure it's a valid number.

## Exceptions Used

The program handles various exceptions to ensure smooth operation and provide clear error messages for the user. Below are the exceptions used in the code:

### 1. **ArithmeticException**
   - Thrown when an arithmetic operation produces an exceptional condition, such as division by zero.
   - Example: 
     - Division operation where the second number is zero.

### 2. **IllegalArgumentException**
   - Thrown when a method receives an argument that is inappropriate or violates a method's contract.
   - Example: 
     - Input numbers that are too large for the operation (greater than 1e6).
     - Invalid menu choice.

### 3. **InputMismatchException**
   - Thrown when the input does not match the expected type (e.g., trying to enter non-numeric values when numeric input is expected).
   - Example:
     - Non-numeric input is entered when the program expects a number.

### 4. **NumberFormatException**
   - Thrown when an attempt to convert a string to a numeric type fails (e.g., trying to parse a non-numeric string as a number).
   - Example:
     - Invalid number format entered by the user when input is expected to be a valid number.

### 5. **Exception (Generic)**
   - A catch-all exception that handles unexpected errors that do not fall under more specific exception types.
   - Example:
     - Any other unforeseen runtime errors that don't match the specific exceptions mentioned above.

These exceptions are used to ensure that the program continues to function smoothly even when the user provides invalid input or encounters unexpected situations.


## How to Run
1. **Compile all Java files:**
   ```sh
   javac *.java
2. Run the main program:
   ```sh
   java Main
