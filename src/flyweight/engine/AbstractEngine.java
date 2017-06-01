package flyweight.engine;

import flyweight.diagnostics.DiagnosticTool;

public abstract class AbstractEngine implements Engine {
	
	private int size;
	private boolean isturbo;
	
	public AbstractEngine(int s, boolean t){
		size = s;
		isturbo = t;
	}

	public int getSize(){
		return size;
	}

	public boolean isTurbo(){
		return isturbo;
	}
	@Override
	public String diagnose(DiagnosticTool tool) {
		return tool.runDiagnostics(this);
	}

}
