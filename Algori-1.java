import java.util.Scanner;

class Algo1{
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        int num;
        do{
            System.out.println("Enter a Positive No-:");
            num=scanner.nextInt();
            scanner.nextLine();
            
            if (num >0){
                int sum=0;
                System.out.print("This is febonachi No of "+ num+" : ");
                for (int i = num; i >0; i--) {
                    sum+=i;
                    System.out.print(""+i+"+");

                    
                }
                System.out.print("\b("+sum+")\n");



            }
            else System.out.println("Enter a positive No plzzz");
            







        }while(num<0);

















    }


}