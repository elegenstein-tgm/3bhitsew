
public class Controler {
	public View v;
	public Controler() {
		v =new View();
		v.setVisible(true);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Controler c = new Controler();
		c.v.cb = new CodeBrett('A', 'B', 'C', 'D');

	}

}
