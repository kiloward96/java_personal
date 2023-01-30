package java_personal.tt;


import java.util.Arrays;
import java.util.Scanner;
 
class danji {
    // `Scanner` 클래스를 사용하여 Java에서 여러 줄 입력 읽기
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();

        int[][] danji = new int[n][n];
 
        while (scanner.hasNextLine()) {
            String[] tokens = scanner.nextLine().split("\\s");
            System.out.println(Arrays.toString(tokens));
        }
 
        scanner.close();
    }
}