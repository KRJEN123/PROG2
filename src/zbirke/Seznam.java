package zbirke;

public class Seznam {
    /*
    tukaj je definirana tabela seznam in kapaciteta ki imata podatke o koliko elemtov je v tabeli
     */
    public static String[]Seznam;
    public static int kapaciteta;
    /*
    tukaj imamo metodo ki naredi seznam in ga definira
     */
   public static boolean narediSeznam(int n){
       if(kapaciteta!=0){
           return false;
       }else{
           Seznam=new String[n];
           kapaciteta=0;
           return true;
       }
       }
       /*
       dodajanje na konec seznama
        */
    public static boolean dodajNaKonecSeznama(String element){
        try{
            for(int i=0;i<Seznam.length;i++){
                if(Seznam[i]==null){
                    Seznam[i]=element;
                    kapaciteta++;
                    return true;
                }

            }
            return false;

        }catch(Exception e){
            return false;
        }
    }
    //izpis
    public static void izpisiSeznam(){
       try {
           System.out.println("Na seznamu so naslednji elementi:");
           for (int i = 0; i < kapaciteta; i++) {
               System.out.println((i + 1) + ": " + Seznam[i]);
           }
       }catch (Exception e){
           System.out.println("NAPAKA: Seznam ne obstaja. oz. Seznam je prazen (nima elementov).");
       }
    }
    /*
    odstranjanje s seznama tukaj je pomembno da v primeru da je luknja ko odstranimo to luknjo zapolni tako
    da premakne elemente nazaj da nimamo luknje v tabeli
     */
    public static String odstraniIzSeznama(int mesto){
       if(Seznam[mesto]!=null){
           String s=Seznam[mesto];
           Seznam[mesto]=null;
           if(Seznam[mesto+1]!=null && mesto+1<Seznam.length){
               int k=mesto+1;
               while(k<Seznam.length){
                   Seznam[k-1]=Seznam[k];
                   k++;
               }
           }
           kapaciteta--;
           return s;

       }else{
           return null;
       }


    }
    /*
    tukaj podobno ko pri brisanju moramo pazitir na problem ko vstavljamo element kjer tabela ze ima element tukaj
    pa moramo zamakniti vse elemente v desno in narediti prostor za nas element
     */
    public static boolean dodajVSeznam(String element, int mesto){
       if(kapaciteta>Seznam.length){
           return false;
       }else{
           if(Seznam[mesto-1]!=null){
               int k=kapaciteta;
               while(k>mesto-1){
                   Seznam[k]=Seznam[k-1];
                   k--;
               }
               Seznam[mesto-1]=element;
               kapaciteta++;
               return true;
           }else{
               Seznam[mesto]=element;
               kapaciteta++;
               return true;
           }
       }


    }
    //dolzina seznama
    public static int dolzinaSeznama(){
            if(Seznam==null){
                return -1;
            }
           return kapaciteta;

    }
    //tukaj pa unicimo seznam
    public static boolean uniciSeznam(){
       if(Seznam==null){
           return false;
       }
        Seznam=null;
        return true;
    }

}