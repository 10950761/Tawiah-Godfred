/*This has a constructor */
import java.util.Scanner;
public class Volume_R {
    public int length;
    public int width;
    public int heigth;
    public int volume;
    public  Volume_R(int length, int width,int heigth){
        this.heigth = heigth;
        this.length = length;
        this.width = width;
    }
    public int getVolume(){
        return volume = length*heigth*width;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }
    public int getHeigth(){
        return heigth;
    }
 public void setHeight(int heigth){
    this.heigth = heigth;
 }
 public void setLength(int length){
    this.length = length;
 }
 public void setWidth(int width){
    this.width = width;
 }
public static void main(String[] args) {
    System.out.println("Length: " + "Width: " + "Heigth: ");
    Scanner vl = new Scanner(System.in);
    int length = vl.nextInt();
    int width = vl.nextInt();
    int heigth = vl.nextInt();
    Volume_R vol = new Volume_R(length, width, heigth);
    int vlm = vol.getVolume();
    System.out.println("Volume of Rectangle: " + vlm);
vl.close();
}
}
