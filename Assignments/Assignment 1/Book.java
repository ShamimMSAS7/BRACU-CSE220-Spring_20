public class Book{
  private String name,id,author,publisher;
  Book(String n, String i, String a, String p){
    name=n;
    id=i;
    author=a;
    publisher=p;
  }
  public void setName(String n){
    name=n;
  }
  public void setId(String i){
    id=i;
  }
  public void setAuthor(String a){
    author=a;
  }
  public void setPublisher(String p){
    publisher=p;
  }
  public String getName(){
    return name;
  }
  public String getId(){
    return id;
  }
  public String getAuthor(){
    return author;
  }
  public String getPublisher(){
    return publisher;
  }
}