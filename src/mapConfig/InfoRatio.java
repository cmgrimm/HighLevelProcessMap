package mapConfig;

public class InfoRatio {

	private int[][] ir;
	
	public InfoRatio(String sector) {
		this.setIr(sector); 

	}

	public int[][] getIr() {
		return ir;
	}

	public void setIr(String sector) {
		this.ir = new int[10][15];
	}
}