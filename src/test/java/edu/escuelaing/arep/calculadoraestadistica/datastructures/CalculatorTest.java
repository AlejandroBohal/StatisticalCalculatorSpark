package edu.escuelaing.arep.calculadoraestadistica.datastructures;

import edu.escuelaing.arep.calculadoraestadistica.calculator.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The type Calculator test.
 */
public class CalculatorTest {
    /**
     * The Calculator used for calculate mean and standard deviation
     */
    Calculator calculator;
    /**
     * The Data set 1.
     */
    LinkedList<Double> dataSet1, /**
     * The Data set 2.
     */
    dataSet2, /**
     * The Data set 3.
     */
    dataSet3, /**
     * The Data set 4.
     */
    dataSet4, /**
     * The Data set 5.
     */
    dataSet5, /**
     * The Data set 6.
     */
    dataSet6, /**
     * The Data set 7.
     */
    dataSet7;

    /**
     * Setup.
     * Initialize the data Set structures that will be used.
     */
    @Before
    public void setup(){
        calculator = new Calculator();
        dataSet1 = createLinkedList(new double[]{160,591,114,229,230,270,128,1657,624,1503});
        dataSet2 = createLinkedList(new double[]{15.0,69.9,6.5,22.4,28.4,65.9,19.4,198.7,38.8,138.2});
        dataSet3 = createLinkedList(new double[]{0.70,72.03,93.25,99.43,86.85,70.29,99.90,85.55,76.13,91.09});
        dataSet4 = createLinkedList(new double[]{91.68,21.16,91.04,26.55,69.55,49.15,58.43,5.33,56.59,42.35});
        dataSet5 = createLinkedList(new double[]{47.69,60.06,37.07,78.89,19.63,28.50,15.53,75.80,78.91,78.04});
        dataSet6 = createLinkedList(new double[]{18.22,99.68,33.36,89.39,97.98,82.55,28.05,39.52,57.78,82.16});
        dataSet7 = createLinkedList(new double[]{64.02,32.59,77.55,28.44,60.04,70.36,51.30,90.17,12.14,52.02});
    }

    /**
     * Should calculate mean.
     */
    @Test
    public void shouldCalculateMean() {
        Assert.assertEquals(550.6, calculator.calculateMean(dataSet1), 0.0);
        Assert.assertEquals(60.32, calculator.calculateMean(dataSet2), 0.00001);
        Assert.assertEquals(77.52, calculator.calculateMean(dataSet3), 0.01);
        Assert.assertEquals(51.18, calculator.calculateMean(dataSet4), 0.01);
        Assert.assertEquals(52.01, calculator.calculateMean(dataSet5), 0.01);
        Assert.assertEquals(62.86, calculator.calculateMean(dataSet6), 0.01);
        Assert.assertEquals(53.86, calculator.calculateMean(dataSet7), 0.01);
    }

    /**
     * Should not calculate mean.
     */
    @Test
    public void shouldNotCalculateMean() {
        Assert.assertNotEquals(321.21, calculator.calculateMean(dataSet1), 0.0);
        Assert.assertNotEquals(7.32, calculator.calculateMean(dataSet2), 0.00001);
        Assert.assertNotEquals(8.45, calculator.calculateMean(dataSet3), 0.01);
        Assert.assertNotEquals(41.2, calculator.calculateMean(dataSet4), 0.01);
        Assert.assertNotEquals(41.45, calculator.calculateMean(dataSet5), 0.01);
        Assert.assertNotEquals(44.02, calculator.calculateMean(dataSet6), 0.01);
        Assert.assertNotEquals(32.22, calculator.calculateMean(dataSet7), 0.01);
    }

    /**
     * Should calculate standard deviation.
     */
    @Test
    public void shouldCalculateStandardDeviation(){
        Assert.assertEquals(572.03, calculator.calculateStandardDeviation(dataSet1), 0.05);
        Assert.assertEquals(62.26, calculator.calculateStandardDeviation(dataSet2), 0.03);
        Assert.assertEquals(28.96, calculator.calculateStandardDeviation(dataSet3), 0.01);
        Assert.assertEquals(28.55, calculator.calculateStandardDeviation(dataSet4), 0.01);
        Assert.assertEquals(25.66, calculator.calculateStandardDeviation(dataSet5), 0.01);
        Assert.assertEquals(31.08, calculator.calculateStandardDeviation(dataSet6), 0.01);
        Assert.assertEquals(23.90, calculator.calculateStandardDeviation(dataSet7), 0.01);
    }

    /**
     * Should not calculate standard deviation.
     */
    @Test
    public void shouldNotCalculateStandardDeviation(){
        Assert.assertNotEquals(57.03, calculator.calculateStandardDeviation(dataSet1), 0.05);
        Assert.assertNotEquals(6.26, calculator.calculateStandardDeviation(dataSet2), 0.03);
        Assert.assertNotEquals(8.96, calculator.calculateStandardDeviation(dataSet3), 0.01);
        Assert.assertNotEquals(24.5, calculator.calculateStandardDeviation(dataSet4), 0.01);
        Assert.assertNotEquals(26.66, calculator.calculateStandardDeviation(dataSet5), 0.01);
        Assert.assertNotEquals(33.08, calculator.calculateStandardDeviation(dataSet6), 0.01);
        Assert.assertNotEquals(20.90, calculator.calculateStandardDeviation(dataSet7), 0.01);
    }

    private LinkedList<Double> createLinkedList(double[] doubles){
        LinkedList<Double> linkedListAux = new LinkedList<Double>();
        for(double number: doubles){
            linkedListAux.add(number);
        }
        return linkedListAux;
    }

}
