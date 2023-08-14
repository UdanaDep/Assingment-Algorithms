class Algo2 {
    public static void main(String[] args) {
        int[] array={-5,2,7,10,58,-7,8,23};
        int max=array[0];
        int min=array[0];

        for (int i = 1; i < array.length; i++) {

            if (max<array[i]) max=array[i];
            if (min>array[i]) min=array[i];
            
        }

        System.out.println("Max No is : "+max +" & min No is : " +min);
        
        
    }
    
}