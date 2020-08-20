package edu.escuelaing.arep.calculadoraestadistica.calculator;

import edu.escuelaing.arep.calculadoraestadistica.datastructures.LinkedList;


import java.math.BigDecimal;

/**
 *Statistical calculator that helps calculate the
 *arithmetic mean and standard deviation
 * @author Sergio Alejandro Bohorquez Alzate
 * @version 1.0
 */
public class Calculator
{
    /**
     * Calculates the arithmetic mean of a data set.
     * @param data LinkedList with the data to calculate the mean.
     * @return result of arithmetic mean
     */
    public double calculateMean(LinkedList<Double> data){
        double answer = 0.0;
        for(double node: data){
            answer += node;
        }
        answer = answer/data.getSize();
        return answer;
    }

    /**
     * Calculates the standard deviation of a data set.
     * @param data LinkedList with the data to calculate standard deviation
     * @return result of standard deviation
     */
    public double calculateStandardDeviation(LinkedList<Double> data){
        double answer = 0.0;
        double mean = calculateMean(data);
        for(double node: data){
            answer += Math.pow((node - mean),2);
        }
        answer = Math.sqrt(answer/(data.getSize()-1));
        return answer;
    }

}
