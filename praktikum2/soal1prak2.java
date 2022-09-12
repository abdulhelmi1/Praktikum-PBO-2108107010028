import java.util.Scanner;
/*operator aritmatika dari inputan 2 integer  */
public class soal1prak2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1,num2;
        
        /*masukkan num1 = 3 dan num2 = 2, agar mendapatkan output sebagai berikut
          num1 + num2 = 5;
          num1 – num2 = 1;
          num1 * num2 = 6;
          num1 / num2 = 1,5;
          num1 % num2 = 1;  */

        System.out.print("masukkan nilai num1: ");
        num1 = input.nextInt();
        
        System.out.print("masukkan nilai num2: ");
        num2 = input.nextInt();
            
        System.out.println("num1 + num2= " + (num1 + num2));
        System.out.println("num1 - num2= " + (num1 - num2));
        System.out.println("num1 * num2= " + (num1 * num2));
        System.out.println("num1 / num2= " + ((double)num1 / num2));
        System.out.println("num1 % num2= " + (num1 % num2));
        
    }
}
