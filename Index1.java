

public class Index1 {
    public int x;
    public int y;

   Index1(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
     return x;
    }
public void SetX(int x){
    this.x = x;
}

public int getY(){
    return y;
   }
public void SetY(int y){
   this.y = y;
}


    public static void main(String[] args) {
        Index1 index1 = new Index1(4,7);
        int c = index1.x;
        int r = index1.y;
        System.out.print( "x : " + c + ", y : " + r);
}
    
}
