public class Kvadrat {
    public double pow(double a){
        return Math.pow(a,2);
    }

    public static void main(String[] args) {
        Kvadrat kvadrat=new Kvadrat();
        System.out.println(kvadrat.pow(9.2));
    }
}
