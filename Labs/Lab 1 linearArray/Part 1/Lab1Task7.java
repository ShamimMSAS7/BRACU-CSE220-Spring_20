import java.util.Scanner;
public class Lab1Task7{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int x[]=new int[10];
    System.out.println("Enter the values of array");
    for(int i=0;i<x.length;i++)
      x[i]=sc.nextInt();
    System.out.println("Enter the cell number of array");
    int num=sc.nextInt();
    System.out.print("\"");
    for(int i=0;i<x[num];i++)
      System.out.print("*");
    System.out.println("\"");
  }
}