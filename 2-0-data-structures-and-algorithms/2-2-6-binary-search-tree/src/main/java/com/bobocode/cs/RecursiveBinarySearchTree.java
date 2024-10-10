package com.bobocode.cs;

import com.bobocode.util.ExerciseNotCompletedException;

import java.util.Arrays;
import java.util.function.Consumer;

/**
 * {@link RecursiveBinarySearchTree} is an implementation of a {@link BinarySearchTree} that is based on a linked nodes
 * and recursion. A tree node is represented as a nested class {@link Node}. It holds an element (a value) and
 * two references to the left and right child nodes.
 * <p><p>
 * <strong>TODO: to get the most out of your learning, <a href="https://www.bobocode.com">visit our website</a></strong>
 * <p>
 *
 * @param <T> a type of elements that are stored in the tree
 * @author Taras Boychuk
 * @author Maksym Stasiuk
 */
public class RecursiveBinarySearchTree<T extends Comparable<T>> implements BinarySearchTree<T> {
    private static class Node<T> {
        T element;
        Node<T> left;
        Node<T> right;

        public Node(T element) {
            this.element = element;
        }
    }

    private int size;
    private Node<T> root;

    public static <T extends Comparable<T>> RecursiveBinarySearchTree<T> of(T... elements) {
        RecursiveBinarySearchTree<T> binarySearchTree = new RecursiveBinarySearchTree<>();
        Arrays.stream(elements).forEach(binarySearchTree::insert);
        return binarySearchTree;
    }

    @Override
    public boolean insert(T element) {
        if (root == null) {
            root = new Node<>(element);
            size++;
            return true;
        } else {
            return insert(root, element);
        }
    }

    private boolean insert(Node<T> current, T element) {
        if (current.element.compareTo(element) > 0) { // go left
            if (current.left == null) {
                current.left = new Node<>(element);
                size++;
                return true;
            }
            return insert(current.left, element);
        } else if (current.element.compareTo(element) < 0) { // go right
            if (current.right == null) {
                current.right = new Node<>(element);
                size++;
                return true;
            }
            return insert(current.right, element);
        }
        return false;
    }

    @Override
    public boolean contains(T element) {
        if (element == null) throw new NullPointerException();
        if (root != null) {
            return contains(root, element);
        }
        return false;
    }

    private boolean contains(Node<T> current, T element) {
        if (current.element.compareTo(element) > 0) {// go left
            if (current.left != null) {
                return contains(current.left, element);
            }
        } else if (current.element.compareTo(element) < 0) { // go right
            if (current.right != null) {
                return contains(current.right, element);
            }
        } else return current.element.compareTo(element) == 0;
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int depth() {
        throw new ExerciseNotCompletedException();
    }

    @Override
    public void inOrderTraversal(Consumer<T> consumer) {
        throw new ExerciseNotCompletedException();
    }
}
