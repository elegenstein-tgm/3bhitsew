import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Erik
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = changer(JOptionPane.showInputDialog("Name"));
		JOptionPane.showMessageDialog(null, "Hallo" + name);

	}
	private static String changer(String s){
		if(s.contains("Gerald")==true){
			s = s.replace("Gerald", "du scheisskind");
		}
		if(s.contains("Erik")){
			s= s.replace("Erik", "Master");
		}
		return s;
	}
}
