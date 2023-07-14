import java.util.Scanner;
public class Customer{
public String firstName;
public String secondName;
public int age;
public int roomNumber; 
   public void saveCustInfo(){
    System.out.println("FIRSTNAME : " + firstName);
    System.out.println("SECONDNAME : " + secondName);
    System.out.println("AGE : " + age);
    System.out.println("ROOM NUMBER" + roomNumber);
   }
   public static void main(String[] args) {
    Scanner cust = new Scanner(System.in);
    String firstName = cust.nextLine();
    String secondName = cust.nextLine();
    int age = cust.nextInt();
    int roomNumber = cust.nextInt();

    Customer customer = new Customer();
    customer.firstName = firstName;
    customer.secondName = secondName;
    customer.age = age;
    customer.roomNumber = roomNumber;
    customer.saveCustInfo(); 
    customer.saveCustInfo();
    cust.close();  
   }
}