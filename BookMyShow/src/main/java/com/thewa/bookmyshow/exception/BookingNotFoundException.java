package com.thewa.bookmyshow.exception;
public class BookingNotFoundException extends Exception {
	public BookingNotFoundException() {
		super();
	}
	
	public BookingNotFoundException(String msg) {
		super(msg);
	}
}