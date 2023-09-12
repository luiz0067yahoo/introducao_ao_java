package objects;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ExemploDate {
	public static void main(String[] args) {
		// Suponhamos que você tenha uma data representada como um objeto Date
        Date data = new Date();
        System.out.println("Data formatada (yyyy-MM-dd): " + formatarData(data, "yyyy-MM-dd"));
        System.out.println("Data formatada (dd/MM/yyyy): " + formatarData(data, "dd/MM/yyyy"));
	}	
	public static String formatarData(Date data,String formato) {
		SimpleDateFormat formatoData = new SimpleDateFormat(formato);
		String dataFormatada = formatoData.format(data);		
		return dataFormatada;
	}
}
