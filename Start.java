import java.util.Scanner
public class Start {

	public Start() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
int hora; 
int minutos;
int segundos;

System.out.println("por favor, introduzca la hora");
if (hora >0 || hora <23) {
	System.out.print("por favor, introduzca la hora");
	System.exit(1);
	
	System.out.println ("por favor, introduzca los minutos");
	
	if(minutos >0 || minutos <59) {
		System.out.print("secuencia correcta");
		System.exit((2));
	}
	System.out.println ("por favor, introduzca los segundos");
	if (segundos>0 || segundos <59) {
		System.out.println ("secuencia correcta");
		System.exit (3);
	}
}
System.out.println ("la hora es correcta");

	}

}
