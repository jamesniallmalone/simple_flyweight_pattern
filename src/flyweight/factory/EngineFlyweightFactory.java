package flyweight.factory;

import java.util.HashMap;

import flyweight.engine.Engine;
import flyweight.engine.StandardEngine;
import flyweight.engine.TurboEngine;

public class EngineFlyweightFactory {
	
	private HashMap<Integer, Engine> turboEnginePool;
	private HashMap<Integer, Engine> standardEnginePool;

	public EngineFlyweightFactory(){
		/*
		 * All 1300 engines share the same object, all 1600 engines share same object.
		 */
		standardEnginePool = new HashMap<Integer, Engine>();
		turboEnginePool = new HashMap<Integer, Engine>();
	}
	
	public Engine getStandardEngine(int size){
		Engine e = standardEnginePool.get(size);
		
		if (e == null){
			e = new StandardEngine(size);
			standardEnginePool.put(size, e);
		}
		
		return e;
	}
	
	public Engine getTurboEngine(int size){
		Engine e = turboEnginePool.get(size);
		
		if (e == null){
			e = new TurboEngine(size);
			standardEnginePool.put(size, e);
		}
		
		return e;
	}

}
