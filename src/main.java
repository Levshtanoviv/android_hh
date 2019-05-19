import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter length array: ");
        int lengthArr = in.nextInt();
        int arr[] = new int[lengthArr];
        System.out.print("Fill array: ");
        int number = 0;

        for (int i = 0; i < lengthArr; i++) {
            number = in.nextInt();
            arr[i] = number;
        }

        int max = arr[0];
        for(int i = 1; i < lengthArr; i++){
            if(arr[i] >= max) max = arr[i];
        }

        System.out.print("Index of the maximum number (counting from 0): ");

        for (int i = 0; i < lengthArr; i++) {
            if (arr[i] == max) {
                System.out.print(i + " ");
            }
        }
    }
}
