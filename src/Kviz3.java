public class Kviz3{


    public static int[] sestejPolinoma(int[] a, int[] b){
        int[]c;
        if(a.length>b.length){
            c=new int[a.length];

        }else{
            c=new int[b.length];
        }
        for(int i=0;i<c.length;i++){
            if(i<a.length && i<b.length){
                c[i]=a[i]+b[i];


            }else if(i<a.length){
                c[i]=a[i];
            }else{
                c[i]=b[i];
            }

        }




        return c;
    }
    public static int[] zmnoziPolinoma(int[] a, int[] b){
        int[]c=new int[((a.length-1)+(b.length-1))+1];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                c[i+j]=c[i+j]+(a[i]*b[j]);
            }
        }
        return c;
    }

}
