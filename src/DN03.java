import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class DN03 {

    public static String generirajGeslo(String datoteka,int n,int seme){
        String vrstica="";
        Random rand = new Random(seme);
        int d=0;
        int i=0;
        String rezultat="";
        String[]tab;
        try{
           BufferedReader br=new BufferedReader(new FileReader(datoteka));
            tab=new String[Integer.parseInt(br.readLine())];
            while(br.ready()){
               tab[i]=br.readLine();
               i++;
            }
            for(int j=0;j<n;j++){
                int index=rand.nextInt(tab.length);
                String beseda=tab[index];
                index=rand.nextInt(beseda.length());
                rezultat=rezultat+beseda.charAt(index);


            }
        return rezultat;

        }catch(IOException e){
            e.printStackTrace();
            return null;

        }





    }

    public static void main(String[]args){
        String datoteka=args[0];
        int n=Integer.parseInt(args[1]);
        int seme=Integer.parseInt(args[2]);
        System.out.println(generirajGeslo(datoteka,n,seme));



    }


}
