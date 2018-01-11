package lesson3.src.polynom;

public class Polynom {
    private double a;
    private double b;
    private double c;
    private  double discriminant;

    public Polynom(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        discriminant = calculateDiscriminant();
    }

    public double calculateDiscriminant(){
        double d = b*b - 4*a*c;
        return d;
    }
    public boolean canCalculateRoot(){
        if(discriminant >= 0 ){
            return true;
        }
        return false;
    }
    public int[] roots(){
        int[] root =null;
        if(canCalculateRoot()){
            if (discriminant == 0) {
                root = new int[1];
                return new int[]{root[0] = (int) ((-b + Math.sqrt(calculateDiscriminant())) / 2 * a)};
            }else {
                root = new int[2];
                root[0] = (int) ((-b + Math.sqrt(calculateDiscriminant())) / 2 * a);
                root[1] = (int) ((-b - Math.sqrt(calculateDiscriminant())) / 2 * a);
            }
        }
    return root;
    }
}
