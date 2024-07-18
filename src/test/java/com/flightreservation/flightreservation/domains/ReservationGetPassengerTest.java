// ********RoostGPT********
/*
Test generated by RoostGPT for test flight-reservation-dm using AI Type Claude AI and AI Model claude-3-opus-20240229
ROOST_METHOD_HASH=getPassenger_2bb10165ca
ROOST_METHOD_SIG_HASH=getPassenger_5ed94c14a3
Here are the JUnit test scenarios for the getPassenger() method based on the provided information:
Scenario 1: Retrieve Passenger from Booking
Details:
  TestName: getPassengerReturnsPassengerFromBooking()
  Description: This test verifies that the getPassenger() method correctly retrieves the Passenger object associated with the Booking.
Execution:
  Arrange: Create a Booking instance with a valid Passenger object.
  Act: Invoke the getPassenger() method on the Booking instance.
  Assert: Use assertEquals to compare the returned Passenger object with the expected Passenger object.
Validation:
  The assertion verifies that the getPassenger() method returns the same Passenger object that was set in the Booking. This ensures that the Booking correctly maintains the association with the Passenger and can retrieve it when needed.
Scenario 2: Retrieve Null Passenger from Booking
Details:
  TestName: getPassengerReturnsNullWhenPassengerNotSet()
  Description: This test checks that the getPassenger() method returns null when no Passenger is associated with the Booking.
Execution:
  Arrange: Create a Booking instance without setting a Passenger object.
  Act: Invoke the getPassenger() method on the Booking instance.
  Assert: Use assertNull to verify that the returned Passenger object is null.
Validation:
  The assertion confirms that the getPassenger() method returns null when no Passenger is set in the Booking. This test ensures that the method handles the case when the Passenger association is not present and returns null instead of throwing an exception.
Scenario 3: Retrieve Passenger with Checked-In Status
Details:
  TestName: getPassengerReturnsPassengerWithCheckedInStatus()
  Description: This test verifies that the getPassenger() method returns a Passenger with the correct checked-in status.
Execution:
  Arrange: Create a Booking instance with a Passenger object and set the checkedIn field to true.
  Act: Invoke the getPassenger() method on the Booking instance.
  Assert: Use assertTrue to verify that the checkedIn field of the returned Passenger object is true.
Validation:
  The assertion ensures that the getPassenger() method returns a Passenger with the correct checked-in status. This test validates that the Booking maintains the consistency between the Passenger's checked-in status and the Booking's state.
Scenario 4: Retrieve Passenger with Number of Bags
Details:
  TestName: getPassengerReturnsPassengerWithNumberOfBags()
  Description: This test checks that the getPassenger() method returns a Passenger with the correct number of bags.
Execution:
  Arrange: Create a Booking instance with a Passenger object and set the numberOfBags field to a specific value.
  Act: Invoke the getPassenger() method on the Booking instance.
  Assert: Use assertEquals to compare the numberOfBags field of the returned Passenger object with the expected value.
Validation:
  The assertion verifies that the getPassenger() method returns a Passenger with the correct number of bags. This test ensures that the Booking maintains the consistency between the Passenger's number of bags and the Booking's state.
These test scenarios cover different aspects of the getPassenger() method, including retrieving a valid Passenger, handling null Passenger, and verifying the consistency of Passenger attributes such as checked-in status and number of bags. The scenarios ensure that the method behaves correctly under different conditions and maintains the integrity of the Booking-Passenger association.
*/
// ********RoostGPT********
package com.flightreservation.flightreservation.domains;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import org.junit.jupiter.api.*;

@Tag("com.flightreservation.flightreservation.domains")
@Tag("com.flightreservation.flightreservation.domains.getPassenger")
class ReservationGetPassengerTest {

	@Test
	void getPassengerReturnsPassengerFromBooking() {
		// Arrange
		Reservation reservation = new Reservation();
		Passenger expectedPassenger = new Passenger();
		expectedPassenger.setFirstName("John");
		expectedPassenger.setLastName("Doe");
		reservation.setPassenger(expectedPassenger);
		// Act
		Passenger actualPassenger = reservation.getPassenger();
		// Assert
		assertEquals(expectedPassenger, actualPassenger);
	}

	@Test
	void getPassengerReturnsNullWhenPassengerNotSet() {
		// Arrange
		Reservation reservation = new Reservation();
		// Act
		Passenger actualPassenger = reservation.getPassenger();
		// Assert
		assertNull(actualPassenger);
	}

	@Test
	void getPassengerReturnsPassengerWithCheckedInStatus() {
		// Arrange
		Reservation reservation = new Reservation();
		Passenger passenger = new Passenger();
		passenger.setFirstName("John");
		passenger.setLastName("Doe");
		reservation.setPassenger(passenger);
		reservation.setCheckedIn(true);
		// Act
		Passenger actualPassenger = reservation.getPassenger();
		// Assert
		assertTrue(actualPassenger.isCheckedIn());
	}

	@Test
	void getPassengerReturnsPassengerWithNumberOfBags() {
		// Arrange
		Reservation reservation = new Reservation();
		Passenger passenger = new Passenger();
		passenger.setFirstName("John");
		passenger.setLastName("Doe");
		reservation.setPassenger(passenger);
		reservation.setNumberOfBags(2);
		// Act
		Passenger actualPassenger = reservation.getPassenger();
		// Assert
		assertEquals(2, actualPassenger.getNumberOfBags());
	}

}