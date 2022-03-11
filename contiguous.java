package geeks;
public class contiguous {
    public  static void  main(String []args){
        int a[]=new int[]{1,2,3,1,4,5,2,3,6};
        int k=3;
        for(int i=0;i<a.length-k+1;i++){
                int sum=0;
                for(int j=i;j<i+k;j++){
                    if(a[j]>sum){
                        sum=a[j];
                    }
                }
                System.out.println(sum);
        }
    }}
