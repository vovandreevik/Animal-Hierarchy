# Animal Hierarchy Java Program

## Overview

The **Animal Hierarchy** Java program is a demonstration of segregating a collection of animals based on their hierarchy using Java generics. 

The program showcases the segregation of animals into specific subtypes such as Hedgehogs, Manuls, and Lynxes.

## Usage
The program demonstrates the use of Java generics to segregate a collection of animals based on their hierarchy. 

It includes test cases (test1, test2, test3) with different collections of animals to illustrate the segregation process.

## Examples
The program includes three test methods (test1, test2, test3), each showcasing the segregation of animals into specific subtypes. 

You can uncomment and run each test individually in the main method to observe the results.

## Classes
### AnimalHierarchy
The main class containing the main method and test cases. It includes a method (segregate) for segregating animals based on their hierarchy.

### Chordate
An abstract class representing a general category of animals. It includes a constructor to initialize the animal name and an overridden toString method for displaying the animal's name.

### Hedgehog, Manul, Lynx
Concrete classes representing specific subtypes of animals, extending the Chordate class.
