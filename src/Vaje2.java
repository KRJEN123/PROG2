public class Vaje2 {

    static double fakultetaL(int n){
        if(n==1){
            return 1;
        }else{
            return fakultetaL(n-1)*n;
        }



    }
    static double variacije(int n,int d){
       double r=n;
        for(int i=1;i<d;i++){
            r=r*(n+i);

        }

        return r;
    }

    static double stirlingL(int n){

        return (Math.sqrt(2*Math.PI*n)*Math.pow((n/Math.E),n));


    }
    public static double izracunajPiNilakantha(int k){
        double r=3.0;
        int stevec=1;
        for(int i=1;i<=k;i++){
            if(i%2==1){
                r=r+(4/(variacije(stevec+1,3)));
                stevec=stevec+2;
            }else{
                r=r-(4/(variacije(stevec+1,3)));
                stevec=stevec+2;
            }

        }

    return r;

    }

   /* public static double izracunajPi(int k){
       double rez=4.0;
       int pomozni=0;
        for(int i=k;i>=0;i--){
         pomozni=i+

       }


    }
*/
    public static void main(String[]args){
        System.out.println("  n              n!            Stirling(n)      napaka (%)");
        System.out.println("----------------------------------------------------------");

       /* for(int i=1;i<=100;i++){
            double napaka=((fakultetaL(i)-stirlingL(i))*100.0/fakultetaL(i));
            System.out.printf("%3d  %13.9e %13.9E   %1.7f",i,fakultetaL(i),stirlingL(i),napaka);
            System.out.println();



        }
        */
        System.out.println("  k    Math.PI             PI (Nilakantha)     razlika ");
        System.out.println("-----------------------------------------------------------------");
        for(int i=0;i<22;i++){
            double razlika=Math.PI-izracunajPiNilakantha(i);

            System.out.printf("%3d %1.15f %1.15f %1.15f",i,Math.PI,izracunajPiNilakantha(i),razlika);
            System.out.println();


        }


    }
}
