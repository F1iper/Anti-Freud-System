import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        int[] ints = new int[size];
        scanner.nextLine();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = scanner.nextInt();
        }
    
        int n = scanner.nextInt();
        int sum = 0;
        
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > n) {
                sum += ints[i];
            }
        }
        System.out.println(sum);
        
    }
}