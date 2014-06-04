import javax.swing.JOptionPane;


public class CodeBrett {

	private char[] code = new char[4];
	private char[][] userset = new char[7][4];
	private int roundc = 0;

	public static final char ROT = 'A', GELB = 'B', GRUEN = 'C', BLAU = 'D', VIOLET ='E', SCHWARZ ='F' ;

	public CodeBrett(char a, char b, char c, char d) {
		this.setCode(a,b,c,d);
	}
	public void setCode(char a, char b, char c, char d){
		code[0]=a;
		code[1]=b;
		code[2]=c;
		code[3]=d;
	}
	public int[] choose(char a, char b, char c, char d){
		return this.choose((new char[]{a,b,c,d}));
	}
	public int[] choose(char[] c){
		if(c[0]==code[0]&&c[1]==code[1]&&c[2]==code[2]&&c[3]==code[3]){
			JOptionPane.showMessageDialog(null, "Herzlichen Gl�ckwunsch!!\nGeschafft in "+(roundc+1)+" Runden!");
			System.exit(0);
		}
		int[] ret = new int[2];
		if(roundc < userset.length){
			this.userset[this.roundc]=c;
			
			int fails1=0,fails = 0;
			for (int i = 0; i < 4; i++)
			{
				for (int j = 0; j < 4; j++)
				{
					if (code[i] == c[j]){
						if (i == j)
							ret[0]++;
						else
							ret[1]++;
					}
					
				}
			}
			this.roundc++;
			

		}
		return ret;
	}
	public char[] getColors(int row){
		if(row < roundc)
			return userset[row];
		return code;

	}
	public int[] checkRow(int row) {
		int[] ret = new int[2];
			
			int fails1=0,fails = 0;
			for (int i = 0; i < 4; i++)
			{
				for (int j = 0; j < 4; j++)
				{
					if (code[i] == userset[row][j]){
						if (i == j)
							ret[0]++;
						else
							ret[1]++;
					}
					
				}
			}
			

		
		return ret;

	}

}
