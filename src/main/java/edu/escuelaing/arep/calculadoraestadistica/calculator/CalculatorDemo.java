package edu.escuelaing.arep.calculadoraestadistica.calculator;

import edu.escuelaing.arep.calculadoraestadistica.datastructures.LinkedList;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

/**
 * Calculator demo to read a dataset from a file and use the calculator.
 * @author  Sergio Alejandro Bohorquez Alzate
 * @version 1.0
 */
public class CalculatorDemo {
    static Calculator calculator = new Calculator();

    /**
     * Main executive class receives a filename to start.
     * @param args filename for test (the file must be in the root directory of the project)
     */
    public static void main(String[] args) {
        try {
            File myObj = new File(args[0]);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                calculate(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    /**
     * Calculates the arithmetic mean and standard deviation given a string.
     * @param data Line of a text file.
     */
    private static void calculate(String data){
        LinkedList<Double> dataList = convertToLinkedList(data);
        System.out.println("");
        System.out.println("Arithmetic mean: " + calculator.calculateMean(dataList));
        System.out.println("Standard Deviation: " + calculator.calculateStandardDeviation(dataList));
        System.out.println("");
    }

    /**
     * Converts a life of a file text o a Linked list <Double>
     * @param data Line of a text file.
     * @return a string to linked list.
     */
    private static LinkedList<Double> convertToLinkedList(String data){
        LinkedList<Double> linkedList= new LinkedList<Double>();
        String[] splitData = data.split(" ");
        for (String numberString: splitData){
            double number = Double.parseDouble(numberString);
            linkedList.add(number);
        }
        return linkedList;
    }
}


