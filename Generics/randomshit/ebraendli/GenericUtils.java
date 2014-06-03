/**
 * 
 */
package ebraendli;

/**
 * @author Erik
 *
 */
public class GenericUtils {

	/**
	 * @param args
	 */
	/**
	public static void main(String[] args) {
		System.out.println(GenericUtils.min(2, 1));

	}
	*/
	public static <T extends Comparable<T>> T min(T t1, T t2){
		if(t1.compareTo(t2)>0)
			return t2;
		return t1;
	}
	public static <T extends Comparable<T>> T min(T[] ta){
		T t1 = ta[0];
		for(int i =1 ; i < ta.length; i++){
			t1 = GenericUtils.min(t1,ta[i]);
		}
		return t1;
	}
}
