import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Načtení hodnot od uživatele
        System.out.print("Zadejte hodnotu pro a: ");
        double a = scanner.nextDouble();

        System.out.print("Zadejte hodnotu pro b: ");
        double b = scanner.nextDouble();

        // Výpočty
        double powerAB = Math.pow(a, b);  //1
        double max = Math.max(a, b);  //2
        int integerPartA = (int) a; //3
        long roundedB = Math.round(b); //4
        double sqrtB = Math.sqrt(b); //5
        double sinA = Math.sin(a); //6
        double cosB = Math.cos(b); //7
        double product = a * b; //8
        double cubeRootA = Math.cbrt(a); //9   taky: Math.pow(a, 1/3)
        double min = Math.min(a, b); //10

        // Výstupy
        System.out.println("a^b: " + powerAB);
        System.out.println("Větší z čísel a, b: " + max);
        System.out.println("Celá část čísla a: " + integerPartA);
        System.out.println("Číslo b zaokrouhlené na celá čísla: " + roundedB);
        System.out.println("Druhá odmocnina z čísla b: " + sqrtB);
        System.out.println("sin(a): " + sinA);
        System.out.println("cos(b): " + cosB);
        System.out.println("a * b: " + product);
        System.out.println("Třetí odmocnina z čísla a: " + cubeRootA);
        System.out.println("Menší z čísel a, b: " + min);

        // Celá kladná čísla menší než a
        System.out.println("Všechna celá kladná čísla menší než a:");
        for (int i = 1; i < a; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Celá čísla mezi menším a větším z a, b
        System.out.println("Všechna celá čísla větší než menší z čísel (a,b) a menší než větší z čísel (a,b):");
        int lowerBound = (int) Math.min(a, b);
        int upperBound = (int) Math.max(a, b);
        for (int i = lowerBound+1; i <= upperBound; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        scanner.close();
    }
}
