class Algo81 {
    public static void main(String[] args) {
        
        int[] numA={5,7,-2,3,4,6,7};
        int[] numB={7,8,-8,2,1,-9,6};

        // numA & numB

        String output="";

        for (int i = 0; i < numA.length; i++) {


            for (int j = 0; j < numB.length; j++) {
                    if ((numA[i]==numB[j]) && (!output.contains(""+numA[i]))){
                        output=output+numA[i]+" , ";
                    }
                
                
            }

            
        }

        System.out.println( "same elements are : " +output+"\b\b ");




    }
    
}