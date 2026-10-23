public class Book {
    // Create a Book class with appropriate getters, setters, constructors and methods.

    // Properties
    private int id; // id: int
    private String isbn; // isbn: String
    private String title; // title: String
    private boolean isCheckedOut; // isCheckedOut: boolean
    private String checkedOutTo; // checkedOutTo: String

    // Constructor
    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }

    // Default constructor
    public Book() {
        this.id = 0;
        this.isbn = "";
        this.title = "";
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    // Methods
    void checkOut(String name) {
        setCheckedOutTo(name); // checkedOutTo set to the name provided
        setCheckedOut(true); // // isCheckedOut set to true
    }


    void checkIn() {

    }
}
