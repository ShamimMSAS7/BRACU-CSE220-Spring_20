public class Lab1Task13{
  public static int [] removeOdd (int [] input){
    int count=0;
    for(int i=0;i<input.length;i++){
      if(input[i]%2==0)
        count++;
    }
    int []array=new int[count];
    for(int i=0,j=0;i<input.length;i++){
      if(input[i]%2==0)
        array[j++]=input[i];
    }
    return array;
  }
  public static void main(String [] args){
    int [] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
    for (int i = 0; i < mixedArray.length; i++) {
      System.out.print(mixedArray[i] + " ");
    }
    System.out.println();
    int [] noOdd = removeOdd(mixedArray);
    for (int i = 0; i < noOdd.length; i++) {
      System.out.print(noOdd[i] + " ");
    }    
  }
}
