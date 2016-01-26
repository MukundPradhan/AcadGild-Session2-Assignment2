public class PrimeNumber {

    public static void main(String args[]) {
        int Num1, Num2, Cnt;
        
        // Prime Number means that number which is divisible 1 & itself
        
        for(Num1=1;Num1<=100;Num1++){
            Cnt=0;
            for(Num2=Num1;Num2>=1;Num2--){
                if(Num1%Num2==0){
                    Cnt++;
                }
               
            }
           if(Cnt==1 || Cnt==2){
              System.out.println(Num1);     
           }
        }
        
       
    }
} 
