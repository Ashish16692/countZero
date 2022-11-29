public class CountZero {
    public static void main(String[] args) {
        int num=130989070;
        int counter=0;
        while(num!=0){
            int rem=num%10;
            if(rem==0){
                counter++;
            }
        counter++;

        
        num=num/10;
        } 
         System.out.println("zero" +counter);
    }
    
}
