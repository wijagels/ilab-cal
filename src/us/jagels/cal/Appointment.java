package us.jagels.cal;

import java.util.GregorianCalendar;

public class Appointment {

	private GregorianCalendar start;
	private GregorianCalendar end;

	public Appointment(int y, int m, int d, int hf, int mf, int ht, int mt) {
		setStart(new GregorianCalendar(y, m, d, hf, mf));
		setEnd(new GregorianCalendar(y, m, d, ht, mt));
	}

	/**
	 * @return the start
	 */
	public GregorianCalendar getStart() {
		return start;
	}

	/**
	 * @param start the start to set
	 */
	public void setStart(GregorianCalendar start) {
		this.start = start;
	}

	/**
	 * @return the end
	 */
	public GregorianCalendar getEnd() {
		return end;
	}

	/**
	 * @param end the end to set
	 */
	public void setEnd(GregorianCalendar end) {
		this.end = end;
	}

}
