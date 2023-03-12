import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] mass;
        int n;
        Scanner in = new Scanner(System.in);

        while (true) {

            System.out.println("Введите количество элементов массива");
            n = in.nextInt();
            mass = new double[n];

            for (int i = 0; i < n; i++)
                mass[i] = in.nextDouble();

            MergeSort mergeSort = new MergeSort(mass);

            mergeSort.MergeSorting();

            mergeSort.ShowArr();
        }
    }
}