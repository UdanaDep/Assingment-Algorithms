class Algo85 {
    public static void main(String[] args) {
        // A△B=(A∖B)∪(B∖A --->
           
        int[] numA={5,7,-2,3,4,6,7};
        int[] numB={7,8,-8,2,1,-9,6};

        // numB/numA(elements belongs to B not include in A)

        String output=",";
        String result=",";
        String common=",";

        //Finding Total

        for (int i = 0; i < numA.length; i++) {
                //System.out.println(" "+ numA[i]+" / "+ numB[i]);
                

                if (numA[i]==numB[i] && (!output.contains(","+numA[i]+","))){
                    output=output + numA[i]+",";
                    //System.out.println(numA[i]);
                    continue;

                }
                 if (!output.contains(","+numA[i]+",")){ output=output+ numA[i]+",";}
                 if (!output.contains(","+numB[i]+",")) {output=output+ numB[i]+",";}

            
        }


        //Finding commons
          for (int i = 0; i < numA.length; i++) {

            for (int j = 0; j < numB.length; j++) {
                    if ((numA[i]==numB[j])){
                        common=common+numA[i]+",";
                    }
                
                
            }}

        //Validate Both
        int k=0;
       
        
        for (int i = 0; i < output.length(); i++) {
            if(i==0)continue;
            if(output.substring(i, i+1)=="," && (!common.contains(output.substring(k,i+1)))) {
                System.out.println(""+i+"/"+output.substring(k,i+1)+"///"+k);
                result=result+output.substring(k,i+1);
                k=i;
                }
            
                
                
          




            
        }
        System.out.println(output);
        System.out.println(common);
        System.out.println(result);













    }
    
}