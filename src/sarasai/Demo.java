package sarasai;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println ( "Studentai: " );
		
		Studentai[] java_programuotojai = { 
				
			new Studentai ( "Tadas", "1990-07-28",'V', 87, 187 )
			, new Studentai ( "Vilius", "1990-03-24",'V', 95, 185 )
			, new Studentai ( "Marius", "1997-05-31",'V', 65, 180 )
			, new Studentai ( "Laurynas", "1996-08-04",'V', 80, 186 )
			, new Studentai ( "Gintautas", "1970-07-03", 'V', 96, 187 )
		};

		Sarasas jps = new StudentuSveikata ( java_programuotojai, 5 );
		
		jps.parodyti();
	}

}
