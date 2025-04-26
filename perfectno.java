import java.util.Scanner;
public class perfectno {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        sc.close();
        if(isperfect(num)){
            System.out.println(num+"is a perfect no");
        }
        else{
            System.out.println(num+"is not a perfect no");
        }
    }
    public static boolean isperfect(int num){
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        return sum==num;
    
    }
}
