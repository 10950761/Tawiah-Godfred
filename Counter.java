public class Counter {
    public static int count = 50;
    Counter(){
        count --;
    }
    public static void main(String[] args) {
        Counter count1 = new Counter();
        Counter count2 = new Counter();
        Counter count3 = new Counter();
        Counter count4 = new Counter();
        Counter count5 = new Counter();
        Counter count6 = new Counter();
        Counter count7 = new Counter();
        Counter count8 = new Counter();

        System.out.println(count1.count);
        System.out.println(count1.count);
        System.out.println(count1.count);
        System.out.println(count1.count);
        System.out.println(count1.count);
        System.out.println(count1.count);
        System.out.println(count1.count);
        System.out.println(count1.count);
        System.out.println(count1.count);
        System.out.println(count1.count);
    }
    
}
