import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by pavlyknazariy on 17.06.17.
 */
public class Sort {

    public static void showMenu(){
        System.out.println("\n**************Menu**************");
        System.out.println("1 - Sort array of integers entered manually ");
        System.out.println("2 - Sort array of integers loaded from file ");
        System.out.println("3 - Sort list of integers entered manually");
        System.out.println("4 - Sort list of integers loaded from file");
        System.out.println("0 - Exit");
        System.out.println("**************Menu**************");
    }

    public static void main(String[] args){
        QuickSort <Integer> intQuickSort;
        List<Integer> intListQuickSort;
        Integer [] iArr;
        int operation = 1, size;
        Scanner scanner, fileScanner = null;
        while (operation != 0){
            showMenu();
            scanner = new Scanner(System.in);
            operation = scanner.nextInt();
            switch (operation){
                case 1:
                    System.out.print("Enter the size of array:");
                    size = scanner.nextInt();
                    iArr = new Integer[size];
                    System.out.println("Enter elements of array:");
                    for(int i = 0; i < size; i++){
                        iArr[i] = scanner.nextInt();
                    }
                    System.out.println("Sort an array of integers:");
                    intQuickSort = new QuickSort(iArr);
                    intQuickSort.printArray();
                    System.out.println();
                    intQuickSort.sort();
                    intQuickSort.printArray();
                    break;
                case 2:
                    iArr = new Integer[1];
                    try {
                        fileScanner = new Scanner(new File("numbers.txt"));
                    } catch (FileNotFoundException e) {
                        System.out.println("File reading error!");
                    }
                    int j = 0;
                    while(fileScanner.hasNextInt())
                    {
                        iArr = Arrays.copyOf(iArr, iArr.length + 1);
                        iArr[j++] = fileScanner.nextInt();
                    }
                    iArr = Arrays.copyOf(iArr, iArr.length - 1);
                    System.out.println("Sort an array of integers loaded from file:");
                    intQuickSort = new QuickSort(iArr);
                    intQuickSort.printArray();
                    System.out.println();
                    intQuickSort.sort();
                    intQuickSort.printArray();
                    break;
                case 3:
                    System.out.print("Enter the size of list:");
                    size = scanner.nextInt();
                    intListQuickSort = new ArrayList<Integer>();
                    System.out.println("Enter elements of list:");
                    for(int i = 0; i < size; i++){
                        intListQuickSort.add(scanner.nextInt());
                    }
                    System.out.println("Sort a list of integers:");
                    intQuickSort = new QuickSort(intListQuickSort);
                    intQuickSort.printArray();
                    System.out.println();
                    intQuickSort.sort();
                    intQuickSort.printArray();
                    break;
                case 4:
                    intListQuickSort = new ArrayList<Integer>();
                    try {
                        fileScanner = new Scanner(new File("numbers.txt"));
                    } catch (FileNotFoundException e) {
                        System.out.println("File reading error!");
                    }
                    while(fileScanner.hasNextInt())
                    {
                        intListQuickSort.add(fileScanner.nextInt());
                    }
                    System.out.println("Sort a list of integers loaded from file:");
                    intQuickSort = new QuickSort(intListQuickSort);
                    intQuickSort.printArray();
                    System.out.println();
                    intQuickSort.sort();
                    intQuickSort.printArray();
                    break;
                case 0: return;
                default:
                    System.out.println("Wrong operation!");
            }
        }
    }
}
