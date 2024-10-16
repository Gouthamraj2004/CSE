import java.util.Scanner;

class Sumofnumbersinrange{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the start Range");
        int s= sc.nextInt();
        System.out.println("Enter the end of Range");
        int e= sc.nextInt();
        int sum=0;
        for(int i=s;i<=e;i++){
            sum+=i;
        }
        System.out.println("The Sum is " +sum);
    }
}