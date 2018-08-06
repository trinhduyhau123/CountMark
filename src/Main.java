import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng điểm học sinh");
        size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập điểm sinh viên: ");
            array[i] = scanner.nextInt();
        }
        int count =0;
        for (int i = 0; i < size; i++) {
            if(array[i]>5 && array[i]<=10){
                count++;
            }
        }
        System.out.println("Số lượng sinh viên đỗ là: "+ count);
    }
}
