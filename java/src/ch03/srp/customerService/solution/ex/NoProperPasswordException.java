package org.javaturk.cc.ch03.srp.customerService.solution.ex;

public class NoProperPasswordException extends ValidationException {
	public NoProperPasswordException(String message){
		super(message);
	}
}
