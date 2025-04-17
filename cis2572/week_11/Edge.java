public class Edge {
    public int u; // starting node index
    public int v; // ending node index

    public Edge(int u, int v) {
        this.u = u;
        this.v = v;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Edge)) return false;
        Edge edge = (Edge) o;
        return u == edge.u && v == edge.v;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(u) * 31 + Integer.hashCode(v);
    }
}