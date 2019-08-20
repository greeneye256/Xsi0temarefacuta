package xsiovesiunea2;

public class Main {

    public static void main(String[] args) {
        char upLeft = '/u0000';
        char upMiddle = '/u0000';
        char upRight = '/u0000';
        char middleLeft = '/u0000';
        char middleMiddle = '/u0000';
        char middleRight = '/u0000';
        char downLeft = '/u0000';
        char downMiddle = '/u0000';
        char downRight = '/u0000';

        System.out.println("  ```````````````````");
        System.out.println("1 |  " + upLeft + "   |  " + upMiddle + "   |  " + upRight + "   |");
        System.out.println("  ```````````````````");
        System.out.println("2 |  " + middleLeft + "   |  " + middleMiddle + "   |  " + middleRight + "   |");
        System.out.println("  ```````````````````");
        System.out.println("3 |  " + downLeft + "   |  " + downMiddle + "   |  " + downRight + "   |");
        System.out.println("  ````````````````````");

        int countX = 0;
        int countO = 0;
        int countEmpty = 0;
        int countWrongParameter = 0;
        int xWins = 0;
        int oWins = 0;
        String wrongPositions = "";

        if (upLeft == '\u0000'){
            countEmpty++;
        }
        else {
            if (upLeft == 'X'){
                countX++;
            }
            else {
                if (upLeft == '0'){
                    countO++;
                }
                else {
                    countWrongParameter++;
                    wrongPositions+="upLeft ";
                }
            }
        }
        if (upMiddle == '\u0000'){
            countEmpty++;
        }
        else {
            if (upMiddle == 'X'){
                countX++;
            }
            else {
                if (upMiddle == '0'){
                    countO++;
                }
                else {
                    countWrongParameter++;
                    wrongPositions+="upMiddle ";
                }
            }
        }
        if (upRight == '\u0000'){
            countEmpty++;
        }
        else {
            if (upRight == 'X'){
                countX++;
            }
            else {
                if (upRight == '0'){
                    countO++;
                }
                else {
                    countWrongParameter++;
                    wrongPositions+="upRight ";
                }
            }
        }
        if (middleLeft == '\u0000'){
            countEmpty++;
        }
        else {
            if (middleLeft == 'X'){
                countX++;
            }
            else {
                if (middleLeft == '0'){
                    countO++;
                }
                else {
                    countWrongParameter++;
                    wrongPositions+="middleLeft ";
                }
            }
        }
        if (middleMiddle == '\u0000'){
            countEmpty++;
        }
        else {
            if (middleMiddle == 'X'){
                countX++;
            }
            else {
                if (middleMiddle == '0'){
                    countO++;
                }
                else {
                    countWrongParameter++;
                    wrongPositions+="middleMiddle ";
                }
            }
        }
        if (middleRight == '\u0000'){
            countEmpty++;
        }
        else {
            if (middleRight == 'X'){
                countX++;
            }
            else {
                if (middleRight == '0'){
                    countO++;
                }
                else {
                    countWrongParameter++;
                    wrongPositions+="middleRight ";
                }
            }
        }
        if (downLeft == '\u0000'){
            countEmpty++;
        }
        else {
            if (downLeft == 'X'){
                countX++;
            }
            else {
                if (downLeft == '0'){
                    countO++;
                }
                else {
                    countWrongParameter++;
                    wrongPositions+="downLeft ";
                }
            }
        }
        if (downMiddle == '\u0000'){
            countEmpty++;
        }
        else {
            if (downMiddle == 'X'){
                countX++;
            }
            else {
                if (downMiddle == '0'){
                    countO++;
                }
                else {
                    countWrongParameter++;
                    wrongPositions+="downMiddle ";
                }
            }
        }
        if (downRight == '\u0000'){
            countEmpty++;
        }
        else {
            if (downRight == 'X'){
                countX++;
            }
            else {
                if (downRight == '0'){
                    countO++;
                }
                else {
                    countWrongParameter++;
                    wrongPositions+="downRight ";
                }
            }
        }
        if (countWrongParameter>0){
            if (countWrongParameter == 1){
                System.out.println("Ati introdus o valoare necorespunzatoare jocului X si 0! Va rugam verificati valoarea de pe pozitia: " + wrongPositions);
            }
            else {
                System.out.println("Ati introdus " + countWrongParameter + " valori necorespunzatoare jocului X si 0! Va rugam verificati valorile variabilelor pe pozitiile: " + wrongPositions);
            }
        }
        else {
            if (countEmpty==9) {
                System.out.println("Incepeti prin a completa variabilele din joc. ");
            }
            else {
                if (countO>countX){
                    System.out.println("Numarul de 0-uri nu poate depasi numarul de X-uri. Recompletati variabilele in consecinta!");
                }
                else {
                    if (countX>countO+1){
                        System.out.println("Numarul de X-uri nu poate depasi numarul de 0-uri cu mai mult de 1. Recompletati variabilele in consecinta.");
                    }
                    else {
                        if(countEmpty > 4){
                            System.out.println("Completati in continuare variabilele, nu sunt destule X-uri sau 0-uri pentru a se forma o linie sau diagonala cu acceasi valoare.");
                        }
                        else {
                            if (upLeft == upMiddle && upMiddle == upRight && upLeft!='\u0000'){
                                if (upLeft == 'X'){
                                    xWins++;
                                }
                                else {
                                    oWins++;
                                }
                            }
                            if (middleLeft == middleMiddle && middleMiddle == middleRight && middleLeft!='\u0000'){
                                if (middleLeft == 'X'){
                                    xWins++;
                                }
                                else {
                                    oWins++;
                                }
                            }
                            if (downLeft == downMiddle && downMiddle == downRight && downLeft!='\u0000'){
                                if (downLeft == 'X'){
                                    xWins++;
                                }
                                else {
                                    oWins++;
                                }
                            }
                            if (upLeft == middleLeft && middleLeft == downLeft && upLeft!='\u0000'){
                                if (upLeft == 'X'){
                                    xWins++;
                                }
                                else {
                                    oWins++;
                                }
                            }
                            if (upMiddle == middleMiddle && middleMiddle == downMiddle && upMiddle!='\u0000'){
                                if (upMiddle == 'X'){
                                    xWins++;
                                }
                                else {
                                    oWins++;
                                }
                            }
                            if (upRight == middleRight && middleRight == downRight && upRight!='\u0000'){
                                if (upRight == 'X'){
                                    xWins++;
                                }
                                else {
                                    oWins++;
                                }
                            }
                            if (upLeft == middleMiddle && middleMiddle == downRight && upLeft!='\u0000'){
                                if (upLeft == 'X'){
                                    xWins++;
                                }
                                else {
                                    oWins++;
                                }
                            }
                            if (downLeft == middleMiddle && middleMiddle == upRight && downLeft!='\u0000'){
                                if (downLeft == 'X'){
                                    xWins++;
                                }
                                else {
                                    oWins++;
                                }
                            }
                            if (countEmpty>0 && (xWins == 0 && oWins == 0)){
                                System.out.println("Completati in continuare variabilele pana toate variabilele au atribuite X-uri sau 0-uri sau pana se castiga jocul.");
                            }
                            if (countEmpty == 0 && (xWins == 0 && oWins == 0)){
                                System.out.println("Remiza");
                            }
                            if (xWins==2){
                                System.out.println("X a castigat!");
                            }
                            if (xWins == 1 && oWins == 1){
                                System.out.println("Ati completat gresit jocul. Nu este posibil sa existe 2 castigatori.");
                            }
                            if (xWins==1 && oWins == 0){
                                if (countX == countO){
                                    System.out.println("Situatia de fata este una imposibila. X a castigat cu o mutare inainte!");
                                }
                                else {
                                    System.out.println("X a castigat!");
                                }

                            }
                            if (oWins == 1 && xWins == 0){
                                if (countX>countO){
                                    System.out.println("Situatia de fata este una imposibila. O a castigat cu o mutare inainte!");
                                }
                                else {
                                    System.out.println("O a castigat!");
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(countEmpty);
        System.out.println(countX);
        System.out.println(countO);
        System.out.println(countWrongParameter);
    }
}
