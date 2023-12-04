public class Kupaytma {
    public int multiply(int a, int b){
        return a*b;
    }
    public double multiply(double a,double b){
        return a*b;
    }

    public static void main(String[] args) {
        Kupaytma kupaytma=new Kupaytma();
        System.out.println(kupaytma.multiply(12,32));
        System.out.println(kupaytma.multiply(20.1,12.3));

    }
}
