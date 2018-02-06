package hospital;

public class Nurse extends Employee implements medicalDuties {

	public static void main(String[] args) {

	}

	@Override
	public void drawBlood(Bleedable patient) {
		patient.removeBlood(1);

	}

	@Override
	public int getSalary() {
		return 50000;
	}

	public void adminsterCare(Patient patient) {
		patient.giveHealth(10);

	}

}
