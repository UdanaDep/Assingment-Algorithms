import java.util.Scanner;

class Algo7 {
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args)  {
        String text="";
        String check="";
        String output="";

        do{
            System.out.print("Enter a text-:");
            text=scanner.nextLine();

            if(!text.isBlank()){
                text=text+" ";
               
                int j=0;
                String max="";
                String min=" ".repeat(text.length());
                for (int i = 0; i < text.length(); i++) {
                    
                    if( text.substring(i, i+1).equals(" ")){
                        check=text.substring(j,i) ;
                        if (check.length()>max.length()) max=check;
                        if (check.length()<min.length()) min=check;
                        j=i+1;
                        

                    }

                    
                }   
                    System.out.println("Maximum Word is : "+ max);
                    System.out.println("Minimun Word is : "+ min);
                



            }
            else System.out.println("Enter a valid input ! ");


        }while(text.isEmpty());





        
    }
    
}