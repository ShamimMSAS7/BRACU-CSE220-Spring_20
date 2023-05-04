import java.util.Scanner;
public class BookRecords{
  Book []bookArray=new Book[1];
  int size=0;
  Scanner sc=new Scanner(System.in);
  
  
  public void addRecord(){
    if(size==bookArray.length){
      resize();
    }
    System.out.println("Enter the name of the book");
    String name=sc.nextLine();
    System.out.println("Enter the id of the book");
    String id=sc.nextLine();
    System.out.println("Enter the name of the author of the book");
    String author=sc.nextLine();
    System.out.println("Enter the name of the publisher of the book");
    String publisher=sc.nextLine();
    bookArray[size++]=new Book(name,id,author,publisher);
  }
  
  
  public void printRecord(){
    sort();
    for(int i=0;i<size;i++){
      System.out.println("Book Name: "+bookArray[i].getName());
      System.out.println("Book ID: "+bookArray[i].getId());
      System.out.println("Author Name: "+bookArray[i].getAuthor());
      System.out.println("Publisher Name: "+bookArray[i].getPublisher());
      System.out.println("******************************");
    }
  }
  
  
  public void deleteRecord(){
    System.out.println("Enter the id of the book u want to delete");
    String id=sc.nextLine();
    int index=-1;
    for(int i=0;i<size;i++){
      if(bookArray[i].getId().equals(id)){
        index=i;
        break;
      }
    }
    if(index==-1){
      System.out.println("Deletion failed\nID "+id+" does not exist");
    } else{
      for(int i=index;i<size-1;i++)
        bookArray[i]=bookArray[i+1];
      bookArray[size-1]=null;
      size--;
      System.out.println("Deletion succeeded\nID "+id+" is deleted");
    }
  }
  
  
  public void editRecord(){
    System.out.println("Enter the id of the book u want to edit");
    String id=sc.nextLine();
    int index=-1;
    for(int i=0;i<size;i++){
      if(id.equals(bookArray[i].getId())){
        index=i;
        break;
      }
    }
    if(index==-1){
      System.out.println("ID "+id+" does not exist");
    } else{
      for(;;){
        System.out.println("Enter 1 to edit book name\nEnter 2 to edit publisher name\nEnter 3 to edit both");
        int num=sc.nextInt();
        sc.nextLine();
        if(num==1){
          System.out.println("Enter new name of the book");
          bookArray[index].setName(sc.nextLine());
          break;
        } else if(num==2){
          System.out.println("Enter new publisher name of the book");
          bookArray[index].setPublisher(sc.nextLine());
          break;
        } else if(num==3){
          System.out.println("Enter new name of the book");
          bookArray[index].setName(sc.nextLine());
          System.out.println("Enter new publisher name of the book");
          bookArray[index].setPublisher(sc.nextLine());
          break;
        }else
          System.out.println("Wrong input");
      }
    }
  }
  
  
  public void resize(){
    Book []msas=new Book[size+1];
    for(int i=0;i<size;i++)
      msas[i]=bookArray[i];
    bookArray=msas;
  }
  
  
  public void sort(){
    for(int i=0;i<size-1;i++){
      for(int j=i+1;j<size;j++){
        if(bookArray[i].getName().compareTo(bookArray[j].getName())>0 || (bookArray[i].getName().compareTo(bookArray[j].getName())==0 && bookArray[i].getId().compareTo(bookArray[j].getId())>0)){
          Book msas=bookArray[i];
          bookArray[i]=bookArray[j];
          bookArray[j]=msas;
        }
      }
    }
  }
}