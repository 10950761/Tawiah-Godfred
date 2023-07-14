 import java.util.Scanner;
  public class Min {
    public int num1;
    public int num2;
    public int num3;
     public  Min(int num1,int num2,int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3; 
     }
public int getNum1(){
    return num1;
}
public void setNum1(int num1){
    if(num1 < num2 && num1 < num3){
        this.num1 = num1;
        System.out.println(num1);
    }
}
public int getNum2(){
    return num2;
}
public void setNum2(int num2){
    if(num1 > num2 && num2 <  num3){
        this.num2 = num2;
        System.out.println(num2);
    }
}
public int getNum3(){
 return num3;
}
public void setNum3(int num3){
    if(num1 > num3 && num2 > num3){
        this.num3 = num3;
        System.out.println(num3);
    }
}
public static void main(String[] args) {
    Scanner min = new Scanner(System.in);
    int num1 = min.nextInt();
    int num2 = min.nextInt();
    int num3 = min.nextInt();
    Min nim = new Min(num1, num2, num3);
    nim.setNum1(num1);
    nim.setNum2(num2);
    nim.setNum3(num3);
                 System.out.println("----------------------------------------------");
    int num4 = min.nextInt();
    int num5 = min.nextInt();
    int num6 = min.nextInt();
    Min nin = new Min(num4, num5, num6);
    nin.setNum1(num4);
    nin.setNum2(num5);
    nin.setNum3(num6);

    min.close();
}

    }

    

