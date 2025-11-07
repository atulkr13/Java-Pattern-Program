import java.util.Scanner;
class Inverse_Pyramid
{
public static void main(String[] args)
{
Scanner scn = new Scanner(System.in);
System.out.println("Enter the number");
int n = scn.nextInt();
for(int i = n;i>=1;i--)
{
for(int j = 1;j<=n-i;j++)
{
System.out.print(" ");
}
for(int j = 1;j<=(2*i-1);j++)
{
System.out.print("X");
}
System.out.println();
}
}
}