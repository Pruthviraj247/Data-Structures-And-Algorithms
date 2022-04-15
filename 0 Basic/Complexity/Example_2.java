public class Example_2 {
    public static void main(String args[])
    {
        int num = 4;
        int count =0;
        for (int i=0; i<num; i++)
            for (int j = 0; j<num; j++)
                count = count + 1;
        System.out.println("The Loop Will Run "+count+" Time");
    }
}
/*
If you calculate the number of times we print "count" here,
you will get N * (1 + N) / 2 (Hint: use formula for the sum of arithmetic sequence).
You can write it as N2/2 + N/2 which is O(N^2).
We Get O(N^2)

 */
