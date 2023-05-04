public class BinarySearch{
  public static void main(String[]args){
    int []array={1,4,7,8,9,30};
    System.out.println(search(array,700));
  }
  public static boolean search(int []a, int n){
    int l=0;
    int r=a.length-1;
    while(l<=r){
      if(a[(l+r)/2]==n)
        return true;
      else if(a[(l+r)/2]>n)
        r=(l+r)/2-1;
      else
        l=(l+r)/2+1;
    }
    return false;
  }
}