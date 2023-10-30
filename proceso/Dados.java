
public class Dado {

	//Atributos
	int iValor;
	
	int iRango;
	
	
	
	//Métodos
	
	//Constructor
	public Dado() {
		
		iValor = 1;
		iRango = 6;
		
	}
	
	//Resto de Métodos
	
	public int getValor() {
		return iValor; 
	}
	
	public void setValor(int nuevoValor) {
		iValor = (int)(Math.random()*iRango+1);
	}
	
}
