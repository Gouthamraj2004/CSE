import java.util.Scanner;

class Sumofnnatural{
    public static void main(String[] args) {
        int sum=0;
        System.out.println("Sum of n Natural Numbers");
        int n =new Scanner(System.in).nextInt();
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("The sum is :" +sum);
    }
}