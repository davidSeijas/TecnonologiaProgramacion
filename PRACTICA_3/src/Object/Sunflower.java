//MIGUEL DERECHO PRIETO
//DAVID SEIJAS PEREZ

package Object;

public class Sunflower extends Plant{
	private static final int SOLESGENERADOS = 10;
	private static final int VIDA = 1;
	private static final int DAMAGE = 1;
	private static final int FRECUENCIA = 2;
	private static final int COSTE = 20;
	private static final String NOMBRE = "[S]unflower";
	private static final String SIMBOLO = "S";
	
	
	public Sunflower() {
		super(VIDA, DAMAGE, FRECUENCIA + 1, COSTE, NOMBRE, SIMBOLO);
	}


	public void update() {
		if(nextTime == game.getNumCiclos()) {
			nextTime += FRECUENCIA;
			game.sumarSoles(SOLESGENERADOS);
		}
	}
	
	
	public String toStringRelease() {
		return (SIMBOLO + " [" + vida + "]");
	}


	public String toStringDebug() {
		return (SIMBOLO + "[" + "l:" + vida + ",x:" + x + ",y:" + y + ",t:" + (nextTime - game.getNumCiclos()) + "]");
	}
}