class Algo84 {
    public static void main(String[] args) {
        
        int[] numA={5,7,-2,3,4,6,7};
        int[] numB={7,8,-8,2,1,-9,6};

        // numB/numA(elements belongs to B not include in A)

        String output=",";
        String ArrayA=",";

        for (int i = 0; i < numA.length; i++) {
                
                ArrayA=ArrayA+numA[i]+",";
            
        }
        //System.out.println(ArrayB);
         for (int i = 0; i < numB.length; i++) {
                if(ArrayA.contains(","+numB[i]+"," )) continue;
                else output=output+numB[i]+",";
                
            
        }
        System.out.println();
        System.out.println(output.substring(1, output.length()-1));




    }
    
}