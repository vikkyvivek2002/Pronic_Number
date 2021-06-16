import java.util.Scanner;
class Pronic_Number
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter a number :"); 
int n = s.nextInt();
int a = 0;
for(int i=0; i<=n; i++)
{
if(i*(i+1) == n)
{
a++;
break;
}
}
if(a==1)
System.out.println("pronic Number");
else 
System.out.println("pronic Number");
}
}
