import javax.swing.JOptionPane;

public class entrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String anoAtual=JOptionPane.showInputDialog("Informe o ano Atual:");
		String ano=JOptionPane.showInputDialog("Informe ano nascimento: ");
		
		
		double anoAtualNumero = Double.parseDouble(anoAtual);
		double anoNumero=Double.parseDouble(ano);
		
		int sub = (int)(anoAtualNumero-anoNumero);//transformando para inteiro
		
		System.out.println("A sua idade e "+sub);
		
		JOptionPane.showMessageDialog(null, " A sua idade e "+ sub);
		

	}

}
