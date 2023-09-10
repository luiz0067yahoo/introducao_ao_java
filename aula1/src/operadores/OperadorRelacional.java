package operadores;

public class OperadorRelacional {

	public static void main(String[] args) {
		System.out.println("tabela E");
		System.out.println("true  && true  "+(true  && true));
		System.out.println("true  && false "+(true  && false));
		System.out.println("false && true  "+(false && true));
		System.out.println("false && false "+(false && false));
		System.out.println("");
		System.out.println("tabela OU");
		System.out.println("true  || true  "+(true  || true));
		System.out.println("true  || false "+(true  || false));
		System.out.println("false || true  "+(false || true));
		System.out.println("false || false "+(false || false));
		System.out.println("");
		System.out.println("tabela not");
		System.out.println("!true "+(!true));
		System.out.println("!false "+(!false));

	}

}
