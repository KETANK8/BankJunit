package Testing.BankTest;
import static org.junit.Assert.assertEquals;


//import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AppTest{
	
	@Test
	void testGetBalance(){
		assertEquals(20000,new customer("xyz",123,20000).getAmount());	
	}
	
	@Test
	void testWithDraw(){
		assertEquals(19000,new customer("xyz",123,20000).withdrawAmount(1000));	
	}
	
	@Test
	void testDeposit(){
		assertEquals(21000,new customer("xyz",123,20000).depositAmount(1000));	
	}
	
	
}