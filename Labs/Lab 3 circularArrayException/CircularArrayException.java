public class CircularArrayException extends Exception{
  String hi;
  CircularArrayException(String s){
    hi=s;
  }
  public String toString(){
    return hi;
  }
}