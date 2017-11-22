package Lab07;

/**
 * Created by benjamin on 12/11/17.
 */

public class GraphTest {

    public static void main(String[] args) {
        //PART I
        //g1
        System.out.println("\nPART I\n");
        AdjGraph graph = new AdjGraph(5);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(3, 0);
        graph.addEdge(4, 0);
        graph.addEdge(4, 1);
        graph.addEdge(4, 3);
        System.out.println("degree[0]=" + graph.degree(0));
        System.out.println(graph.toString());

        //g2
        AdjGraph graph2 = new AdjGraph(4);
        graph2.addEdge(0, 1);
        graph2.addEdge(2, 1);
        graph2.addEdge(3, 2);
        System.out.println("degree[0]=" + graph2.degree(0));
        System.out.println(graph2.toString());

        //g3
        AdjGraph graph3 = new AdjGraph(6);
        graph3.addEdge(2, 0);
        graph3.addEdge(3, 1);
        graph3.addEdge(4, 0);
        graph3.addEdge(4, 2);
        graph3.addEdge(5, 1);
        graph3.addEdge(5, 3);
        System.out.println("degree[0]=" + graph3.degree(0));
        System.out.println(graph3.toString());

        System.out.println("\nDirected Graph for above.\nMore examples in PART II for hasCycle.\n");
        AdjGraph graph3d = new AdjGraph(6);
        graph3d.directed = true;
        graph3d.addEdge(2, 0);
        graph3d.addEdge(3, 1);
        graph3d.addEdge(4, 0);
        graph3d.addEdge(4, 2);
        graph3d.addEdge(5, 1);
        graph3d.addEdge(5, 3);
        System.out.println("degree[0]=" + graph3d.degree(0));
        System.out.println("inDegree[0]=" + graph3d.inDegree(0));
        System.out.println("outDegree[0]=" + graph3d.outDegree(0));
        System.out.println(graph3d.toString());

        graph.directed = true;
        boolean d = graph.isDirected();
        if(d)
            System.out.println("directed=" + d);

        //PART II
        System.out.println("\nPART II\n");
        System.out.println("\nDFS\n");
        AdjGraph graph4 = new AdjGraph(8);
        graph4.addEdge(0, 1);
        graph4.addEdge(0, 2);
        graph4.addEdge(0, 4);
        graph4.addEdge(1, 0);
        graph4.addEdge(1, 3);
        graph4.addEdge(1, 5);
        graph4.addEdge(2, 0);
        graph4.addEdge(2, 3);
        graph4.addEdge(2, 6);
        graph4.addEdge(3, 1);
        graph4.addEdge(3, 2);
        graph4.addEdge(3, 7);
        graph4.addEdge(4, 0);
        graph4.addEdge(4, 5);
        graph4.addEdge(4, 6);
        graph4.addEdge(5, 1);
        graph4.addEdge(5, 4);
        graph4.addEdge(5, 7);
        graph4.addEdge(6, 2);
        graph4.addEdge(6, 4);
        graph4.addEdge(6, 7);
        graph4.addEdge(7, 3);
        graph4.addEdge(7, 5);
        graph4.addEdge(7, 6);
        System.out.println(graph4.toString());
        graph4.DFS(graph4);
        System.out.println("hasCycle=" + graph4.cycle);

        System.out.println("\nMore hasCycle() examples\n");


        AdjGraph graph5 = new AdjGraph(5);
        graph5.cycle = false;
        graph5.directed = true;
        graph5.addEdge(0, 1);
        graph5.addEdge(1, 2);
        graph5.addEdge(2, 3);
        System.out.println(graph5.toString());
        graph5.DFS(graph5);
        System.out.println("hasCycle=" + graph5.cycle + "\n");

        AdjGraph graph6 = new AdjGraph(10);
        graph6.cycle = false;
        graph6.directed = false;
        graph6.addEdge(0, 1);
        graph6.addEdge(2, 3);
        graph6.addEdge(8, 9);
        System.out.println(graph6.toString());
        graph6.DFS(graph6);
        System.out.println("hasCycle=" + graph6.cycle + "\n");

        AdjGraph graph7 = new AdjGraph(4);
        graph7.cycle = false;
        graph7.directed = true;
        graph7.addEdge(0, 1);
        graph7.addEdge(1, 2);
        graph7.addEdge(2, 1);
        graph7.addEdge(3, 1);
        System.out.println(graph7.toString());
        graph7.DFS(graph7);
        System.out.println("hasCycle=" + graph7.cycle + "\n");

        //BFS
        System.out.println("\nBFS\n");
        graph4.BFS(graph4);

    }
}