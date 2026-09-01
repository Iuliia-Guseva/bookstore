package bookstore.domain;

public class Book { 

    private String title;
    private String author;
    private Integer publicaionYear; //Integer = can be null; int = cannot be null.
    private String isbn;
    private Double price; //Double = can be null; double = cannot be null.

    public Book(String title, String author, int publicaionYear, 
        String isbn, double price){

        this.title = title;
        this.author = author;
        this.publicaionYear = publicaionYear;
        this.isbn = isbn;
        this.price = price;   
    }

    //create a null object so Spring can create an empty form 
        //before the user enters data
    public Book(){

        this.title = null;
        this.author = null;
        this.publicaionYear = null;
        this.isbn = null;
        this.price = null; 
    }

    // getter: returns the field value
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public Integer getPublicationYear(){
        return publicaionYear;
    }
    public String getIsbn(){
        return isbn;
    }
    public Double getPrice(){
        return price;
    }

    //setter: updates the field value
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPublicationYear(Integer publicaionYear){
        this.publicaionYear = publicaionYear;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public void setPrice(Double price){
        this.price = price;
    }
}
