public class Book {
    public int x;
    public int y;
    public int sum(int x, int y){
        return x + y;
    }
    public int sub(int x, int y){
        return y - x;
    }
    public static void main(String[] args) {
        Book book = new Book();
        int k = book.sub(5,2);
        System.out.println(k);
    }
}
