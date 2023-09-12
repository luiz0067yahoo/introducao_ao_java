package objects;

import java.util.Iterator;

public class ExemploArrays {
	public static void main(String[] args) {
		String[] Marcas = {"Volvo", "BMW", "Ford", "Fiat"};
		String[] Cores = {"Vermelho", "Amarelo", "Azul", "Verde"};
		for (String marca:Marcas) {
			if(marca.equals("Ford"))
				break;
			System.out.println(marca);			
		}
		for (int i=0;i<Cores.length;i++) {
			System.out.println(Cores[i]);			
		}
		String[] Administrativo =  {"Compras", "RH", "Comercial"};
		String[] Producao = {"PCP", "Embalagem", "Expedição", "QA"};
		String[][] Setores = { Administrativo, Producao };
		for (int i=0;i<Setores.length;i++) {
			String[] setor=Setores[i];
			for (int j=0;j<setor.length;j++) {
				String departameto=setor[j];
				System.out.println(departameto);			
			}			
		}
	}
}
