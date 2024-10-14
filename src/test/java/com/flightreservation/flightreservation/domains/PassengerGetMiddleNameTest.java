
// ********RoostGPT********
/*
Test generated by RoostGPT for test flight-reservation-dm using AI Type  and AI Model

ROOST_METHOD_HASH=getMiddleName_b9783483c1
ROOST_METHOD_SIG_HASH=getMiddleName_e4a286331a

Here are the JUnit test scenarios for the getMiddleName() method of the Passenger entity:

Scenario 1: Get Middle Name - Valid Case

Details:
  TestName: getMiddleNameReturnsCorrectValue()
  Description: This test verifies that the getMiddleName() method returns the correct middle name when a valid middle name is set.
Execution:
  Arrange: Create a Passenger instance and set a valid middle name using the setMiddleName() method.
  Act: Call the getMiddleName() method on the Passenger instance.
  Assert: Use assertEquals to compare the returned middle name with the expected middle name.
Validation:
  The assertion ensures that the getMiddleName() method correctly retrieves the middle name that was set using the setMiddleName() method.
  This test is important to validate that the getter method functions as expected and returns the correct value.

Scenario 2: Get Middle Name - Null Case

Details:
  TestName: getMiddleNameReturnsNullWhenNotSet()
  Description: This test verifies that the getMiddleName() method returns null when the middle name is not set.
Execution:
  Arrange: Create a Passenger instance without setting the middle name.
  Act: Call the getMiddleName() method on the Passenger instance.
  Assert: Use assertNull to check if the returned middle name is null.
Validation:
  The assertion ensures that the getMiddleName() method returns null when the middle name is not set, indicating that the method handles the absence of a middle name correctly.
  This test is important to validate that the getter method does not throw an exception or return an unexpected value when the middle name is not provided.

Scenario 3: Get Middle Name - Empty String Case

Details:
  TestName: getMiddleNameReturnsEmptyStringWhenSetAsEmpty()
  Description: This test verifies that the getMiddleName() method returns an empty string when the middle name is set as an empty string.
Execution:
  Arrange: Create a Passenger instance and set the middle name as an empty string using the setMiddleName() method.
  Act: Call the getMiddleName() method on the Passenger instance.
  Assert: Use assertEquals to compare the returned middle name with an empty string.
Validation:
  The assertion ensures that the getMiddleName() method correctly returns an empty string when the middle name is set as an empty string.
  This test is important to validate that the getter method handles empty strings appropriately and does not modify or trim the value.

Note: The provided code snippet does not include any validation or constraints on the middle name field, so additional test scenarios related to input validation or error handling may not be applicable based on the given information.
*/

// ********RoostGPT********

package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.*;
import javax.persistence.Entity;

class PassengerGetMiddleNameTest {

	@Test
	@Tag("valid")
	void getMiddleNameReturnsCorrectValue() {
		// Arrange
		Passenger passenger = new Passenger();
		String expectedMiddleName = "John";
		passenger.setMiddleName(expectedMiddleName);
		// Act
		String actualMiddleName = passenger.getMiddleName();
		// Assert
		assertEquals(expectedMiddleName, actualMiddleName);
	}

	@Test
	@Tag("boundary")
	void getMiddleNameReturnsNullWhenNotSet() {
		// Arrange
		Passenger passenger = new Passenger();
		// Act
		String actualMiddleName = passenger.getMiddleName();
		// Assert
		assertNull(actualMiddleName);
	}

	@Test
	@Tag("boundary")
	void getMiddleNameReturnsEmptyStringWhenSetAsEmpty() {
		// Arrange
		Passenger passenger = new Passenger();
		String expectedMiddleName = "";
		passenger.setMiddleName(expectedMiddleName);
		// Act
		String actualMiddleName = passenger.getMiddleName();
		// Assert
		assertEquals(expectedMiddleName, actualMiddleName);
	}

}