import java.util.Scanner;
public class Fibonacci{
  static int []array;
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the term number of the Fibonacci number u want to know");
    int n=sc.nextInt();
    array=new int[n+1];
    System.out.println(recursion(n));
  }
  public static int recursion(int n){
    if(n==0 || n==1)
      return n;
    int k=0;
    if(array[n-1]!=0)
      k+=array[n-1];
    else
      k+=recursion(n-1);
    if(array[n-2]!=0)
      k+=array[n-2];
    else
      k+=recursion(n-2);
    array[n]=k;
    return k;
  }
}