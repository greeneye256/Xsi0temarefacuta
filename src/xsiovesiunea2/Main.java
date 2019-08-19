package xsiovesiunea2;

public class Main {

    public static void main(String[] args) {
        char upLeft = 'X';
        char upMiddle = 'X';
        char upRight = 'X';
        char middleLeft = 'X';
        char middleMiddle = '0';
        char middleRight = '0';
        char downLeft = '0';
        char downMiddle = 'X';
        char downRight = '0';

        int countX = 0;
        int countO = 0;
        int countEmpty = 0;
        int countWrongParameter = 0;
        int xWins = 0;
        int oWins = 0;
        String wrongPositions = "";

        if (upLeft == ' '){
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
            System.out.println("Ati introdus " + countWrongParameter + " valori necorespunzatoare jocului X si 0! Va rugam verificati valorile variabilelor pe pozitiile: " + wrongPositions);
        }
        else {
            if (countEmpty==9) {
                System.out.println("Incepeti prin a completa variabilele din joc. ");
            }else {
                if (countO>countX){
                    System.out.println("Numarul de 0-uri nu poate depasi numarul de X-uri. Recompletati variabilele in consecinta!");
                }
                else {
                    if (countX>countO+1){
                        System.out.println("Numarul de X-uri nu poate depasi numarul de 0-uri cu mai mult de 1. Recompletati variabilele in consecinta!");
                    }
                    else {
                        if(countEmpty > 4){
                            System.out.println("Completati in continuare variabilele nu sunt destule X-uri sau 0-uri pentru a se forma o linie sau diagonala");
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
