import java.util.Scanner;
class Rectangle_Pattern
{
public static void main(String[] args)
{
Scanner scn = new Scanner(System.in);
System.out.println("Enter the number");
int n = scn.nextInt();
for(int i = 1;i<=n;i++)
{
for(int j = 1;j <= n;j++)
{
System.out.print("X");
}
System.out.println();
}
}
}