
public class Ejercicios { 
	//Constantes
	static final int RANGO = 6;
	static final String GANA1 = "GANADOR: Jugador 1";
	static final String GANA2 = "GANADOR: Jugador 2"; 
	static final String EMPATE = "EMPATE";
			
		public static void main(String[] args) {
			// TODO Auto-generated method stub
				
			//Juego de los dados gana el seis

			//In, Out, Process, Memory???

			//In, entrada -> cuatro valores obtenidos mediante random (Math)
			//Out, salida -> mensajes "ha ganado el jugador 1", "ha ganado el jugador 2", "han empatado"
			//Proceso -> obtener la entrada,decidir sobre los valores cuál es la salida
				
			//Persistencia: valores de los datos, número del valor máximo del dado ()
			//mensajes de salida posibles

			//Declaraciones (Persistencia)
			short valor, valor2, valor3, valor4;
			short rangos1 = 0, rangos2 = 0, resultado1 = 0, resultado2 = 0;
				
			//In
			valor  = (short) (Math.random()*RANGO+1);
			valor2 = (short) (Math.random()*RANGO+1);
			valor3 = (short) (Math.random()*RANGO+1);
			valor4 = (short) (Math.random()*RANGO+1);
			resultado1 = (short) (valor + valor2);
			resultado2 = (short) (valor3 + valor4);
				
			//Proceso
			if (valor ==    RANGO) {
				rangos1++;
			} if (valor2 == RANGO) {
				rangos1++;
			} if (valor3 == RANGO) {
				rangos2++;
			} if (valor4 == RANGO) {
				rangos2++;
			}
			//si no hay ganar o empate por seises, sumas
				
			//Out
			System.out.println("El Juego del Dado | Rango: " + RANGO);			
			System.out.println("Dado 1 del J1 = " + valor);
			System.out.println("Dado 2 del J1 = " + valor2);
			System.out.println("Total J1 = " + resultado1);
			System.out.println("Dado 1 del J2 = " + valor3);
			System.out.println("Dado 2 del J2 = " + valor4);
			System.out.println("Total J2 = " + resultado2);
				
			if (rangos1 > rangos2) {
				System.out.println(GANA1);
			} else if (rangos2 > rangos1) {
				System.out.println(GANA2);
			} else if (resultado1 > resultado2) {
				System.out.println(GANA1);
			} else if (resultado2 > resultado1) {
				System.out.println(GANA2);
			} else {
				System.out.println(EMPATE);
			}
		}
	}

