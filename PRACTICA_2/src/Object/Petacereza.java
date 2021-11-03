//MIGUEL DERECHO PRIETO
//DAVID SEIJAS PEREZ

package Object;

public class Petacereza extends Plant {
	private static final int VIDA = 2;
	private static final int DAMAGE = 10;
	private static final int FRECUENCIA = 2;
	private static final int COSTE = 50;
	private static final String NOMBRE = "Peta[c]ereza";
	
	
	public Petacereza() {
		super(VIDA, DAMAGE, FRECUENCIA, COSTE, NOMBRE);
	}
	
	
	public void update() {
		if(game.getNumCiclos() == this.nextTime) {
			game.explotarPetacereza(x, y, damage);
			vida = 0;
		}
	}
	
	
	public String toStringRelease() {
		return ("C [" + vida + "]");
	}


	public String toStringDebug() {
		return ("C[" + "l:" + vida + ",x:" + x + ",y:" + y + ",t:" + (nextTime - game.getNumCiclos()) + "]");
	}
}