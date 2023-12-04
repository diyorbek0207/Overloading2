public class Bulinma {
    public int div(int a,int b){
        return a/b;
    }
    public double div(double a, double b){
        return a/b;
    }

    public static void main(String[] args) {
        Bulinma bulinma=new Bulinma();
        System.out.println(bulinma.div(52,41));
        System.out.println(bulinma.div(14.5,9.32));
    }
}
