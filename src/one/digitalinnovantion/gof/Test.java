package one.digitalinnovantion.gof;

import one.digitalinnovantion.gof.facade.Facade;
import one.digitalinnovantion.gof.singleton.SingletonEager;
import one.digitalinnovantion.gof.singleton.SingletonLazy;
import one.digitalinnovantion.gof.singleton.SingletonLazyHolder;
import one.digitalinnovantion.gof.strategy.Comportamento;
import one.digitalinnovantion.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovantion.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovantion.gof.strategy.ComportamentoNormal;
import one.digitalinnovantion.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		//Singleton
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		//Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();		
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		
		//Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Natally", "11223344");


	}
}
