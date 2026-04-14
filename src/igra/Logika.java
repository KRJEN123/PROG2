package igra;

import java.util.Random;

public class Logika {
    static int[][] polja;/* tukaj hranimo vrednost in okacijo kvadratkov v nasem polju*/
    static int tocke;
    static boolean konec;/*  spremenljivka za tocke */

    public static void zacniNovoIgro(int velikost){
            polja=new int[velikost][velikost];
            tocke=0;
            konec=false;
            for(int i=0;i<2;i++){
                dodajPloscico(velikost);
            }
    }
    public static void dodajPloscico(int velikost){
        Random rnd=new Random();
        int verjetnost=rnd.nextInt(100);
        int index=rnd.nextInt(velikost*velikost);
        int vrednost=2;
        if(verjetnost<=9){
            vrednost=4;
        }
        for(int i=0;i<polja.length;i++){
            for(int j=0;j<polja[i].length;j++){
                if(j+(i*polja[i].length)==index && polja[i][j]==0) {
                    polja[i][j]=vrednost;
                }
            }
        }
    }
    public static void koncajIgro(){
            if(!konec){
                konec=true;
            }else{
                System.exit(0);
            }
    }
    public static int vrniPloscico(int i, int j){
        return polja[i][j];
    }
    public static int vrniTocke(){
        return 0;
    }
    public static boolean jeZmagal(){
        return false;
    }
    public static boolean jeKonec(){
        return konec;
    }
    public static void naslednjaPoteza(int smer){
           premik(smer);
    }
    public static void premik(int smer){
        switch(smer){
            case 0:
                for(int i=0;i< polja.length;i++){
                   int j=0;
                   while(j<polja[i].length){
                        if(polja[i][j]!=0) {
                            int k = j - 1;
                            while (k >= 0) {
                                if (polja[i][k] != 0) {
                                    if (polja[i][k] == polja[i][j]) {
                                        polja[i][k] += polja[i][j];
                                        polja[i][j] = 0;
                                    } else {
                                        polja[i][k + 1] = polja[i][j];
                                        polja[i][j] = 0;
                                    }

                                }
                                k--;

                            }
                            j++;
                        }


                    }
                }



                 break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }



    }

}
