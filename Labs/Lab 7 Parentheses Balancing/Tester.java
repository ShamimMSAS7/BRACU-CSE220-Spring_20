import java.util.Scanner;
public class Tester{
  public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the expression");
    String string=sc.nextLine();
    String result="msas";
    Stack s=new ListStack();
    for(int i=0;i<string.length();i++){
      char c=string.charAt(i);
      if(c=='(' || c=='{' || c=='[')
        s.push(c);
      if(c==')' || c=='}' || c==']'){
        if(s.isEmpty()){
          result="Incorrect. There is an extra closing bracket";
          break;
        } else if((c==')' && String.valueOf(s.peek()).charAt(0)!='(') || (c=='}' && String.valueOf(s.peek()).charAt(0)!='{') ||(c==']' && String.valueOf(s.peek()).charAt(0)!='[')){
          result="Incorrect. ";
          if(String.valueOf(s.peek()).charAt(0)=='(')
            result+="For an opening first brace ";
          else if(String.valueOf(s.peek()).charAt(0)=='{')
            result+="For an opening curly brace ";
          else if(String.valueOf(s.peek()).charAt(0)=='[')
            result+="For an opening square brace ";
          if(c==')')
            result+="there is a closing first brace";
          else if(c=='}')
            result+="there is a closing curly brace";
          else if(c==']')
            result+="there is a closing square brace";
          break;
        }else
          s.pop();
      }
    }
    if(result.equals("msas")){
      if(s.isEmpty())
        result="Correct";
      else
        result="Incorrect. There is an extra opening brace";
    }
    System.out.println(result);
  }
}