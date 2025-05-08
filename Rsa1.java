import java.util.*;

public class Rca {
  public static boolean isPrime(int p,int q){
    int max = Math.max(p,q);
    for(int i=2;i*i<=max;i++){
     if(p%i==0 || q%i==0){
      return false;
     }
    }
     return true;
    }
    
  public static void main(String[] args) {
    System.out.println("enter the prime number");
    System.out.println("enter the two prime numbers");
    Scanner sc=new Scanner(System.in);
     int p=sc.nextInt();
     int q=sc.nextInt();
 
     if(isPrime(p,q)){

      int n=p*q;
      int phin=(p-1)*(q-1);

      System.out.println("please enter the public key from 1 t0 9");
      int publicKey=sc.nextInt();
      while(publicKey!=0){
        int temp = publicKey;
        publicKey = phin%publicKey;
        phin = temp;
      
      }
      if(phin==1){
     int d=-1;
        for(int i=1;i<phin;i++){
         d=((phin*i)+1)/publicKey;
        if(d%1==0){
          break;
        }
        }
        
      }
      else{
        System.out.println("please enter the public key correctly gcd is not 1");
      }

     }
     else{
      System.out.println("please enter valid prime numbers");

     }
    
  }

}