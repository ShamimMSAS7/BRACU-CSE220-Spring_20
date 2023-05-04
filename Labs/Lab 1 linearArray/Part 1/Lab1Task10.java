public class Lab1Task10{
  public String season(int month,int date){
    if(month==1 || month==2 || (month==12 && date>=16) || (month==3 && date<=15))
      return "Winter";
    else if(month==4 || month==5 || (month==3 && date>=16) || (month==6 && date<=15))
      return "Spring";
    else if(month==7 || month==8 || (month==6 && date>=16) || (month==9 && date<=15))
      return "Summer";
    else
      return "Fall";
  }
}