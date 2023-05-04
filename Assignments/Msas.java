public class Msas{
  public static void main(String[]args){
    int arr[]={10,20,30,50,70};
//    sort(arr,0);
    System.out.println(search(arr,10,0,4));
  }
  public static boolean search(int []a, int n,int l,int r){
    if(r<l)
      return false;
    int m=(l+r)/2;
    if(a[m]==n)
      return true;
    if(a[m]>n)
      r=m-1;
    else
      l=m+1;
    return search(a,n,l,r);
  }
  
  public static int findMin(int []arr,int i){
    if(i==arr.length-1)
      return i;
    int minIndex=findMin(arr,i+1);
    if(arr[i]<arr[minIndex])
      return i;
    return minIndex;
  }
  public static void sort(int[]arr,int i){
    if(i==arr.length-1)
      return ;
    int temp=arr[i];
    int minIndex=findMin(arr,i);
    arr[i]=arr[minIndex];
    arr[minIndex]=temp;
    sort(arr,i+1);
  }
}