package cl.sgto.jwt;

import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import utils.EmailValidator;
import utils.PassValidator;

@SpringBootTest
class JwtApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void  testValidaEmail() {
		assumeTrue(EmailValidator.validate("pablovillablanca@gmail.com"));
	}
	
	@Test
	void  testValidaPass() {
		assumeTrue(PassValidator.validate("Acrrr34"));
	}
	
	@Test
	void  testValidaEmailIncorrecto() {
		assumeFalse(EmailValidator.validate("pablo.villablaail.com"));
	}
	
	@Test
	void  testValidaPassIncorrecto() {
		assumeFalse(PassValidator.validate("c33332c"));
	}
}
