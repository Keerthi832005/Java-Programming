import java.util.scanner;
class area{
    public static void main(String[] args){
        float l,b,area;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the length value:");
        l=in.nextInt();
        System.out.println("enter the breadth");
        b=in.nextInt();
        area=l*b;
        System.out.println("area of rectangke is:"+area);
    }
}