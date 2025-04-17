import java.util.*;

public abstract class Graph<V> {
    protected List<V> vertices = new ArrayList<>();
    protected List<List<Integer>> neighbors = new ArrayList<>();

    protected Graph() { }

    protected Graph(List<V> vertices, List<Edge> edges) {
        this.vertices = vertices;

        for (int i = 0; i < vertices.size(); i++) {
            neighbors.add(new ArrayList<>());
        }

        for (Edge edge : edges) {
            neighbors.get(edge.u).add(edge.v);
        }
    }

    public int getSize() {
        return vertices.size();
    }

    public List<V> getVertices() {
        return vertices;
    }

    public V getVertex(int index) {
        return vertices.get(index);
    }

    public int getIndex(V v) {
        return vertices.indexOf(v);
    }

    public List<Integer> getNeighbors(int index) {
        return neighbors.get(index);
    }

    public SearchTree dfs(int v) {
        List<Integer> searchOrder = new ArrayList<>();
        int[] parent = new int[vertices.size()];
        Arrays.fill(parent, -1);

        boolean[] isVisited = new boolean[vertices.size()];
        dfs(v, parent, searchOrder, isVisited);

        return new SearchTree(v, parent, searchOrder);
    }

    private void dfs(int v, int[] parent, List<Integer> searchOrder, boolean[] isVisited) {
        isVisited[v] = true;
        searchOrder.add(v);

        for (int i : neighbors.get(v)) {
            if (!isVisited[i]) {
                parent[i] = v;
                dfs(i, parent, searchOrder, isVisited);
            }
        }
    }

    public class SearchTree {
        private int root;
        private int[] parent;
        private List<Integer> searchOrder;

        public SearchTree(int root, int[] parent, List<Integer> searchOrder) {
            this.root = root;
            this.parent = parent;
            this.searchOrder = searchOrder;
        }

        public int getRoot() {
            return root;
        }

        public int getParent(int v) {
            return parent[v];
        }

        public List<Integer> getSearchOrder() {
            return searchOrder;
        }

        public int getNumberOfVerticesFound() {
            return searchOrder.size();
        }
    }
}