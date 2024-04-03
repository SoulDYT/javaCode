package book;

public class BookList {
    private Book[] books = new Book[10];
    private int usedSize;//记录书架有多少本书

    public BookList() {
        this.books[0] = new Book("三国演义", "罗贯中", 89, "小说");
        this.books[1] = new Book("西游记", "吴承恩", 78, "小说");
        this.books[2] = new Book("红楼梦", "曹雪芹", 49, "小说");
        this.usedSize = 3;
    }

    public Book getBook(int pos){
        return this.books[pos];
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    public void setBook(Book book){
        this.books[usedSize] = book;
    }
    public void setBook(int pos,Book book){
        this.books[pos] = book;
    }
}
