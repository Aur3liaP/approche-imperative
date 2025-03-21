package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {
        int[] numbers = {8, -7, 12, 1, -2, 14, 17, 9};
        System.out.println(numbers[0]);
        System.out.println(numbers.length);
        System.out.println(numbers.length-1);
        System.out.println(numbers[10]); // En dehors des index disponibles sans le tableau

    }
}
