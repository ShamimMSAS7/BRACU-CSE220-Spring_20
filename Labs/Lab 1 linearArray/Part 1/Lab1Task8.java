import java.util.Scanner;
public class Lab1Task8{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of row matrices");
    int size=sc.nextInt();
    int x[]=new int[size];
    int y[]=new int[size];
    int z[]=new int[size];
    System.out.println("Enter the values of first matrix");
    for(int i=0;i<x.length;i++)
      x[i]=sc.nextInt();
    System.out.println("Enter the values of second matrix");
    for(int i=0;i<x.length;i++){
      y[i]=sc.nextInt();
      z[i]=5*x[i]-y[i];
    }
    for(int i=0;i<z.length-1;i++)
      System.out.print(z[i]+" ");
    System.out.println(z[z.length-1]);
  }
}