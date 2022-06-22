import java.text.NumberFormat;
import java.text.ParseException;

public class Program {

	public static void main(String[] args) throws ParseException {
		Integer totalStates = 5; //quantidade total de estados
		String[][] state = new String[totalStates][2];
		Double sumAllStates = 0.00;
		state[0][0] = "SP";
		state[0][1] = "67.836,43";
		state[1][0] = "RJ";
		state[1][1] = "36.678,66";
		state[2][0] = "MG";
		state[2][1] = "29.229,88";
		state[3][0] = "ES";
		state[3][1] = "27.165,48";
		state[4][0] = "Outros";
		state[4][1] = "19.849,53";
		System.out.println("Calculadora de Porcentagem");
		System.out.println("--------------------------");		
		//soma o valor de todos os estados
        for(int i = 0; i <= state.length -1; i++){
        	sumAllStates = sumAllStates + converte(state[i][1]);
        }
        	//Com base no valor de todos os estados faz a soma de cada um pegando sua porcentagem
	        for(int i = 0; i <= state.length -1; i++){
	        	Double sumthatState = 0.00;
	        	sumthatState = converte(state[i][1]) * 100 / sumAllStates;
	        	System.out.println(state[i][0] + " $" + state[i][1] + " - " + String.format("%.2f", sumthatState) + "%");
	        }
	        System.out.println("Valor total: $" + String.format("%.2f", sumAllStates));
		
	}
	//converte um número com vírgulas ex: 2,56 para double
	public static double converte(String arg) throws ParseException{
		NumberFormat nf = NumberFormat.getNumberInstance();
		double number = nf.parse(arg).doubleValue();
		return number;
	}
	
}
