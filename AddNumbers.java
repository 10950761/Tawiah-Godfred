import java.util.*;
public class AddNumbers {
public int add;
public int a;
public int b;
public AddNumbers(int a, int b){
    this.a = a;
    this.b = b;
 }
 public int getADD(){
    return add = a + b;
 }
 public int getA(){
    return a;
 }
 public int getB(){
    return b;
 }
public void setA(int a){
    this.a = a;
}
public void setB(int b){
    this.b = b;
}
public static void main(String[] args) {
 System.out.println("Please enter two number to be add");
 Scanner n = new Scanner(System.in);
    int a = n.nextInt();
    int b = n.nextInt();
   AddNumbers addNumbers = new AddNumbers(a, b);
  int Add = addNumbers.getADD();
  System.out.println(Add);
  /*                                 */
System.out.println("Please enter two number to be add");
  int m = n.nextInt();
    int q = n.nextInt();
   AddNumbers addNumbers1 = new AddNumbers(m, q);
  int Add1 = addNumbers1.getADD();
  System.out.println(Add1);



}

}