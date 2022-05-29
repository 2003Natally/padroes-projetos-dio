package one.digitalinnovantion.gof.singleton;

/**
 * Singleton "apressado"
 * 
 * @author 2003Natally
 */
public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
