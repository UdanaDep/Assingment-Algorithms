class Algo83 {
    public static void main(String[] args) {
        
        int[] numA={5,7,-2,3,4,6,7};
        int[] numB={7,8,-8,2,1,-9,6};

        // numA/numB(elements belongs to A not include in B)

        String output=",";
        String ArrayB=",";

        for (int i = 0; i < numB.length; i++) {
                
                ArrayB=ArrayB+numB[i]+",";
            
        }
        //System.out.println(ArrayB);
         for (int i = 0; i < numA.length; i++) {
                if(ArrayB.contains(","+numA[i]+"," )) continue;
                else output=output+numA[i]+",";
                
            
        }
        System.out.println();
        System.out.println(output.substring(1, output.length()-1));




    }
    
}