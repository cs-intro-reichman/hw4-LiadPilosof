public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);


 
        boolean[] arr = new boolean[n];


        for (int i = 0; i < n; i++) {
            arr[i] = true;
        }
        arr[0]=false;
        arr[1]=false;




        for (int i = 0; i < n; i++) {
            if (isPrime(i)) {
                for (int j = i+1; j < arr.length; j++) {
                    if (j%i==0) {
                        arr[j]=false;
                    }
                }
            }
        }


        int counter = 0;
        System.out.println("Prime numbers up to "+ n+":");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                counter++;
                System.out.println(i);
            }
        }


        int preCalc = (int) (((double)counter/n)*100);

        System.out.println("There are " + counter + " primes between 2 and "+ n+" "+"("+preCalc+"% are primes)");

    }

    public static boolean isPrime(int num) {
        if (num==0 || num == 1) {
            return false;
        }
        if (num==2) {
            return true;
        }
        for (int i = 2; i < Math.sqrt(num)+1; i++) {
          
            if (num%i==0) {
                return false;
            }
        }

        return true;
    }
}