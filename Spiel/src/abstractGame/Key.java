package abstractGame;

public class Key extends GameObject {
	int id;
	boolean isBroken;
	@Override
	public boolean useOn(GameObject o) {
		
		if(o instanceof Tuer){
			if(((Tuer)o).id == this.id&&!isBroken){
				((Tuer)o).isOpen = !((Tuer)o).isOpen;
				return true;
			}
			else {
				isBroken = true;
			}
		}
		
		return false;
	}

}
