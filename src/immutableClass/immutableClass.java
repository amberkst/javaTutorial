package immutableClass;

import java.util.Date;

// 1.make java class final
public final class immutableClass {

	// 2.make instance variable as final

	private final Integer immutableField1;
	private final Integer immutableField2;
	private final java.util.Date mutableField1;

	public Integer getImmutableField1() {
		return immutableField1;
	}

	public Integer getImmutableField2() {
		return immutableField2;
	}

	// 3. No setter method for instance variable (only getter)

	// problem comes when instance variable is mutable class.
	// Late take a Date class as instance variable.
	// Date is a mutable class
	public immutableClass(Integer immutableField1, Integer immutableField2, Date date) {
		this.immutableField1 = immutableField1;
		this.immutableField2 = immutableField2;
		this.mutableField1 = new Date(date.getTime()); // Always create a new instance for mutable objects.

		// this.mutableField1 =date //dont do this
		// as date class is mutable performing above step can make our class change its
		// state through data reference variable
		// here date class has setter to change its state
	}

	public java.util.Date getMutableField1() {
		// return mutableField1; //don't do this
		return new Date(mutableField1.getTime()); // always return new instance for mutable object.
	}

}
