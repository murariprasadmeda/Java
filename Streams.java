import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams{
  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(4,5,7,2,9);
    
    Stream<Integer> data= nums.stream();
    
//data.forEach(n ->System.out.println(n)); //...................... un comment to work
    
    
    // we cannot use again stream after used
    //n1.forEach(n ->System.out.println(n));
    
    
    //count of a stream
//    System.out.println(data.count()); //......................... uncomment to work 
    
    // sorted streams returns the another stream data
//    Stream<Integer> sortedData= data.sorted();
//    sortedData.forEach(n-> System.out.println(n));
    
    
    // using map function and lambada expression
    Stream<Integer> mappedData= data.map(n-> n*2);
    mappedData.forEach(n->System.out.println(n));
  }
}
