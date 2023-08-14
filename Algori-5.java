import java.util.Scanner;

class Algo5 {
    private static final Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {

        String text="";
        String reverse="";

        do{
            System.out.print("Enter a text-:");
            text=scanner.nextLine();

            if (!text.isEmpty()){
                for (int index = (text.length()-1); index >=0; index--) {
                    reverse+=text.substring(index,index+1);
            
                }
                System.out.println(reverse);



            }
            else System.out.println("Enter a valid input ! ");


        }while(text.isEmpty());
    
        
    }
    
}