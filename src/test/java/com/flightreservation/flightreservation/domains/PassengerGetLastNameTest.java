// ********RoostGPT********
/*
Test generated by RoostGPT for test flight-reservation-dm using AI Type Claude AI and AI Model claude-3-opus-20240229
ROOST_METHOD_HASH=getLastName_026f18c38b
ROOST_METHOD_SIG_HASH=getLastName_4814a2dee7
Here are the JUnit test scenarios for the getLastName() method:
Scenario 1: Test getLastName() with a non-null lastName value
Details:
  TestName: getLastNameWithNonNullValue()
  Description: This test checks if the getLastName() method returns the correct lastName value when it is not null.
Execution:
  Arrange: Set the lastName field to a non-null value using reflection or a setter method.
  Act: Invoke the getLastName() method.
  Assert: Use assertEquals to verify that the returned value matches the expected non-null lastName value.
Validation:
  The assertion verifies that the getLastName() method correctly returns the lastName value when it is not null.
  This test ensures that the method retrieves and returns the lastName field value as expected.
Scenario 2: Test getLastName() with a null lastName value
Details:
  TestName: getLastNameWithNullValue()
  Description: This test checks if the getLastName() method returns null when the lastName field is null.
Execution:
  Arrange: Ensure that the lastName field is null (default value).
  Act: Invoke the getLastName() method.
  Assert: Use assertNull to verify that the returned value is null.
Validation:
  The assertion verifies that the getLastName() method returns null when the lastName field is null.
  This test ensures that the method handles the case where lastName is not set and returns null accordingly.
Scenario 3: Test getLastName() after setting lastName using reflection
Details:
  TestName: getLastNameAfterSettingWithReflection()
  Description: This test checks if the getLastName() method returns the correct lastName value after setting it using reflection.
Execution:
  Arrange: Use reflection to set the private lastName field to a specific value.
  Act: Invoke the getLastName() method.
  Assert: Use assertEquals to verify that the returned value matches the value set using reflection.
Validation:
  The assertion verifies that the getLastName() method correctly returns the lastName value that was set using reflection.
  This test ensures that the method retrieves the lastName field value even when it is set through reflection, confirming proper encapsulation.
Scenario 4: Test getLastName() with a lastName value containing special characters
Details:
  TestName: getLastNameWithSpecialCharacters()
  Description: This test checks if the getLastName() method handles and returns a lastName value that contains special characters.
Execution:
  Arrange: Set the lastName field to a value containing special characters using reflection or a setter method.
  Act: Invoke the getLastName() method.
  Assert: Use assertEquals to verify that the returned value matches the expected lastName value with special characters.
Validation:
  The assertion verifies that the getLastName() method correctly handles and returns a lastName value containing special characters.
  This test ensures that the method can handle and return lastName values with special characters without any issues.
Note: The provided test scenarios assume the existence of necessary setup and teardown methods, as well as the ability to access and modify private fields using reflection or setter methods for testing purposes.
*/
// ********RoostGPT********
package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.lang.reflect.Field;
import static org.junit.jupiter.api.Assertions.*;
import javax.persistence.Entity;
import org.junit.jupiter.api.*;

@Tag("com.flightreservation.flightreservation.domains")
@Tag("com.flightreservation.flightreservation.domains.getLastName")
class PassengerGetLastNameTest {

	private Passenger passenger;

	@BeforeEach
	void setUp() {
		passenger = new Passenger();
	}

	@Test
	void getLastNameWithNonNullValue() {
		// Arrange
		String expectedLastName = "Doe";
		setFieldValue(passenger, "lastName", expectedLastName);
		// Act
		String actualLastName = passenger.getLastName();
		// Assert
		assertEquals(expectedLastName, actualLastName);
	}

	@Test
	void getLastNameWithNullValue() {
		// Arrange
		// lastName field is already null by default
		// Act
		String actualLastName = passenger.getLastName();
		// Assert
		assertNull(actualLastName);
	}

	@Test
	void getLastNameAfterSettingWithReflection() {
		// Arrange
		String expectedLastName = "Smith";
		setFieldValue(passenger, "lastName", expectedLastName);
		// Act
		String actualLastName = passenger.getLastName();
		// Assert
		assertEquals(expectedLastName, actualLastName);
	}

	@Test
	void getLastNameWithSpecialCharacters() {
		// Arrange
		String expectedLastName = "O'Connor-Smith";
		setFieldValue(passenger, "lastName", expectedLastName);
		// Act
		String actualLastName = passenger.getLastName();
		// Assert
		assertEquals(expectedLastName, actualLastName);
	}

	private void setFieldValue(Object object, String fieldName, Object value) {
		try {
			Field field = object.getClass().getDeclaredField(fieldName);
			field.setAccessible(true);
			field.set(object, value);
		}
		catch (NoSuchFieldException | IllegalAccessException e) {
			fail("Failed to set field value using reflection: " + e.getMessage());
		}
	}

}