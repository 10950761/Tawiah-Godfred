//NAME : Godfred Tawiah 
// ID: 10950761 
import java.util.Scanner;
public class Book2 {
public static class Book {
// returning the classes
public String Title;
public String getTitle(){
return Title;
}
public String Author;
public String getAuthor(){
return Author;
}
public String ISBN;
public String getISBN(){
return ISBN;
}
public int Page_Count;
public int Page_Count(){
return Page_Count;
}
public double Price;
public double Price(){
return Price;
}
// Setting the classes method
public void setTitle(String Title){
this.Title = Title;
}
public void setAuthor(String Author){
this.Author = Author;
} 
public void setISBN(String ISBN){
this.ISBN = ISBN;
}
public void setPage_Count(int Page_Count){
this.Page_Count = Page_Count;
} 
public void setPrice(double Price){
this.Price = Price;
}
}
public static void main(String[] args) {
Scanner R = new Scanner(System.in);
String Title = R.nextLine();
String ISBN = R.nextLine();
String Author = R.nextLine();
int Page_Count = R.nextInt();
double Price = R.nextDouble();
Book book = new Book();
book.Title = Title;
book.ISBN = ISBN;
book.Author = Author;
book.Page_Count = Page_Count;
book.Price = Price;
System.out.println("Title : " + Title);
System.out.println("ISBN : " + ISBN);
System.out.println("Pages : " + Page_Count);
System.out.println("Author : " + Author);
System.out.println("Price : " + Price);
R.close();
}
}
