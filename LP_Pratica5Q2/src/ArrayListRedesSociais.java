import java.util.*;
import java.util.Iterator;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class ArrayListRedesSociais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int i,j;
		Scanner ler = new Scanner(System.in);
		
		
		ArrayList<String> redes = new ArrayList();

		
		do
	     {
	     String menu= JOptionPane.showInputDialog("MENU\n1-Cadastrar\n2-Excluir\n3-Pesquisar\n5-Sair");
	     i = Integer.parseInt(menu);
	     switch (i)
	        {
	             case 1:
	                
	            	String nome= JOptionPane.showInputDialog("Digite o Nome: ");
	                String telefone= JOptionPane.showInputDialog("Digite o telefone: ");
	                String insta= JOptionPane.showInputDialog("Digite seu @: ");
	                String email= JOptionPane.showInputDialog("Digite o seu e-mail: ");
	                
	                redes.add(nome+";"+telefone+";"+insta+";"+email);
	                
	                JOptionPane.showMessageDialog(null, "Inserido com Sucesso");
	                
	                 break;
	                 
	             case 2:
	                 String nomeexcluir= JOptionPane.showInputDialog("Digite o Nome: ");
	                
	                j = 0;
	                
	                JOptionPane.showMessageDialog(null, "Exclu�do com Sucesso");
	                
	                 try {
	                    redes.remove(nomeexcluir);
	                    
	                  } catch (IndexOutOfBoundsException e) {
	                      // exce��o lan�ada para indicar que um �ndice (i)
	                      // est� fora do intervalo v�lido (de 0 at� agenda.size()-1)
	                      System.out.printf("\nErro: posi��o inv�lida (%s).",
	                        e.getMessage());
	                  }
	                 break;
	           
	             case 3:
	 
	                   j = 0;
	                   
	                    Iterator<String> iterator = redes.iterator();
	                    
	                    while (iterator.hasNext()) 
	                    {
	                      System.out.printf("Posi��o %d- %s\n", j, iterator.next());
	                      j++;
	                    }
	                    break;
	                    
	                 
	            
	             case 4:
	                 break;
	             default:
	                  JOptionPane.showMessageDialog(null, "Escolha uma das op��es v�lidas");
	        }
	     } while (i!=4);
	}
	}