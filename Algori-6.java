import java.util.Scanner;

class Algo6 {
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
                for (int i = 0; i < text.length(); i++) {
                    
                    if( text.substring(i, i+1).equals(" ")){
                        check=text.substring(j,i) ;
                        
                        
                        j=i+1;
                        String reverse="";
                       
                        for (int index = (check.length()-1); index >=0; index--) {
                               reverse+=check.substring(index,index+1);
                               

                        }
                      
                        output=" "+reverse+output;

                        
                        


                    }

                    
                }   
                    System.out.println(output.substring(1, output.length()));
                
                











            }
            else System.out.println("Enter a valid input ! ");


        }while(text.isEmpty());





        
    }
    
}