package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String[] args) {
        String[] strings = {"Biganos", "Paris", "Bordeaux", "Châlons", "La Teste"};

        for (String str : strings) {
            System.out.println(str);
        }

        System.out.println(strings.length);

        strings[3] = "Reims";

        for (String str : strings) {
            System.out.println(str);
        }

        // Boucle indexée possible mais à typer
        // for (int i = 0; i<10; i++) {}

        // Agrandir tableau : tab = Arrays.copyOf(tab, tab.length + 1);
        // ou encore String[] nvTab = Arrays.copyOf(tab, tab.length + 1);
        // On est obligé d'agrandir le tableau et après d'y insérer une donnée / On peut aussi créer une classe pour facilier

        // On verra plus tard les "arrayListes" qui sont des tableaux + proches de JS, modifiables
    }
}
