package hospital;

public class Doctor extends Employee {

	private Object employeeNumber;
	private Object employeeName;

	public Doctor(String employeeNumber, String employeeName) {
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
	}

	public void drawBlood(Bleedable patient) {
		patient.removeBlood(1);
	}

	@Override
	public int getSalary() {
		return 90000;
	}

	public void adminsterCare(Patient patient) {
		patient.giveHealth(10);
	}
}
