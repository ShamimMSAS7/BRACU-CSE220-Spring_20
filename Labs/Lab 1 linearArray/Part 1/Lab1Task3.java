import java.util.Scanner;
public class Lab1Task3{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int x[]=new int[5];
    for(int i=0; i<x.length;i++)
      x[i]=sc.nextInt();
    for(int i=0;i<x.length-1;i++){
      for(int j=i+1;j<x.length;j++){
        if(x[j]>x[i]){
          int temp=x[i];
          x[i]=x[j];
          x[j]=temp;
        }
      }
    }
    for(int i=0;i<x.length-1;i++)
      System.out.print(x[i]+", ");
    System.out.print(x[x.length-1]);
    for(int i=0;i<x.length;i++){
      if(x[i]%2==0)
        System.out.print(", "+x[i]);
    }
    System.out.println();
  }
}