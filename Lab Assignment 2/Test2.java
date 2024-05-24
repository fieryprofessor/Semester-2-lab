
abstract class Marks {
    int markICP;
    int markDSA;
    double percentage;

    public abstract void getPercentage();
}

class CSE extends Marks {
    int algoDesign;

    CSE(int markICP, int markDSA, int algoDesign) {
        this.markICP = markICP;
        this.markDSA = markDSA;
        this.algoDesign = algoDesign;
    }

     public void getPercentage() {
        int sum = markICP + markDSA + algoDesign;
        double p = (sum / 300.0) * 100;
        System.out.printf("Percentage for CSE is: "+"%.2f \n", p);
    }
}

class NonCSE extends Marks {
    int enggMechanics;

    NonCSE(int markICP, int markDSA, int enggMechanics) {
        this.markICP = markICP;
        this.markDSA = markDSA;
        this.enggMechanics = enggMechanics;
    }

    public void getPercentage() {
        int sum = markICP + markDSA + enggMechanics;
        double p = (sum / 300.0) * 100;
        System.out.printf("Percentage for NonCSE is: " + "%.2f \n", p);
    }
}

public class Test2 {
    public static void main(String args[]) {
        CSE s1 = new CSE(95, 90, 80);
        NonCSE s2 = new NonCSE(60, 40, 80);
        s1.getPercentage();
        s2.getPercentage();
    }
}
