import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;



public class Conversor{
	
	public static void main(String[] args) {
		
		
		String valorEntradaMoeda = JOptionPane.showInputDialog("Insira um valor:");
		
		ValidarEntrada validarEntrada = new ValidarEntrada();
		
		if(!validarEntrada.validaEntrada(valorEntradaMoeda) && valorEntradaMoeda != null ) {
		 JOptionPane.showMessageDialog(null,"A letra " + valorEntradaMoeda +" digitada não é um valor, por favor, insira um valor monetário",null, JOptionPane.WARNING_MESSAGE);
		 
		}
		
		NumberFormat totalFormatado = new DecimalFormat("#0.00");
		
		double valor = Double.parseDouble(valorEntradaMoeda);
			
		
		String[] opcoesMoedas = {"Reais para Dollar" , "Reais para Euro" , "Reais para Libras Esterlinas", "Reais para Peso Argentino", "Reais para Peso Chileno" , "Dollar para Reais", "Euro para Reais", "Libras Esterlinas para Reais", "Peso Argentino para Reais", "Peso Chileno para Reais"};
			
			String escolha = (String) JOptionPane.showInputDialog(null, "Escolha a moeda para qual você deseja girar seu dinheiro" , "Moedas", -1, null, opcoesMoedas, args);
			
			
		switch(escolha) {
			case "Reais para Dollar" :
				
				Dollar dollar = new Dollar();
				dollar.conversorDollar(valor);
		
				JOptionPane.showMessageDialog(null, "O valor de R$" + valor + " convertido em Dollares fica USD $" + totalFormatado.format(dollar.total));
				break;
				
			case "Reais para Euro":
				Euro euro = new Euro();
				euro.conversorEuro(valor);
				
				JOptionPane.showMessageDialog(null, "O valor de R$" + valor + " convertido em Euro fica €" + totalFormatado.format(euro.total));
				break;
				
			case "Reais para Libras Esterlinas":
				LibrasEsterlinas librasEsterlinas = new LibrasEsterlinas();
				librasEsterlinas.conversorLibrasEsterlinas(valor);
				
				JOptionPane.showMessageDialog(null, "O valor de R$" + valor + " convertido em Libras Esterlinas £" + totalFormatado.format(librasEsterlinas.total));
				break;
				
			case "Reais para Peso Argentino":
				PesoArgentino pesoArgentino = new PesoArgentino();
				pesoArgentino.conversorPesoArgentino(valor);
				
				JOptionPane.showMessageDialog(null, "O valor de R$" + valor + " convertido em Peso Argentino ARS $" + totalFormatado.format(pesoArgentino.total));
				break;
				
			case "Reais para Peso Chileno":
				PesoChileno pesoChileno = new PesoChileno();
				pesoChileno.conversorPesoChileno(valor);
				
				JOptionPane.showMessageDialog(null, "O valor de R$" + valor + " convertido em Peso Chileno CLP $" + totalFormatado.format(pesoChileno.total));
				break;
				
			case "Dollar para Reais":
				DollarParaReal dollarParaReal = new DollarParaReal();
				dollarParaReal.conversorDollarParaReal(valor);
				
				JOptionPane.showMessageDialog(null, "O valor de USD $" + valor + " convertido em Real R$" + totalFormatado.format(dollarParaReal.total));
				break;
				
			case "Euro para Reais":
				EuroParaReal euroParaReal = new EuroParaReal();
				euroParaReal.conversorEuroParaReal(valor);
				
				JOptionPane.showMessageDialog(null, "O valor de Euro fica € " + valor + " convertido em Real R$" + totalFormatado.format(euroParaReal.total));
				break;
				
			case "Libras Esterlinas para Reais":
				LibrasEsterlinasParaReal librasEsterlinasParaReal = new LibrasEsterlinasParaReal();
				librasEsterlinasParaReal.conversorLibrasEsterlinasParaReal(valor);
				
				JOptionPane.showMessageDialog(null, "O valor de Libra Esterlinas fica £ " + valor + " convertido em Real R$" + totalFormatado.format(librasEsterlinasParaReal.total));
				break;
				
				
			case "Peso Argentino para Reais":
				PesoArgentinoParaReal pesoArgentinoParaReal = new PesoArgentinoParaReal();
				pesoArgentinoParaReal.conversorPesoArgentinoParaReal(valor);
				
				JOptionPane.showMessageDialog(null, "O valor de Peso Argentino ARS $" + valor + " convertido em Real R$" + totalFormatado.format(pesoArgentinoParaReal.total));
				break;
				
			case "Peso Chileno para Reais":
				PesoChilenoParaReal pesoChilenoParaReal = new PesoChilenoParaReal();
				pesoChilenoParaReal.conversorPesoChilenoParaReal(valor);
				
				JOptionPane.showMessageDialog(null, "O valor de Peso Chileno CLP $" + valor + " convertido em Real R$" + totalFormatado.format(pesoChilenoParaReal.total));
				break;
				
				
				}
		
		
			int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
				if (resposta == JOptionPane.YES_OPTION) {
					
					main(args);
					
										
			}

				JOptionPane.showMessageDialog(null, "Programa Finalizado, Obrigado!");

		}

}
	
		
	
	

