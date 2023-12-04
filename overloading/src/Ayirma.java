public class Ayirma {
    public int sub(int a,int b){
        return a-b;
    }
    public double sub(double a,double b){
        return a-b;
    }

    public static void main(String[] args) {
        Ayirma ayirma=new Ayirma();
        System.out.println(ayirma.sub(9,5));
        System.out.println(ayirma.sub(12.5,21.4));
    }
}
