package games;

public class Rectangulo extends GamesF{
    public void regtangulo(int option){
        String character = Integer.toString(option);
        if (option == 1) {
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
        int base = 5;
        int high = 10;
        for (int i = 1; i <= base; i++) {
            for (int j = 1; j < high ; j++) {
                System.out.print(character + "  ");
            }
            System.out.println("");
        }
    }

}
