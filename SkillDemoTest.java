//javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" SkillDemoTest.java
//java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore SkillDemoTest

import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void multiply(){
        assertEquals(6, SkillDemo.multiply(2,3));
    }
}
