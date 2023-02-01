package org.example;

import java.util.ArrayList;

public class AdjacencyMatrix {
    ArrayList<Node> NodeList;
    int [][] Matrix;

    public AdjacencyMatrix(int size){
        NodeList = new ArrayList<>();
        Matrix = new int[size][size];
    }
    public void addnode (Node node){
        NodeList.add(node);
    }
    public void addedge (int src, int des){
        Matrix[src][des] = 1;
    }
    public boolean checkEdge (int src, int des){
        if (Matrix[src][des] == 1){
            return true;
        }
        else return false;
    }
    public void print(){
        System.out.print("  ");
        for (Node i: NodeList){
            System.out.print(i.data + " ");
        }
        System.out.println();
        for (int i = 0; i<= Matrix.length-1;i++){
            System.out.print(NodeList.get(i).data + " ");
            for(int j = 0; j<= Matrix.length -1; j++){
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
