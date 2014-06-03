
/**
 * 
 */

/**
 * @author Erik
 * @param <T>
 *
 */
public class SpeicherHM<Dick extends Comparable<Dick>> {

	/**
	 *    D~~ O=
	 * 
	 * @param args
	 */
	
	public SpeicherHM (Dick a){
		this.speicher = a;
	}
	private Dick speicher;
	public static <Dick> String convert(Dick j){
		
		return j.toString();
	}
	public static <Dick> Dick zufall(Dick z1, Dick z2) {
		if (Math.random()<0.5){
			return z1;
		}else{
			return z2;
		}
		
	}
	private boolean istGroesser(Dick p1){
		if(this.speicher.compareTo(p1)>0)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(SpeicherHM.<Double>convert(7.0));//Java kann anhand der übergebenwerte erraten was übergeben wird
		System.out.println(SpeicherHM.convert("Hallo"));
		System.out.println(SpeicherHM.<String>zufall("Hallo", "Ciao"));
	}
	public int compareTo(Dick o) {
		return 0;
	}
	public boolean equals(Object o){
		return false;
		
	}

}
