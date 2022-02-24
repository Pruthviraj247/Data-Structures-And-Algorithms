import java.util.Scanner;

public class SQRT {
    public static void main(String[] args)
    {
        Scanner New = new Scanner(System.in);

        System.out.println("Enter The Number");
        int Num = New.nextInt();
        System.out.println("Your Square Root Is: "+Math.sqrt(Num));
    }
}
