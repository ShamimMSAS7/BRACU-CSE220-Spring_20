import java.util.Scanner;
public class Lab1Task2{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int []array=new int[10];
    array[0]=sc.nextInt();
    int maxAt=0, minAt=0;
    for(int i=1; i<array.length;i++){
      array[i]=sc.nextInt();
      if(array[i]<array[minAt])
        minAt=i;
      if(array[i]>array[maxAt])
        maxAt=i;
    }
    int temp=array[minAt];
    array[minAt]=array[maxAt];
    array[maxAt]=temp;
    for(int i=0;i<array.length-1;i++)
      System.out.print(array[i]+", ");
    System.out.println(array[array.length-1]);
  }
}