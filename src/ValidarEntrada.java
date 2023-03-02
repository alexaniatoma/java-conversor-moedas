
public class ValidarEntrada {
	
	public boolean validaEntrada(String valorEntradaMoeda) {
		try {
			Double.parseDouble(valorEntradaMoeda);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
