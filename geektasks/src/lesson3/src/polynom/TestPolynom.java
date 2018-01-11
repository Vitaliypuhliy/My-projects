package lesson3.src.polynom;

public class TestPolynom {
    public static void main(String[] args) {
        Polynom polynom = new Polynom(-1, 2, -1);
        Polynom polynom1 = new Polynom(-1, 1, -1);
        Polynom polynom2 = new Polynom(2,3,1);
        polinomPrintSolution(polynom);
        polinomPrintSolution(polynom1);
        polinomPrintSolution(polynom2);
    }
    static void polinomPrintSolution(Polynom polynom){
        int rootOFPolynom[];
        rootOFPolynom = polynom.roots();
        if (rootOFPolynom == null){
            System.out.println("No solution ");
        }else if (rootOFPolynom.length == 1){
            System.out.printf("Root = %d\n",rootOFPolynom[0]);
        }else {
            System.out.printf("Root1 = %d Root2 = %d\n",rootOFPolynom[0],rootOFPolynom[1]);
        }
    }

}
