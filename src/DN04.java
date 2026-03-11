public class DN04 {

    public static int izBinVD(String binarno){
        int r=0;
        int stevec=0;
        for(int i=binarno.length();i>=0;i--){
            r=r+((binarno.charAt(i)-'0')*(int)Math.pow(2,stevec));
            stevec=stevec+1;

        }


        return r;
    }


    public static String pretvori(String sporocilo){
        String rezultat="";
        for(int i=0;i<sporocilo.length();i=i+8){

            String stevilka=sporocilo.substring(i,(i+8)-1);
            int s=izBinVD(stevilka);
            char r=(char)s;
            rezultat=rezultat+r;

        }


        return rezultat;
    }


    public static void main(String[]args){
        String sporocilo=args[1];
        System.out.println(pretvori(sporocilo));



    }


}
