import java.util.Scanner;
public class Sieve {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your n");
        int n = in.nextInt();
        in.close();
        boolean[] primeNumber = new boolean[n+1];
        
        for (int a = 2; a <= n; a++){
            
            for (int check = 2 * a; check <= n; check += a){
                primeNumber[check] = true;
            }

        }
        int count = 0;
        for(int index = 2; index < n-1; index ++){
            if(primeNumber[index] == false){
                System.out.println(index);
                count ++;
            }
        }
        System.out.println("There are " + count + " prime numbers less than n");

    
    }

}
