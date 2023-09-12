package objects;
public class ExemploMath {
	public static void main(String[] args) {
		int x=25,y=-9;
		System.out.println("Máximo :"+Math.max(x, y));
		System.out.println("Mínimo :"+Math.min(x, y));
		System.out.println("Mínimo :"+Math.sqrt(x));
		System.out.println("Sempre positivo :"+Math.abs(y));
		System.out.println("Sorteio de 1 a 3 :");
		int sorteio=(int)(Math.random() * 3)+1;
		switch(sorteio) {
		  case 1:
			System.out.println("número 1");
		    break;
		  case 2:
			  System.out.println("número 2");
		    break;
		  case 3:
			  System.out.println("número 3");
		      break;
		  default:
			  System.out.println("diferente de 1 até 3");
		}
	}

}
