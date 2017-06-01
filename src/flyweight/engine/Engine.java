package flyweight.engine;

import flyweight.diagnostics.DiagnosticTool;

public interface Engine {
	//Intrinsic method, shared.
	public int getSize();
	public boolean isTurbo(); 
	
	//Extrinsic state. Passed as argument, not shared
	public String diagnose(DiagnosticTool tool);

}
