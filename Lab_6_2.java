import java.util.*;
class Book{
    private String author_name;
    public Book(String author_name){
        this.author_name = author_name;
    }
    public void display(){  
        System.out.println("Author name is: "+author_name);
    }
}
class Book_publication extends Book{
    private String title;
    public Book_publication(String title , String author_name){
        super(author_name);
        this.title = title;
    }
    public void display(){
        super.display();
        System.out.println("Title of the book is: "+this.title);
    }
}
class Paper_publication extends Book{
    private String title;
    public Paper_publication(String title ,String author_name ){
        super(author_name);
        this.title = title;
    }
    public void display(){
        super.display();
        System.out.println("Title: "+this.title);
    }
}
public class Lab_6_2{
    public static void main(String [] args){
        Book b;
        
        if(args[0].equals(("Book"))){
             b = new Book_publication(args[1] , args[2]);
        }
        else if(args[0].equals(("Paper"))){
             b = new Paper_publication(args[1] , args[2]);
        }
        else{
             b = new Book(args[1]);
        }
        b.display();
    }
}