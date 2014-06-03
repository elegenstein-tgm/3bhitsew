package ebraendli;

import static org.junit.Assert.*;

import org.junit.Test;

public class GenericUtilsTest {

	@Test
	public final void testMin() {
		if(GenericUtils.min(1, 2)!=1){
			throw new RuntimeException("Gibt die größere Zahl zurück");
		}
	}

}
