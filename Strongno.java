import java.util.Scanner;
public class Strongno {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number");
         int num=sc.nextInt();
         sc.close();
         if(isstrong(num))
         {
            System.out.println(num+"is a strong number");
         }
         else{
            System.out.println(num+"is not a strong number");;
         }
    }
    public static boolean isstrong(int num)
    {
        int originalnum=num;
        int sumoffact=0;
        while(num>0){
            int digit=num%10;
            sumoffact+=factorial(digit);
            num=num/10;
        }
        return sumoffact==originalnum;
        }
        public static int factorial(int n){
            if((n==0)||(n==1)){
                return n;
            }
            else{
                return n*factorial(n-1);
            }
        
        }
    }
    

