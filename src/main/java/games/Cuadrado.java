package games;

public class Cuadrado extends GamesF{
    public void cuadrado(int option){
        String selection;
        selection = String.valueOf(option);
        if (option==1) {
            selection = "*";
            figure(selection);

        }else if (option == 2) {
            selection = "@";
            figure(selection);
        }else if (option == 3) {
            selection = "+";
            figure(selection);
        }

    }
    public void figure(String character){
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < num ; j++) {
                System.out.print(character+ "  ");
            }
            System.out.println(" ");
        }
    }
}
