package flyweight.diagnostics;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import flyweight.diagnostics.DiagnosticTool;
import flyweight.diagnostics.EngineDiagnosticTool;

public class TestEngineDiagnosticTool {
	
	private DiagnosticTool edt;

	@Before
	public void initialise(){
		edt = new EngineDiagnosticTool();
	}
	
	@Test
	public void testEngineDiagnoticTool(){
		assertNotNull("Should not be null.", edt);
	}

	@Test
	public void testRunDiagnostics() {
		assertEquals("Not equal", "Engine diagnosis complete", edt.runDiagnostics(""));
	}

}
