class Algo4 {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50,60};
        System.out.print("[ ");
        int length=((array.length%2)==0)?array.length/2:array.length/2 +1 ;
        for (int i = 0; i < length; i++) {

            int a=array[array.length-(1+i)];
            //int b=array[i];
            array[array.length-(1+i)]=array[i];
            array[i]=a;
            //System.out.print(""+array[i]+ " , ");


            
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(""+array[i]+" , ");
        }
        System.out.print("\b\b]");






    }
    
}