package ua.org.lotrik.dz_10;


public class Result extends MainActivity{
    private static final String TAG = "";

    public String result (int [] pressed){
        String resultat = "";
        if (pressed[0] == 1 && pressed[1] == 1 && pressed[2] == 1 ||
                pressed[0] == 1 && pressed[3] == 1 && pressed[6] == 1 ||
                pressed[0] == 1 && pressed[4] == 1 && pressed[8] == 1 ||
                pressed[1] == 1 && pressed[4] == 1 && pressed[7] == 1 ||
                pressed[2] == 1 && pressed[5] == 1 && pressed[8] == 1 ||
                pressed[3] == 1 && pressed[4] == 1 && pressed[5] == 1 ||
                pressed[6] == 1 && pressed[7] == 1 && pressed[8] == 1 ||
                pressed[2] == 1 && pressed[4] == 1 && pressed[6] == 1) {
            for (int i=0; i<pressed.length; i++){
                if (pressed[i] == 0) {
                    pressed[i] = 3;
                }
            }
            resultat =  "Выиграл Х";
        } if (pressed[0] == 2 && pressed[1] == 2 && pressed[2] == 2 ||
                pressed[0] == 2 && pressed[3] == 2 && pressed[6] == 2 ||
                pressed[0] == 2 && pressed[4] == 2 && pressed[8] == 2 ||
                pressed[1] == 2 && pressed[4] == 2 && pressed[7] == 2 ||
                pressed[2] == 2 && pressed[5] == 2 && pressed[8] == 2 ||
                pressed[3] == 2 && pressed[4] == 2 && pressed[5] == 2 ||
                pressed[6] == 2 && pressed[7] == 2 && pressed[8] == 2 ||
                pressed[2] == 2 && pressed[4] == 2 && pressed[6] == 2){
            for (int i=0; i<pressed.length; i++){
                if (pressed[i] == 0) {
                    pressed[i] = 3;
                }
            }
            resultat =  "Выиграл О";
        }
        for (int i = 0; i < pressed.length; i++) {
            if (pressed[i] == 0 || pressed[i] == 3) {
                break;
            } else if (i == pressed.length - 1) {
                resultat =  "Ничья";
            }
        }
        return resultat;
    }
}
