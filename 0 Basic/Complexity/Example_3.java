public class Example_3 {
    public static void main(String args[])
    {
        int  n=9;
        for (int i = 1; i <= n; i++){
            for(int j = 1; j < n; j = j * 2) {
                System.out.println("Hey - I'm Free At: " + i + " PM And " + j+" PM");
            }
        }
    }
}
/*
Here, the inner loop is executed N + (N / 2) + (N / 3) + ... times.
We can rewrite it as N × (1 + 1/2 + 1/3 + ...), and with the formula for the sum of harmonic series,
we will get O(NlogN) runtime.

 */
