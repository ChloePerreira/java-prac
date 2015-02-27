/**
 * Created by crystal on 2/24/15.
 */

public class connected {
    private int[] id;

    public static void main(String[] args) {
        String input = "http://algs4.cs.princeton.edu/15uf/tinyUF.txt";
        In in = new In(input);
        int N = in.readInt();
        connected qf = new connected(N);
        while (!in.isEmpty()) {
            int p = in.readInt();
            System.out.println(p);
            int q = in.readInt();
            System.out.println(q);
            if (!qf.connected(p, q)) {
                qf.union(p, q);
                StdOut.println(p + " " + q);
            }
        }
    }

    public connected(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++)
            if (id[i] == pid)
                id[i] = qid;
    }
}
