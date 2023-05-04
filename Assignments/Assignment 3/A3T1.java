import java.util.Scanner;
public class A3T1{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the base");
    int b=sc.nextInt();
    System.out.println("Enter the power");
    int p=sc.nextInt();
    if(b<1 || p<1)
      System.out.println("Wrong input");
    else
      System.out.println(power(b,p));
  }
  
  public static int power(int m,int n){
    if(n==0)
      return 1;
    return m*power(m,n-1);
  }
}