package fr.algorithmie;

public class CaracteresConsecutifs {
    public static void main(String[] args) {
        String chaine = "aaabbc";

        int count = 1;
        StringBuilder chaineCompresse = new StringBuilder();

        for(int i = 1; i <= chaine.length(); i++){
            if (i == chaine.length() || chaine.charAt(i) != chaine.charAt(i - 1)) {
                chaineCompresse.append(chaine.charAt(i - 1)).append(count);
                count = 1;
            } else {
                count++;
            }
        }

        System.out.println(chaineCompresse);
    }
}
