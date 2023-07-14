public class Fun1{
    enum items {
        Book, Pen, Mobile_Phone, Erazer, Watch 
    }
    public static void main(String[] args) {
        for(items itm : items.values()){
            System.out.println(itm);
        }
    }
}