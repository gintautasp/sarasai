package sarasai;

public class Studentai implements Irasas {
	
	private String pav;
	
	private String gim_data;
	
	private char lytis;
	
	private Integer svoris;
	
	private Integer ugis;
	
	
	public Studentai() {
		
	}

	public Studentai(String pav, String gim_data, char lytis, Integer svoris, Integer ugis) {
		super();
		this.pav = pav;
		this.gim_data = gim_data;
		this.lytis = lytis;
		this.svoris = svoris;
		this.ugis = ugis;
	}

	public String getPav() {
		return pav;
	}

	public void setPav(String pav) {
		this.pav = pav;
	}

	public String getGim_data() {
		return gim_data;
	}

	public void setGim_data(String gim_data) {
		this.gim_data = gim_data;
	}

	public char getLytis() {
		return lytis;
	}

	public void setLytis(char lytis) {
		this.lytis = lytis;
	}

	public Integer getSvoris() {
		return svoris;
	}

	public void setSvoris(Integer svoris) {
		this.svoris = svoris;
	}

	public Integer getUgis() {
		return ugis;
	}

	public void setUgis(Integer ugis) {
		this.ugis = ugis;
	}

	public String irasoEilute() {
		
		String eilute = "";
		
		eilute += String.format( "%30s", this.pav );
		eilute += String.format( "%12s", this.gim_data );
		eilute += String.format( "%3s", this.lytis );
		eilute += String.format( "%5d", this.ugis );
		eilute += String.format( "%3d", this.svoris );
		
		return eilute;
	}
	
	public double kmi() {
		
		double ugis_m = ugis / 100.0;
		
		return svoris / ( ugis_m * ugis_m );
	}
}
