package edu.escuelaing.arep.calculadoraestadistica.datastructures;


import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Double Linked List Implementation
 * the linked list its doubly linked.
 *
 * @param <E> Type of node linked list
 * @author Sergio Alejandro Bohorquez Alzate
 */
public class LinkedList<E> implements Iterable<E>  {

    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size = 0;

    /**
     * Instantiates a new Linked list.
     */
    public LinkedList(){
    }

    /**
     * Adds an element to the end of the doubly-linked list.
     *
     * @param data element to add , the type of this element is generic(any).
     */
    public void add(E data){
        Node<E> node = new Node<E>(data);
        if (this.firstNode ==null){
            this.firstNode = node;
        }
        else{
            node.setLeftNode(this.lastNode);
            this.lastNode.setRightNode(node);
        }
        this.lastNode = node;
        size++;
    }

    /**
     * Removes a node from the left side of the linked list and unlink it.
     *
     * @return deletedNode returns the first element removed
     * @throws NoSuchElementException the no such element exception
     */
    public E remove() throws NoSuchElementException{
        if (size >0){
            Node<E> deletedNode = firstNode;
            Node<E> rightNode = firstNode.getRightNode();
            if (rightNode == null){
                lastNode = null;
            }else{
                rightNode.setLeftNode(null);
            }
            firstNode = rightNode;
            size --;
            return deletedNode.getData();
        }else{
            throw new NoSuchElementException();
        }
    }

    /**
     * Gets a node given an index (data).
     *
     * @param index number of the searched node
     * @return data of the node
     * @throws IndexOutOfBoundsException throws if the node with index couldn't be found.
     */
    public E get(int index) throws IndexOutOfBoundsException{
        if (index == 0){return getFirstNode().getData();}
        if (index == -1){return getLastNode().getData();}
        if (Math.abs(index) <= size-1){
            Node<E> node;
            if (index >0){
                node = getFirstNode();
                for(int i=0; i<index;i++){
                    node = node.getRightNode();
                }
            }else{
                node = getLastNode();
                for(int i=index;i<0; i++){
                    node = node.getLeftNode();
                }
            }
            return node.getData();
        }else{
            throw new IndexOutOfBoundsException();
        }


    }

    /**
     * This method allows to the LinkedList to be iterated with a Java foreach cycle.
     *
     * @return iterator any type iterator that allows to iterate the LinkedList
     */
    public Iterator<E> iterator() {

        return new Iterator<E>() { //Anonymous class with basic methods of an iterator implemented
            Node<E> currentNode = firstNode;

            /**
             * Change the actual node for the next and return the next node.
             * @return next node
             */
            public E next() {
                E currentData = currentNode.getData();
                currentNode = currentNode.getRightNode();
                return currentData;
            }

            /**
             * check if exists a next node
             * @return boolean
             */
            public boolean hasNext() {
                return currentNode != null;
            }
            public void remove() {
            }
        };
    }

    /**
     * Gets the first node of the linked list (Left)
     *
     * @return firstNode first node
     */
    public Node<E> getFirstNode() {
        return firstNode;
    }

    /**
     * Sets first node to a given node.
     *
     * @param firstNode node given.
     */
    public void setFirstNode(Node<E> firstNode) {
        this.firstNode = firstNode;
    }

    /**
     * Gets last node of linked list (Right)
     *
     * @return lastNode of linked list
     */
    public Node<E> getLastNode() {
        return lastNode;
    }

    /**
     * Sets last node to a given node.
     *
     * @param lastNode node given
     */
    public void setLastNode(Node<E> lastNode) {
        this.lastNode = lastNode;
    }

    /**
     * Returns size of the LinkedList
     *
     * @return size size
     */
    public int getSize() {
        return size;
    }

    /**
     * Sets size to the linkedlist (not recommended)
     *
     * @param size given size.
     */
    public void setSize(int size) {
        this.size = size;
    }


}
