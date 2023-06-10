
package Array;

import java.util.Scanner;

public class FrequencyOfEachElement {
    public static void main(String[] args) {
        
        char[] arr = new char[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your "+arr.length+" elements: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = input.next().charAt(0);
        }
        int f[] = new int [arr.length];
        
        int visited = -1;
        
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    f[j] = visited;
                }
            }
            if (f[i] != visited) {
                f[i] = count;
            }
        }
        System.out.println("--------------------");
        System.out.println(" Elements | Frequency\t");
        System.out.println("--------------------");
        for (int i = 0; i < arr.length; i++) {
            if (f[i] != visited) {
                System.out.println("\t"+arr[i]+" | "+f[i]+"\t");
            }
        }
        System.out.println("--------------------");
    }
}
