public class Tester{
  public static void main(String []args){
    int []array={3,7,-3,9,-3,100};
    KeyIndex k=new KeyIndex(array);
    System.out.println(k.search(101));
    k.sort();
    for(int i=0;i<k.k.length;i++)
      System.out.print(k.k[i]+" ");
    System.out.println();
  }
}