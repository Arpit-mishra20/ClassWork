public class Book{
private static String title;
private static String author;
private static int price;
public Book(String title,String author,int price){
this.title=title;
this.author=author;
this.price=price;

}
public void DisplayBookDetails(){
System.out.println("Book Title: "+title);
System.out.println("Book Author: "+author);
System.out.println("Book Price: "+price);


}


public static void main(String[] args){
Book book1=new Book("Rich Dad Poor Dad","Robert",500);
System.out.println("Books are:");
book1.DisplayBookDetails();
}
}
