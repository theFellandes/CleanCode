package org.javaturk.cc.ch03.lsp.designByContract.taxi;

public class Service {
	protected String description = "Destination arrived!";

	@Override
	public String toString() {
		return "Service [description=" + description + "]";
	}
}
