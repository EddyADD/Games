package games;

public class Cuadrado extends GamesF{
    public void cuadrado(int option){
        String character = Integer.toString(option);
        if (option==1) {
            character = "*";
            figure(character);

        }else if (option == 2) {
            character = "@";
            figure(character);
        }else if (option == 3) {
            character = "+";
            figure(character);
        }

    }
    public void figure(String character){
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < num ; j++) {
                System.out.print(character+ "  ");
            }
            System.out.println("");
        }
    }
}
