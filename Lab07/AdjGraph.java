package Lab08;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by benjamin on 22/03/17.
 */
public class AdjGraph {
    // PART I
    int matrix[][];
    int V;
    boolean directed = false;

    AdjGraph(int V) {
        matrix = new int[V][V];
        this.V = V;
    }

    public void addEdge(int u, int v) {
        if (directed) {
            matrix[u][v] = 1;
        } else {
            matrix[u][v] = 1;
            matrix[v][u] = 1;
        }

    }

    public String toString() {
        String s = "";
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                s += matrix[i][j] + " ";
                if (j == V - 1) {
                    s += "\n";
                }
            }
        }
        return s;
    }

    public int degree(int v) {
        if (directed) {
            return inDegree(v) + outDegree(v);
        } else {
            return inDegree(v);
        }
    }

    public boolean isDirected() {
        return directed;
    }

    public int inDegree(int v) {
        int deg = 0;
        for (int i = 0; i < V; i++) {
            if (matrix[i][v] == 1) {
                deg += matrix[i][v];
            }
        }
        return deg;
    }

    public int outDegree(int v) {
        int deg = 0;
        for (int j = 0; j < V; j++) {
            if(matrix[v][j] == 1) {
                deg += matrix[v][j];
            }
        }
        return deg;
    }

    // PART II
    boolean cycle = false;
    int[] visited;
    public void DFS(AdjGraph G) {
        visited = new int[V];
        for (int i = 0; i < V; i++) {
            if(visited[i] != 1) {
                dfs(i);
            }
        }
    }

    public void dfs(int v) {
        visited[v] = 1;
        System.out.println("visiting vertex " + v);
        for (int j = 0; j < V; j++) {
            if(matrix[v][j] == 1 && visited[j] == 1 && inDegree(j) > 2) {
                cycle = true;
            }
            if(matrix[v][j] == 1 && visited[j] != 1) {
                dfs(j);
            }
        }
    }

    public boolean hasCycle(AdjGraph g) {
        return cycle;
    }

    public void BFS(AdjGraph G) {
        visited = new int[V];
        for (int i = 0; i < V; i++) {
            if (visited[i] != 1) {
                bfs(i);
            }
        }
    }

    Queue queue = new LinkedList();
    public void bfs(int v) {
        visited[v] = 1;
        //initialize a queue Q
        queue.add(v);
        System.out.println("visiting vertex " + v);
        while (!queue.isEmpty()){
            for (int i = 0; i < V; i++) {
                if(matrix[(int) queue.peek()][i] == 1 && visited[i] != 1) {
                    visited[i] = 1;
                    queue.add(i);
                    System.out.println("visiting vertex " + i);
                }
            }
            queue.remove();
        }
    }
}
