public class Operators {
    public static void main(String[] args) {
        int a1 = 30;
        int a2 = 45;
        if (a1 == a2) {
            System.out.println("The numbers " + a1 + " and " + a2 + " are equal.");
        } else {
            System.out.println("The numbers " + a1 + " and " + a2 + " are not equal.");
        }

        int c = 55;
        int d = 70;

        boolean conditiona11 = c < 50;
        boolean conditiona12 = c < d;
        if (conditiona11 && conditiona12) {

            System.out.println("Both are ture.");
        } else {
            System.out.println("Both are false.");
        }
        int Eng = 78;
        int Math = 45;
        int Social = 62;
        float totalmarks = Eng + Math + Social;
        System.out.println("Total marks are " +totalmarks);
        float percentage = (totalmarks * 100) / 300;
        System.out.println("Percent Marks are " +percentage);

    }
}


