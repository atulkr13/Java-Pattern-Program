import java.util.Scanner;
class snake2_Pattern
{
public static void main(String[] args)
{
Scanner scn = new Scanner(System.in);
System.out.println("Enter the number");
int n = scn.nextInt();
int x;
for(int i = 1;i <= n;i++)
{
if(i % 2 != 0)
{
x = (i-1)*n;
for(int j = 1;j<=n;j++)
{
x++;
System.out.print(x+"\t");
}
}
else
{
x = i*n;
for(int j = 1;j<=n;j++)
{
System.out.print(x+"\t");
x--;
}
}
System.out.println();
}
}
}
