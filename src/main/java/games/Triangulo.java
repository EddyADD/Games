package games;

public class Triangulo extends GamesF {
    public void trianguloisoles(int T){
        //*
        String character = Integer.toString(T);
        if (T==1) {
            character = "*";
            figure(character);

        }else if (T == 2) {
            character = "@";
            figure(character);
        }else if (T == 3) {
            character = "+";
            figure(character);
        }
    }
    public void figure(String character){
        int high = 8;
        //int caracter = Integer.valueOf(character);
        for (int i = 1; i <= high; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(character + " ");
            }
            System.out.println("");
        }
    }
}
