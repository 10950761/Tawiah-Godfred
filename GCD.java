import java.util.Scanner;
public class GCD {
public int x;
public int y;
public int gcd;
public GCD (int x, int y){
this.x = x;
this.y = y;
}

public int getX() {
    return x;
}

public void setX(int x){
    this.x = x;
}
public int getY(){
    return y;
}
public void setY(int y){
    this.y = y;
}
public int getGCD(){
    return gcd;
}
public void setGCD(){
    if(x==0){
        this.x = 0;
    }
    else {
   this.x = x%y;
    }
}
public static void main(String[] args) {
    Scanner abc = new Scanner(System.in);
    int x = abc.nextInt();
    int y = abc.nextInt();
    GCD axc = new GCD(x, y);
    int gcd = axc.getGCD();
    System.out.println(gcd);
    abc.close();
}
    
}