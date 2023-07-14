import java.util.StringTokenizer;

public class Country {
    public String name;
    public String capital;
    public static void main(String[] args) {
        Country count = new Country();
        count.name = "Ghana";
        count.capital = "Accra";
        String c = count.name;
        String d = count.capital;
        System.out.println("Country : " + c);
        System.out.println("Capital : " + d);
    }
}
