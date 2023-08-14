class Algo3 {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50};
        System.out.print("[ ");
        int[] arrayNew=new int[array.length];
        
        for (int i = 0; i < array.length; i++) {

            arrayNew[array.length-(1+i)]=array[i];


            
        }

        for (int i = 0; i < arrayNew.length; i++) {
            System.out.print(""+arrayNew[i]+" , ");
        }
        System.out.print("\b\b]");






    }
    
}