interface PrintName{
    public String myname(String name);
}
public class LambdaExpressionWithParameters{
    public static void main(String[] args) {
        PrintName p1=(name)->{return "Hello, "+name;};
        System.out.println(p1.myname("Ramar"));
        System.out.println(p1.myname("Ramar Kalangiam"));
    }
}
