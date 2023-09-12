package objects;
import java.util.Iterator;
public class ExemploString {
	public static void main(String[] args) {
		String texto1="Java",texto2=" em ",texto3="Programação";
		System.out.println("Concatenação");
		System.out.println(texto1+texto2+texto3);
		System.out.println("texto1 tem "+texto1.length()+" caracteres");
		System.out.println("O primeiro caracteres de texto1 é "+texto1.charAt(0));
		System.out.println("O primeiro caracteres de Ultimo é "+texto1.charAt(texto1.length()-1));
		System.out.println("Os dois caracteres do meio são "+texto1.substring(1,3));
		System.out.println("Os dois caracteres do fim são "+texto1.substring(texto1.length()-2));
		System.out.println("Montando o Alfabeto Maiúsculo");
		String Alfabeto="";
		for (int contador=65;contador<91;contador++) {
			Alfabeto+=(char)contador;			
			System.out.println(
					"numero da tabela ascii "+contador+" caractere "+(char)contador
			);
		}
		Alfabeto="";
		System.out.println("Montando o Alfabeto Minúsculo");
		int contador=97;
		while (contador<123) {
			Alfabeto+=(char)contador;			
			contador++;
		}
		System.out.println(Alfabeto);
		String numeros="";
		System.out.println("Montando os numeros");
		contador=48;
		do{
			numeros+=(char)contador;			
			contador++;
		}while (contador<58);
		System.out.println(numeros);
	}
}
