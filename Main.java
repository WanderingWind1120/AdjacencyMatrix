package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Integer> inttest = new ArrayList<Integer>(3);
        inttest.add(54);
        inttest.add(522);
        inttest.add(8545);
        inttest.add(543);
        for (Integer i: inttest){
            System.out.print(i + " ");
        }
        System.out.println();
        AdjacencyMatrix Matrix = new AdjacencyMatrix(3);
        Matrix.addnode(new Node('f'));
        Matrix.addnode(new Node('g'));
        Matrix.addnode(new Node('g'));

        Matrix.addedge(0,2);
        Matrix.addedge(0,1);
        Matrix.addedge(2,0);
        Matrix.addedge(2,1);

        Matrix.print();
    }
}