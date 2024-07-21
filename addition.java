import java.util.Scanner;
public class Addition{
public static void main(String[] args){
int a,b,c;
Scanner s=new Scanner(System.in);
System.out.println("introduire deux nombres");
a=s.nextInt();
b=s.nextInt();
c=a+b;
System.out.println("la somme de deux nombres est :"+c);
}
}
