public class Lab1Task12{
  public boolean comesFirst(int month1,int day1, int month2, int day2){
    if(month1<month2 ||(month1==month2 && day1<day2))
      return true;
    return false;
  }
}