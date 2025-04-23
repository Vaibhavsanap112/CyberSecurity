import java.util.*;

public class Rca {
  public static boolean isPrime(int num) {
    if (num < 2) return false;
    for (int i = 2; i * i <= num; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static int gcd(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }

  public static int modInverse(int e, int phi) {
    for (int d = 1; d < phi; d++) {
      if ((e * d) % phi == 1) {
        return d;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the two prime numbers");
    int p = sc.nextInt();
    int q = sc.nextInt();
    System.out.println("please enter the valur for m");
    int m=sc.nextInt();

    if (isPrime(p) && isPrime(q)) {
      int n = p * q;
      int phin = (p - 1) * (q - 1);

      System.out.println("please enter the public key from 1 to 9");
      int publicKey = sc.nextInt();

      if (gcd(publicKey, phin) == 1) {
        int d = modInverse(publicKey, phin);
        if (d != -1) {
         double c =Math.pow(m, publicKey)%n;
         double m1=Math.pow(c, d);
         System.out.println(c);
         System.out.println(d);
         System.out.println(m1);
        } else {
          System.out.println("No modular inverse found.");
        }
      } else {
        System.out.println("please enter the public key correctly, gcd is not 1");
      }
    } else {
      System.out.println("please enter valid prime numbers");
    }
  }
}
