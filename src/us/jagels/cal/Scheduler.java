package us.jagels.cal;

import java.util.ArrayList;

public class Scheduler {

	private ArrayList<Appointment> appointments;

	public Scheduler() {
		setAppointments(new ArrayList<Appointment>());
	}

	public Appointment scheduleAppointment(Room room, TimeSlot t) {
		Appointment a = new Appointment(room,t);
		appointments.add(a);
		return a;
	}

	/**
	 * @return the appointments
	 */
	public ArrayList<Appointment> getAppointments() {
		return appointments;
	}

	/**
	 * @param appointments
	 *            the appointments to set
	 */
	public void setAppointments(ArrayList<Appointment> appointments) {
		this.appointments = appointments;
	}

}
