package datastructure;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    static void addEdge(Graphimp graphinmp,int src,int dest)
    {
        graphinmp.adjListArray[src].add(dest);
        graphinmp.adjListArray[dest].add(src);
    }
    static void printGraph(Graphimp graphimp)
    {
        for(int v=0;v<graphimp.v;v++)
        {
            System.out.println("Adjacency list of vertex "+v);
            System.out.println("head");
            for(Integer in : graphimp.adjListArray[v])
            {
                System.out.print("-> "+in);

            }
            System.out.println("\n");
        }
    }
    static void DFSUtil(Graphimp graphimp,int v,boolean visited[])
    {
        visited[v] = true;
        System.out.println(v+" ");
        Iterator<Integer> itr = graphimp.adjListArray[v].iterator();
        while (itr.hasNext())
        {
            int n = itr.next();
            if(!visited[n])
            {
                visited[n]=true;
                DFSUtil(graphimp,n,visited);
            }
        }

    }
    static void DFS(Graphimp graphimp,int s)
    {
        boolean visited[] = new boolean[graphimp.v];
        DFSUtil(graphimp,s,visited);
    }
    static void  BFS(Graphimp graphimp,int s)
    {
        boolean visited[] = new boolean[graphimp.v];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s]=true;
        queue.add(s);
        while (queue.size() != 0)
        {
            s = queue.poll();
            System.out.print(s+" ");
            Iterator<Integer> itr = graphimp.adjListArray[s].iterator();
            while (itr.hasNext())
            {
                int n = itr.next();
                if(!visited[n])
                {
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }

    }
    public static void main(String[] args) {
        Graphimp graphimp = new Graphimp(5);
        addEdge(graphimp,0,1);
        addEdge(graphimp,0,4);
        addEdge(graphimp,1,2);
        addEdge(graphimp,1,3);
        addEdge(graphimp,1,4);
        addEdge(graphimp,2,3);
        addEdge(graphimp,3,4);
        DFS(graphimp,0);
    }
}
