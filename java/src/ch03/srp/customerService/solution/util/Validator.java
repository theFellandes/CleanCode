
package org.javaturk.cc.ch03.srp.customerService.solution.util;

import org.javaturk.cc.ch03.srp.customerService.solution.ex.*;

public interface Validator {

	void validate(String string) throws ValidationException;

}
