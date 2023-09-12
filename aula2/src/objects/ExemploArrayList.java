package objects;
import java.util.ArrayList;
import java.util.Collections;
public class ExemploArrayList {
	 public static void main(String[] args) {
	    ArrayList<String> Marcas = new ArrayList<String>();
	    Marcas.add("Volvo");
	    Marcas.add("BMW");
	    Marcas.add("Ford");
	    Marcas.add("Fiat");
	    System.out.println(Marcas);//lista as marcas
	    System.out.println(Marcas.get(3));//mostra fiat
	    Marcas.set(3, "Honda");//troca fiat por honda
	    System.out.println(Marcas.get(3));//mostra honda
	    Marcas.remove(3);//remove honda
	    System.out.println(Marcas);//lista as marcas
	    System.out.println(Marcas.size());//quantidade de marcas
	    Collections.sort(Marcas);//ordena as marcas
	    System.out.println(Marcas);//lista as marcas
	    Marcas.clear();//remove todas as marcas	
	  }
}
