package fr.algorithmie;

public class FabriquerMur {
    public static void main(String[] args) {
        System.out.println(fabriquerUnMur(3, 1, 8));
        System.out.println(fabriquerUnMur(3, 1, 9));
        System.out.println(fabriquerUnMur(3, 2, 10));

    }
    public static boolean fabriquerUnMur(int nbSmall, int nbBig, int longueur) {
        for (int i = 0; i <= nbBig; i++) {
            int remainingLength = longueur - (i * 5);
            if (remainingLength <= nbSmall) {
                return true;
            }
        }
        return false;
    }
}