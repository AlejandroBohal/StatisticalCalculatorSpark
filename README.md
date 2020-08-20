# Statistical Calculator  :rocket:
This project aims to implement a basic extendable statistical calculator with two main functionalities 

 - Calculating the arithmetic mean of a data set.
 - Calculating standard deviation of a data set. 

A Linked List was implemented to store the data, Git was used for change control and GitFlow for version control, the project is built with Maven.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. 

### Prerequisites

- Java SE Development Kit 8
- Java SE Runtime Environment 8
- In order to use the program you will need Maven on your system to be able to build it.
- Git to be able to clone this repository. 


### Installing

we will first clone the repository with the following command

```
Git clone https://github.com/AlejandroBohal/AREP-CalculadoraEstadistica
```

After this we will build the project with the next command or phase:
```
mvn package
```
Once the project is built, we can execute it with Maven in the following way:
```
mvn exec:java -Dexec.mainClass="edu.escuelaing.arep.calculadoraestadistica.calculator.CalculatorDemo" -Dexec.args=" TestData.txt "
```
To run the program only txt files located in the root directory of the program are supported, as an example 2 files were left in the program. To test the other file we only need to change TestData.txt to TestData2.txt in the previous command.

In the file we must put numbers separated by spaces, for each line will be calculated both arithmetic mean and standard deviation as seen below:
```
160 591 114 229 230 270 128 1657 624 1503
15.0 69.9 6.5 22.4 28.4 65.9 19.4 198.7 38.8 138.2
0.70 72.03 93.25 99.43 86.85 70.29 99.90 85.55 76.13 91.09
```
```
Arithmetic mean: 550.6
Standard Deviation: 572.026844746915
Arithmetic mean: 60.32000000000001
Standard Deviation: 62.25583060601187
Arithmetic mean: 77.522
Standard Deviation: 28.96296017713352
```
## Running the tests

Test cases are automated with JUnit and can be executed with the following command:
```
mvn test
```
once you run the tests you'll get an output similar to this:
```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running edu.escuelaing.arep.calculadoraestadistica.datastructures.CalculatorTest
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.136 sec
Running edu.escuelaing.arep.calculadoraestadistica.datastructures.LinkedListTest
Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.002 sec
Results :
Tests run: 10, Failures: 0, Errors: 0, Skipped: 0
```

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

* CircleCI for CI

[![CircleCI](https://circleci.com/gh/AlejandroBohal/AREP-CalculadoraEstadistica.svg?style=svg)](https://circleci.com/gh/AlejandroBohal/AREP-CalculadoraEstadistica)

## Documentation

This repository contains a paper with documentation about the process carried out for the creation of the program, the following link will redirect you to it:

https://github.com/AlejandroBohal/AREP-CalculadoraEstadistica/blob/master/Documentation.pdf

Documentation website:
https://alejandrobohal.github.io/AREP-CalculadoraEstadistica/

If you need additional information about the program structure or about some functionality, you can generate the documentation with the following command
```
mvn javadoc:javadoc
```
In order to see the documentation we will generate a simple site that will allow us to see it properly with the following command:
```
mvn site
```
run the website with:
```
mvn site:run
```
in a web browser we enter the following address http://localhost:8080 
documentation will be in the reporting area of the site

![](https://i.ibb.co/tBLtQdJ/Javadoc.png)

## Versioning

We use GitFlow for versioning. For the versions available, see the [tags on this repository](https://github.com/AlejandroBohal/AREP-CalculadoraEstadistica/tags). 

## Author

* **Sergio Alejandro Bohorquez Alzate** 
Student at the Colombian School of Engineering

## License

This project is licensed under the GNU v3.0 - see the [LICENSE.md](LICENSE.md) file for details

