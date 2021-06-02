package sarasai;

public class Sarasas {
	
	public Irasas[] irasai;
	public int dydis;

	public Sarasas() {
	}
	
	public Sarasas( Irasas[] sarasas, int dydis ) {
		
		SarasasIsMasyvo ( sarasas, dydis );
	}
	
	public void SarasasIsMasyvo( Irasas[] sarasas, int dydis ) {

		irasai = sarasas;
		this.dydis = dydis;
	}

	public void parodyti() {
	
		for ( int i = 0; i < dydis; i++ ) {
		
			parodyti1 ( i );
			System.out.println();
		}
	}
	
	public void parodyti1( int iraso_nr ) {
	
		System.out.print ( irasai [ iraso_nr ].irasoEilute() );
	}	
}
