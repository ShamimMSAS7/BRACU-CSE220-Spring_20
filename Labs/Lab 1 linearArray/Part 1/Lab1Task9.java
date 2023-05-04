import java.util.Scanner;
public class Lab1Task9{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int x[]=new int[10];
    System.out.println("Enter the values of array");
    for(int i=0;i<x.length;i++)
      x[i]=sc.nextInt();
    displayArray(x,10);
    int []y=findSquares(x,10); 
    displayArray(y,10);
  }
  public static void displayArray(int[] array,int size){
    for(int i=0;i<size-1;i++)
      System.out.print(array[i]+", ");
    System.out.println(array[size-1]);
  }
  public static int[] findSquares(int[] array,int size){
    int array2[]=new int[size];
    for(int i=0;i<array2.length;i++)
      array2[i]=array[i]*array[i];
    return array2;
  }
}