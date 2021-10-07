import javax.swing.JOptionPane;

public class caixasDeConfirmacao {

    public static void main(String[] args) {
        
        
        int criptografia;
        String res = "";
        String carac = "";
        String s10 = "";
        String cripto ;
        
    // entrada de dados 
        cripto = JOptionPane.showInputDialog("Entre com uma String : ");
   
   
     // conversor
     
      for ( int i = 0; i < cripto.length(); ++i ) 
         { 
             char c = cripto.charAt( i ); 
             int j = (int) c; 
             criptografia = j +  10;
             
             
             carac += " " + j;
             s10 += " " + criptografia;
             res += " " + (char)criptografia;
             
                          
         } 
    //saida de dados
    
    JOptionPane.showMessageDialog(null, carac); 
    JOptionPane.showMessageDialog(null, s10);
    JOptionPane.showMessageDialog(null, res);
     
     }
 }
