package edu.escuelaing.arep.calculadoraestadistica.datastructures;


/**
 * A node is a representation of data, the node has a left and right node.
 * the node can be of any type
 * @author Sergio Alejandro Bohorquez Alzate
 * @param <E> data type of the node.
 */
public class Node<E> {
    private E data;
    private Node<E> leftNode;
    private Node<E> rightNode;

    /**
     * Constructor of node.
     * example: new Node(new Bigdecimal("0.0"))
     * @param data the data that will be saved.
     */
    public Node(E data){
        this.data = data;
        leftNode = null;
        rightNode = null;
    }

    /**
     * Gets the data of a node.
     * @return the data of a node
     */
    public E getData() {
        return data;
    }

    /**
     * Sets the data of a node
     * @param data given data.
     */
    public void setData(E data) {
        this.data = data;
    }

    /**
     * Gets the left node chained to this object.
     * @return leftNode
     */
    public Node<E> getLeftNode() {
        return leftNode;
    }
    /**
     * Sets the left node chained to this object.
     * @param leftNode left node given
     */
    public void setLeftNode(Node<E> leftNode) {
        this.leftNode = leftNode;
    }

    /**
     * Gets the right node chained to this object.
     * @return rightNode
     */
    public Node<E> getRightNode() {
        return rightNode;
    }

    /**
     * Gets the right node chained to this object.
     * @param rightNode right node given.
     */
    public void setRightNode(Node<E> rightNode) {
        this.rightNode = rightNode;
    }


}
