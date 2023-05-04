public class InsertSort{
  public static void main(String[]args){
    int a[]={0,3,4,5,1,2,7,4,7,9};
    for(int i=1;i<a.length;i++){
      int k=a[i];
      for(int j=i-1;j>=0;j--){
        if(k<a[j]){
          a[j+1]=a[j];
          if(j==0)
            a[j]=k;
        }
        else{
          a[j+1]=k;
          break;
        }
      }
    }
    for(int i=0;i<a.length;i++)
      System.out.print(a[i]+" ");
  }
}