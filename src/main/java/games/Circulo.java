package games;

public class Circulo extends GamesF{
    public void circulo(int option){
        String  character = String.valueOf(option);
        if (option == 1 ) {
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
        int imp = 7; // impar original
        int div = imp/2; // 4
        int rows = div*2;
        int limit = div+2;
        for (int i = 1; i <= rows ; i++) { //8

            if (i <= rows/2) {
                for (int j = 1 ; j <= imp ; j++) {//9
                    if (j >= div && j<=limit){  //temp 6 div 4
                        System.out.print(character + "  ");
                    }else {System.out.print("   ");}
                }
                limit++;
                div--;
            }

            if (i>rows/2) { //6
                limit--;
                div++;
                for (int j = 1; j <= limit ; j++) {//9 012345678
                    if (j >= div){
                        System.out.print(character + "  ");
                    }else {System.out.print("   ");}
                }


            }
            System.out.println(" ");
        }
    }

}
