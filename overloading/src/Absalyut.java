public class Absalyut {
    public int abs(int a){
        return Math.abs(a);
    }
    public double abs(double a){
        return Math.abs(a);
    }

    public static void main(String[] args) {
        Absalyut absalyut=new Absalyut();
        System.out.println(absalyut.abs(45));
        System.out.println(absalyut.abs(-47.2));
    }
}
