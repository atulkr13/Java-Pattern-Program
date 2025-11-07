import java.util.Scanner;
class Number_with_cross
{
public static void main(String[] args)
{
Scanner scn = new Scanner(System.in);
System.out.println("Enter the number");
int n = scn.nextInt();
for(int i = 1;i<=n;i++)
{
for(int j = n;j>=i;j--)
{
System.out.print(j);
if(j > i)
{
System.out.print("X");
}
}
System.out.println();
}
}
}