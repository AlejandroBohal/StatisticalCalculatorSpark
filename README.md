# Statistical Calculator  :rocket:
This project aims to implement a basic extendable statistical calculator with two main functionalities.

 - Calculating the arithmetic mean of a data set.
 - Calculating standard deviation of a data set. 

A Linked List was implemented to store the data, Git was used for change control, Maven for Control Version CircleCi for Continuos integration and Heroku to continuios Deployment.

## Getting Started
![](https://cdn.discordapp.com/attachments/740467292734881863/746231422297047050/unknown.png)
The web aplicattion implemented with Spark and deployed to heroku can be found in the following link:
[![Deploy](https://www.herokucdn.com/deploy/button.svg)](http://fathomless-bayou-96611.herokuapp.com/)
Continuos integration status Circle CI.
[![CircleCI](https://circleci.com/gh/AlejandroBohal/StatisticalCalculatorSpark.svg?style=svg)](https://circleci.com/gh/AlejandroBohal/StatisticalCalculatorSpark)

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. 

### Prerequisites

- Java SE Development Kit 8
- Java SE Runtime Environment 8
- In order to use the program you will need Maven on your system to be able to build it.
- To run a local heroku app you will need to intall last version of Heroku CLI.
- Git to be able to clone this repository. 
- Postman (Optional)


### Installing

we will first clone the repository with the following command

```
git clone https://github.com/AlejandroBohal/StatisticalCalculatorSpark
cd /StatisticalCalculatorSpark
```

After this we will build the project with the next command or phase:
```
mvn clean install
```
Once the project is built, we can execute it with Maven in the following way:
```
 Linux/Mac
 java $JAVA_OPTS -cp target/classes:target/dependency/* edu.escuelaing.arep.calculadoraestadistica.webapp.Spark
 Windows
 java -cp target/classes:target/dependency/* edu.escuelaing.arep.calculadoraestadistica.webapp.Spark
```
To open a local Heroku Server you can execute the following command.
```
 heroku local web
```
you can access the local server at http://localhost:5000

To run the local program only txt files located in the root directory of the program are supported, as an example 2 files were left in the program. To test the other file we only need to change TestData.txt to TestData2.txt in the previous command.

In the file we must put numbers separated by spaces, for each line will be calculated both arithmetic mean and standard deviation as seen below:
```
160 591 114 229 230 270 128 1657 624 1503
15.0 69.9 6.5 22.4 28.4 65.9 19.4 198.7 38.8 138.2

```
```
Arithmetic mean: 550.6
Standard Deviation: 572.026844746915
Arithmetic mean: 60.32000000000001
Standard Deviation: 62.25583060601187
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

Example of endpoint testing 
http://fathomless-bayou-96611.herokuapp.com/calculate with postman. we will do a post request to , this endpoint only accepts text on the body request.

![](https://cdn.discordapp.com/attachments/352624122301513730/746406790693912706/unknown.png)


## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* CircleCI for CI
    [![CircleCI](https://circleci.com/gh/AlejandroBohal/AREP-CalculadoraEstadistica.svg?style=svg)](https://circleci.com/gh/AlejandroBohal/AREP-CalculadoraEstadistica)
* Build to Heroku
    [![Deploy](https://www.herokucdn.com/deploy/button.svg)](http://fathomless-bayou-96611.herokuapp.com/)
* [Spark](http://sparkjava.com/) - Spark Java Framework

## Documentation

This repository contains a paper with documentation about the process carried out for the creation of the program, the following link will redirect you to it:

https://github.com/AlejandroBohal/StatisticalCalculatorSpark/blob/master/Documentation.pdf

Documentation website:
https://alejandrobohal.github.io/StatisticalCalculatorSpark/

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

## Author

* **Sergio Alejandro Bohorquez Alzate** 
Student at the Colombian School of Engineering

## License

This project is licensed under the GNU v3.0 - see the [LICENSE.md](LICENSE.md) file for details
