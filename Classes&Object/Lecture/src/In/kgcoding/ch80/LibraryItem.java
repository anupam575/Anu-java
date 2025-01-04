package In.kgcoding.ch80;

public class LibraryItem {
    private String itemId;// attributes
    private String title; //property
    private String author;
    public void checkout() {
        System.out.println("checkout");
    }
    public void returnItem() {
        System.out.println("Returning the item");
    }


}
