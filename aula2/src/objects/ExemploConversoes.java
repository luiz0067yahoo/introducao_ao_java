package objects;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ExemploConversoes {
	public static void main(String[] args) {
		Object x=1;
		Object y=2.0;
		Object natal="25/12/2023";
		int w;
		double z; 
		try {
			w=(int)x;
			w=Integer.parseInt(x.toString());
			z=(double)y;
			z=Double.parseDouble(y+"");
			System.out.println("x+y="+(w+z));
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			Date data =formato.parse(natal.toString());
			System.out.println(data);
		}
		catch(Exception erro) {
			System.out.println("Erro ao converter"+erro.getMessage());
		}
		finally {
			System.out.println("fim");
		}
	}
}
