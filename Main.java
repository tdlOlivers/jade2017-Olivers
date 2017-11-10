import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Enter N:");
    Scanner scanner = new Scanner(System.in);
    String N = scanner.nextLine();
    System.out.println(N);  
    int[] arr = Fibonaci(Integer.parseInt(N));  
    System.out.println(Arrays.toString(arr));
  }

  public static int[] Fibonaci(int index){
    int[] arr = new int[index];
    arr[0] = 0;
    arr[1] = 1;
    for(int i=2; i<index; i++){
      arr[i] = arr[i-1] + arr[i-2];
    }
    return arr;
  }
}



