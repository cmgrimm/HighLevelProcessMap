package mapConfig;

import java.util.List;

public class ModelDefinition {
	
	//private String model;
	private InfoRatio infoRatio;
	private List<?> stocks;
	private List<?> deciles;
	
	ModelDefinition(String sector) {
		this.infoRatio = new InfoRatio(sector);
		this.stocks = setStocks(sector);
		this.deciles = setDeciles(sector);
	}

	private List<?> setDeciles(String sector) {
		// TODO Auto-generated method stub
		return null;
	}

	private List<?> setStocks(String sector) {
		// TODO Auto-generated method stub
		return null;
	}

	public InfoRatio getInformationRatio() {
		return infoRatio;
	}
	
	public List<?> getStocks() {
		return stocks;
	}

	public List<?> getDeciles() {
		return deciles;
	}

}
