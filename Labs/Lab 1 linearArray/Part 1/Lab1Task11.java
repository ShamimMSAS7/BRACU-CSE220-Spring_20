public class Lab1Task11{
  public boolean allDigitsOdd(int num){
    for(;num/10!=0 || num%10!=0;num/=10){
      if((num%10)%2==0)
        return false;
    }
    return true;
  }
}