import java.util.Scanner;
public class A3T5{
  public static int i=1;
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    if(n<1)
      System.out.println("Wrong input");
    else{
      printL(n);
      printR(n);
    }
  }
  
  public static void printL(int n){
    if(n!=1){
      printL(n-1);
    }
    printN(n);
    System.out.println();
  }
  
  
  public static void printR(int n){
    if(n!=0){
      printS(n-1);
      printN(i);
      i++;
      System.out.println();
      printR(n-1);
    }
  }
  
  public static void printN(int n){
    if(n!=1)
      printN(n-1);
    System.out.print(n);
  }
  public static void printS(int n){
    if(n==0)
      return ;
    printS(n-1);
    System.out.print(" ");
  }
}