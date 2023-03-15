




@FunctionalInterface
interface ClassTest{
	int testMethod(Integer i , Integer j);
}
public class LambadaReturnValue {
	
	public static void main(String[] args) {
	ClassTest obj= (i,j)-> i+j;
	
	System.out.println(obj.testMethod(9,4));
	}
	
	

}
