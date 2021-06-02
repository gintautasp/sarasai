package sarasai;

public class Sarasas {
	
	public Irasas[] irasai;
	public int dydis;

	public Sarasas() {
	}
	
	public void SarasasIsMasyvo( Irasas[] sarasas, int dydis ) {

		irasai = sarasas;
		this.dydis = dydis;
	}

	public void parodyti() {
	
		for ( int i = 0; i < dydis; i++ ) {
		
			parodyti1 ( irasai [ i ].irasoEilute() );
			System.out.println();
		}
	}
	
	public void parodyti1( String iraso_eil ) {
	
		System.out.print ( iraso_eil );
	}	
}
