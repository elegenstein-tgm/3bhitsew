
public class Controler {
	private View v;
	public Controler() {
		v =new View();
		v.cb = new CodeBrett('A', 'B', 'C', 'D');
		v.setVisible(true);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Controler();

	}

}
