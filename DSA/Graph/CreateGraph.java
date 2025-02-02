import java.util.*;

public class CreateGraph {
    private Map<Integer, List<Integer>> adjList;

    public CreateGraph() {
        adjList = new HashMap<>();
    }

    /*
        source/start          target/destination
               u -------------> v
    */

    public void addEdges(int u, int v) {
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.putIfAbsent(v, new ArrayList<>());
        adjList.get(u).add(v);
    }

    // DFS using recursion
    public void DFS(int v) {
        if (adjList.isEmpty()) return; // If the graph is empty, no need to perform DFS

        boolean[] visited = new boolean[adjList.size()];  // Fix: Use instance variable size safely
        System.out.println("DFS Traversal:");
        dfsUtil(v, visited);  // Start DFS from vertex v
        System.out.println();
    }

    // Helper function for DFS
    private void dfsUtil(int node, boolean[] visited) {
        visited[node] = true;  // Mark the node as visited
        System.out.print(node + " ");  // Process the node (just print it)

        // Recursively visit all unvisited neighbors
        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited);
            }
        }
    }
	
	public void BFS(int start){
		if(adjList.isEmpty()) return;
		boolean[] visited=new boolean[adjList.size()];
		Queue<Integer>queue=new LinkedList<>();
		queue.offer(start);
		visited[start]=true;
		
		while(!queue.isEmpty()){
			int node=queue.poll();
			System.out.print(node + " ");
			
			for(int neighbor:adjList.get(node)){
				if(!visited[neighbor]){
					visited[neighbor]=true;
					queue.offer(neighbor);
				}
			}
		}
	}

    public static void main(String[] args) {
        int vertices = 4;
        CreateGraph graph = new CreateGraph();
        graph.addEdges(0, 1);
        graph.addEdges(0, 2);
        graph.addEdges(1, 2);
        graph.addEdges(1, 3);

        // Call DFS on the graph
        graph.DFS(0);  // Start DFS from vertex 0
		System.out.println("BFS : ");
		graph.BFS(0);
    }
}
