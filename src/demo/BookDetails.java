package demo;

/**
 * Created by asus on 10/29/2015.
 */
public class BookDetails {
    private String bookId = null;
    private String title = null;
    private String firstName = null;
    private String surname = null;
    private float price = 0.0F;
    private boolean onSale = false;
    private int year = 0;
    private String description = null;
    private int inventory = 0;

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public float getPrice() {
        return price;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public int getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }

    public int getInventory() {
        return inventory;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
}
