import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStr {

	@Test
	public void test() {
		JUnitTesting junit1 =new JUnitTesting();
		String re=junit1.addStr("Mayank ","Agarwal");
           assertEquals("Mayank Agarwal",re);

	}

}
