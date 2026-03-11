public class DN02 {




    public static void Kvadrat(String s){
        int n=(int) Math.ceil(Math.sqrt(s.length()));
        while(true) {
            if (s.length() < (n * n)) {
                s=s+".";

            }else{
                break;
            }
        }
        for(int i=0;i<s.length();i++){
            if(i!=0 && i%n==0){
                System.out.println();
                System.out.print(" "+s.charAt(i)+" ");

            }else{
                System.out.print(" "+s.charAt(i)+" ");
            }


        }
    }
    public static void main(String[] args) {
        String s=args[0];
        Kvadrat(s);

    }






}
