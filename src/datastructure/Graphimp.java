package datastructure;

import java.util.LinkedList;

public  class Graphimp {
    int v;
    public LinkedList<Integer> adjListArray[];
    public Graphimp(int v)
    {
        this.v=v;
        adjListArray = new LinkedList[v];
        for(int i=0;i<v;i++)
        {
            adjListArray[i] = new LinkedList<>();

        }
    }

}
