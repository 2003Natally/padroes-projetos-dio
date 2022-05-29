package one.digitalinnovantion.gof.singleton;

/**
 * Singleton "preguiçoso"
 * 
 * @author 2003Natally
 */
public class SingletonLazy {

	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia ==  null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}
