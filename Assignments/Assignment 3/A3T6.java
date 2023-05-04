public class A3T6{
  public static void print(int[]array,int idx){
    if(idx<array.length){
      double profit=calcProfit(array[idx]);
      System.out.println((idx+1)+". Investment: "+array[idx]+"; Profit: "+profit);
      print(array,idx+1);
    }
  }
  public static double calcProfit(int investment){
    if(investment<=25000)
      return 0;
    if(investment<=100000){
      return 4.5+calcProfit(investment-100);
    }
    return 8+calcProfit(investment-100);
  }
  public static void main(String[]args){
    int[]array={25000,100000,250000,350000};
    print(array,0);
  }
}