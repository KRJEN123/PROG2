public class Kviz2 {

   boolean preveriRep(String a, String b){
       b=b.toLowerCase();
       a=a.toLowerCase();
     if(a.length()>b.length()){

         String s=a.substring(a.length()-b.length());
         if(s.equals(b)){
             return true;

         }else{
             return false;
         }

     }else if(a.length()==b.length()){
            if(a.equals(b)){
                return true;
            }else{
                return false;
            }

     }else{
         String s=b.substring(b.length()-a.length());
         if(s.equals(a)){
             return true;

         }else{
             return false;
         }


     }



    }



    int vsotaStevk(String str){
        int r=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)-'0'>=0 && str.charAt(i)-'0'<=9 ){
                r=r+(str.charAt(i)-'0');

            }
        }
        return r;



    }
    int[] range(int a, int b, int c){
       if(a<0 || b<0 || c<0){
           return null;
        }else{
           int[]tab;
           int stevec=0;
           for(int i=0;a+(i*c)<b;i++){
            stevec++;

           }
           tab=new int[stevec];
           for(int i=0;a+(i*c)<b;i++){
               tab[i]=a+(i*c);

           }
           return tab;

       }



    }
    static void rotiraj(int [] tabela, int k){
      int []nova=new int[tabela.length];
      int novIndex;
       for(int i=0;i<tabela.length;i++){
           if(i+k>=tabela.length){
               novIndex=((i+k)%tabela.length);
               nova[i]=tabela[novIndex];

           }else{
               nova[i]=tabela[i+k];
           }


       }
       for(int i=0;i<tabela.length;i++){
           tabela[i]=nova[i];

       }


    }
    int[] duplikati(int[] tabela) {
        boolean duplikat;
        int stevec=0;
        for (int i=0;i<tabela.length;i++) {
            duplikat=false;
            for (int j=0;j<i;j++) {
                if (tabela[i]==tabela[j]) {
                    duplikat =true;
                    break;
                }



            }
            if (!duplikat) {
                stevec++;
            }
        }


        int[] nova=new int[stevec];
        stevec=0;
        for (int i=0;i<tabela.length;i++) {
            duplikat=false;
            for (int j=0;j<i;j++) {
                if (tabela[i]==tabela[j]){
                    duplikat=true;
                    break;



                }
            }
            if (!duplikat) {
                nova[stevec]=tabela[i];
                stevec++;
            }}
        return nova;
    }
    static double koren(int x, int d){

       double r=0;
       for(int i=0;i<d+1;i++){
           double c=0;
           while(true){
               if((r+(c/Math.pow(10,i)))*(r+(c/Math.pow(10,i))) <= x && (r+((c+1)/Math.pow(10,i)))*(r+((c+1)/Math.pow(10,i))) > x){
                   r=r+(c/Math.pow(10,i));
                   break;
               }

               c++;
           }


        }

        return r;
    }
    int vsotaSkupnihCifer(int a, int b) {
        int[] tab1;
        int rezultat = 0;
        int[] tab2;
        int zacasnoA = a;
        int zacasnoB = b;
        boolean []used=new boolean[10];
        int stevec = 0;
        int d;
        while (zacasnoA > 0) {
            zacasnoA = zacasnoA / 10;
            stevec++;
        }
        tab1 = new int[stevec];
        stevec = 0;
        while (zacasnoB > 0) {
            zacasnoB = zacasnoB / 10;
            stevec++;
        }
        tab2 = new int[stevec];
        for (int i = 0; i < tab1.length; i++) {
            d = a % 10;
            a = a / 10;
            tab1[i] = d;
        }
        for (int i = 0; i < tab2.length; i++) {
            d = b % 10;
            b = b / 10;
            tab2[i] = d;
        }
        if (tab1.length >= tab2.length) {

            for (int i = 0; i < tab1.length; i++) {
                for (int j = 0; j < tab2.length; j++) {
                    if (tab1[i] == tab2[j] && !used[tab1[i]]) {
                        used[tab1[i]] = true;
                        rezultat = rezultat + tab1[i];
                        break;

                    }


                }


            }


        } else {
            for (int i = 0; i < tab2.length; i++) {
                for (int j = 0; j < tab1.length; j++) {
                    if (tab1[j] == tab2[i] && !used[tab2[i]]) {
                        used[tab2[i]] = true;
                        rezultat = rezultat + tab2[i];
                        break;

                    }


                }


            }


        }

        return rezultat;
    }
    static int fibo(int n){
       int rez=0;
       int [][]tab=new int[n][n];
       for(int i=0;i<tab.length;i++){
           for(int j=0;j<tab[i].length;j++){
               if((i==0 && j==0) || (i==0 && j==1)){
                   tab[i][j]=1;
               }else if(j==0){
                   tab[i][j]=tab[i-1][tab[i].length-1]+tab[i-1][tab[i].length-2];

               }else if(j==1 && i>1){
                   tab[i][j]=tab[i][0]+tab[i-1][tab[i].length-1];

               }else{
                   if(j-2<0){
                       tab[i][j]=tab[i][j-1]+tab[i-1][tab[i].length-1];
                   }else{
                       tab[i][j]=tab[i][j-1]+tab[i][j-2];
                   }

               }

           }


        }
      //izpisitabelo(tab);
        for(int i=0;i<tab.length;i++){
            for(int j=0;j<tab[i].length;j++){
                if(i==j && (j+i==tab.length-1)){
                    rez=rez+tab[i][j];

                }
                if(i==j){
                    rez=rez+tab[i][j];
                }else if((j+i==tab.length-1)){
                    rez=rez+tab[i][j];


                }



            }


        }




       return rez;
    }
    public static void izpisitabelo(int[][]tab){
        for(int i=0;i<tab.length;i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.printf("%3d", tab[i][j]);


            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        System.out.println(fibo(3));


    }

}
