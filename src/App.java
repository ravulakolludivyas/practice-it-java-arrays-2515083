import java.lang.reflect.Array;
import java.util.Arrays;

public class App {
  
  public static Integer findsecondsmallInteger2(Integer[] arr){
    int smallest = Integer.MAX_VALUE;
    int secondsmallest = Integer.MAX_VALUE;
    if (arr.length < 2) {
      System.out.println("not valid");
    }
    Arrays.sort(arr);
    
    for (int i = 0; i < arr.length-1; i++) {
      int cur = arr[i];
      if(cur < smallest)
      {
        secondsmallest = smallest;
        smallest = cur;
      }
      else if(cur < secondsmallest && cur!= smallest)
      {
        secondsmallest = cur;
      }
    }
    if (secondsmallest == Integer.MAX_VALUE) {
        return null; 
    }
    return secondsmallest;
  }
  
  public static Integer findsecondsmallInteger(Integer[] arr) {
    if (arr.length < 2) {
      System.out.println("not valid");
    }
    Arrays.sort(arr);

    for (int i = 0; i < arr.length - 1; i++) {

      if (arr[i] != arr[i + 1]) {
        return arr[i + 1];
      }
    }
    return null;

  }
  public static void main(String[] args) {
   Integer[] arr = new Integer[]{5,8,3,2,6};
   System.out.println(findsecondsmallInteger(arr));
  }
}