public class five {
    public static void main(String[] args){
        int array[]={2, 7, 11, 15};
        
        int target=9;
        for(int i=0;i<array.length;i++){
            int check=array[i]+array[i+1];
            if(check==target){
                System.out.println("Numbers: " + array[i] + ", " + array[i+1]);
            }
        }

    }
}
