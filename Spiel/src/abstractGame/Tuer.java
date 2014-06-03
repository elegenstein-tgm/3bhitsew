/**
 * 
 */
package abstractGame;

/**
 * @author Erik
 *
 */
public class Tuer extends GameObject {
	int id;
	boolean isOpen;
	@Override
	public boolean useOn(GameObject o) {
		return false;
	}

}
