package sarasai;

public class StudentuSveikata extends Sarasas {
	
	public StudentuSveikata() {
		
	}
	
	public StudentuSveikata( Irasas[] sarasas, int dydis ) {
		
		SarasasIsMasyvo( sarasas, dydis );
	}
	
	public void parodyti1( int iraso_nr ) {
		
		// System.out.print ( irasai [ iraso_nr ].irasoEilute() + " " + ( ( Studentai )  irasai [ iraso_nr ] ).kmi() );
		//
		// 2 var:
		
		super.parodyti1(iraso_nr);
		System.out.print ( " " + String.format ( "%5f2", ( ( Studentai )  irasai [ iraso_nr ] ).kmi() ) );		
	}
}
