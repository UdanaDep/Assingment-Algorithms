class Algo82 {
    public static void main(String[] args) {
        
        int[] numA={5,7,-2,3,4,6,7};
        int[] numB={7,8,-8,2,1,-9,6};

        // numA total numB

        String output="";

        for (int i = 0; i < numA.length; i++) {
                //System.out.println(" "+ numA[i]+" / "+ numB[i]);
                

                if (numA[i]==numB[i] && (!output.contains(","+numA[i]+","))){
                    output=output+"," + numA[i]+",";
                    //System.out.println(numA[i]);
                    continue;

                }
                 if (!output.contains(","+numA[i]+",")){ output=output+"," + numA[i]+",";}
                 if (!output.contains(","+numB[i]+",")) {output=output+"," + numB[i]+",";}

            
        }

        System.out.println(output.substring(1, output.length()-1));




    }
    
}