package objects;
public class ExemploString2 {
	public static void main(String[] args) {
		String texto="Programação em Java";
		System.out.println("Qual a posição da palavra Java no texto");
		System.out.println(texto.indexOf("Java"));
		System.out.println("Maiúsculo");
		System.out.println(texto.toUpperCase());
		System.out.println("Minúsculo");
		System.out.println(texto.toLowerCase());
		System.out.println("metodo Contatenação");
		System.out.println(texto.concat(" para computadores"));
		// \n	Nova Linha  \t Tab
		System.out.println("\n1\n2\n3\t4\t5");
		System.out.println("metodo de comparação");
		if("A"==(char)65+"") {
			System.out.println(texto.concat(" A é igual caractere 65")); 
		}
		else {
			System.out.println(texto.concat(" A não é igual caractere 65"));
		}
		if("A".equals((char)65+"")) {
			System.out.println(texto.concat(" A é igual caractere 65")); 
		}else if("A".equals((char)66+"")) {
			System.out.println(texto.concat(" A não é igual caractere 66"));
		}
	}
}
