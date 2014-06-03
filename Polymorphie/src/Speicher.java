
public class Speicher<T> {
	private T speicher;
	
	public Speicher(T o){
		speicher = o;
	}

	public Object getSpeicher() {
		return speicher;
	}

	public void setSpeicher(T speicher) {
		this.speicher = speicher;
	}
	@Override
	public String toString(){
		return speicher.toString();
	}
	
}
