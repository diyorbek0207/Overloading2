public class Yigindi {
    public int add(int a,int b){
       return a+b;
    }

    public double add(double a,double b){
        return a +b;
    }

    public static void main(String[] args) {
        Yigindi yigindi=new Yigindi();
        System.out.println(yigindi.add(78,45));
        System.out.println(yigindi.add(14.45,32.14));
    }
}
