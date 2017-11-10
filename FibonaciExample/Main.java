package FibonaciExample;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Enter N:");
    Scanner scanner = new Scanner(System.in);
    String N = scanner.nextLine();
    int[] arr = Fibonaci(Integer.parseInt(N));  
    System.out.println(Arrays.toString(arr));
  }

  public static int[] Fibonaci(int index){
    if (index < 0) {return null;}    
    int[] arr = new int[index + 1];
    arr[0] = 0;
    if (index == 0) {return arr;}    
    arr[1] = 1;
    if (index == 1) {return arr;}
    for(int i=2; i<index+1; i++){
      arr[i] = arr[i-1] + arr[i-2];
    }
    return arr;
  }
}

