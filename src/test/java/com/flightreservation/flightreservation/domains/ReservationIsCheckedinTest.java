
// ********RoostGPT********
/*
Test generated by RoostGPT for test flight-reservation-dm using AI Type  and AI Model

ROOST_METHOD_HASH=isCheckedin_4f2e2f10f8
ROOST_METHOD_SIG_HASH=isCheckedin_519916c3a0

Here are the JUnit test scenarios for the `isCheckedin()` method of the `Reservation` entity:

Scenario 1: Verify checked-in status when reservation is checked in

Details:
  TestName: checkedInReservationReturnsTrue
  Description: This test verifies that the `isCheckedin()` method returns `true` when the reservation is checked in.
Execution:
  Arrange: Create a `Reservation` instance and set its `checkedIn` field to `true` using the `setCheckedin()` method.
  Act: Invoke the `isCheckedin()` method on the reservation instance.
  Assert: Use `assertTrue()` to verify that the returned value is `true`.
Validation:
  The assertion ensures that the `isCheckedin()` method correctly returns the checked-in status of the reservation.
  This test is important to validate that the method accurately reflects the reservation's checked-in state.

Scenario 2: Verify checked-in status when reservation is not checked in

Details:
  TestName: notCheckedInReservationReturnsFalse
  Description: This test verifies that the `isCheckedin()` method returns `false` when the reservation is not checked in.
Execution:
  Arrange: Create a `Reservation` instance and set its `checkedIn` field to `false` using the `setCheckedin()` method.
  Act: Invoke the `isCheckedin()` method on the reservation instance.
  Assert: Use `assertFalse()` to verify that the returned value is `false`.
Validation:
  The assertion ensures that the `isCheckedin()` method correctly returns the checked-in status of the reservation.
  This test is important to validate that the method accurately reflects the reservation's not checked-in state.

Scenario 3: Verify checked-in status when reservation is newly created

Details:
  TestName: newReservationIsNotCheckedIn
  Description: This test verifies that a newly created reservation is not checked in by default.
Execution:
  Arrange: Create a new `Reservation` instance without setting the `checkedIn` field explicitly.
  Act: Invoke the `isCheckedin()` method on the reservation instance.
  Assert: Use `assertFalse()` to verify that the returned value is `false`.
Validation:
  The assertion ensures that a newly created reservation has its `checkedIn` field set to `false` by default.
  This test is important to validate the initial state of a reservation object and ensure that it is not checked in unless explicitly set.

Note: The provided test scenarios assume that the `Reservation` entity has a `setCheckedin()` method to set the `checkedIn` field. If this method is not present, the scenarios would need to be adjusted accordingly.
*/

// ********RoostGPT********

package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

class ReservationIsCheckedinTest {

	@Test
	@Tag("valid")
	void checkedInReservationReturnsTrue() {
		// Arrange
		Reservation reservation = new Reservation();
		reservation.setCheckedin(true);
		// Act
		boolean isCheckedIn = reservation.isCheckedin();
		// Assert
		assertTrue(isCheckedIn, "Reservation should be checked in");
	}

	@Test
	@Tag("valid")
	void notCheckedInReservationReturnsFalse() {
		// Arrange
		Reservation reservation = new Reservation();
		reservation.setCheckedin(false);
		// Act
		boolean isCheckedIn = reservation.isCheckedin();
		// Assert
		assertFalse(isCheckedIn, "Reservation should not be checked in");
	}

	@Test
	@Tag("boundary")
	void newReservationIsNotCheckedIn() {
		// Arrange
		Reservation reservation = new Reservation();
		// Act
		boolean isCheckedIn = reservation.isCheckedin();
		// Assert
		assertFalse(isCheckedIn, "New reservation should not be checked in by default");
	}

}