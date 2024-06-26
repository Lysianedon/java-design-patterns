package fr.diginamic.singleton;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {
	  @Test
	    public void testSingletonInstance() {
	        Singleton instance1 = Singleton.getInstance();
	        Singleton instance2 = Singleton.getInstance();
	        
	        assertNotNull(instance1, "Instance should not be null");
	        assertEquals(instance1, instance2, "Instances should be the same");
	    }

	    @Test
	    public void testSingletonProperties() {
	        Singleton instance = Singleton.getInstance();
	        assertEquals("jdbc:mysql://localhost:3306/mabase", instance.getUrl(), "URL should match the expected value");
	        assertEquals("root", instance.getUser(), "User should match the expected value");
	        assertEquals("1234", instance.getPassword(), "Password should match the expected value");
	    }

}
