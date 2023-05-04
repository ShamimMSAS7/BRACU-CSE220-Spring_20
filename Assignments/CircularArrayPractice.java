public class CircularArrayPractice{
  public static void main(String[]args){
    
    int []cir={0,0,3,6,8,11,2,0}; //circ array starting from 2, size 5
    int [] add={1,3,7,2,15,22};
    insertUnique(cir,add,2,5); //inserts each element from the add array to the circ array only if it is unique and
    //  prints the array if insertion is succesful 
    // otherwise prints that the element already exists and proceeds on inserting the next element
    //Output:
    // 1 inserted succesfully {0,1,3,6,8,11,2,0}
    // 3 not inserted, element already exists
    // 7 inserted succesfully {7,1,3,6,8,11,2,0}
    // 2 not inserted, element already exists
    // 15 inserted succesfully {7,1,3,6,8,11,2,15}
    // 22 inserted successfully {7,1,3,6,8,11,2,0,22,15}
    
  }
  
  //complete the insertUnique method and write any other additional method if necessary so that the output above is shown
  public static void insertUnique(int [] c, int []a, int st, int sz){
    for(int i=0;i<a.length;i++){
      int count=0;
      for(int j=st;j<sz;j++){
        if(a[i]==c[j]){
          System.out.println(a[i]+" not inserted, element already exists");
          count++;
          break;
        }
      }
      if(count==0){
        if(sz==c.length){
          int []t=new int[c.length+2];
          for(int k=0;k<sz;k++){
            t[(st+2+k)%t.length]=c[(st+k)%c.length];
          }
          c=t;
          st+=2;
        }
        st=st-1;
        if(st<0)
          st=c.length-1;
        c[st]=a[i];
        sz++;
        System.out.print(a[i]+" inserted successfully {");
        for(int k=0;k<c.length-1;k++){
          System.out.print(c[k]+",");
        }
        System.out.println(c[c.length-1]+"}");
      }
    }
  }
}