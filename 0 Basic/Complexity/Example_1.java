public class Example_1 {
    public static void main(String args[])
    {
        int num = 4;
        int count =0;
        for (int i=0; i<num; i++)
            count = count + 1;
            System.out.println("The Loop Will Run "+count+" Time");
    }
}
/*
Time complexity here is O(N).

Beware that to print a string of length L it takes O(L) time though.
Here the length of the string we are printing is always 2,
so we may assume it takes constant O(1) time to print it.
 */
