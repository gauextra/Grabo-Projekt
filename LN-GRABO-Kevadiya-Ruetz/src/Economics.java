
public class Economics {

	private double sum = 0;
	private double totalForDay = 0;

	public void changeSum(double difference) {

		sum = sum + difference;

	}

	public double getChange(double given) {

		return given - sum;

	}

	public void resetSum() {

		sum = 0;
	}

	public double getSum() {
		return sum;

	}

	public double getTotalDay() {

		return totalForDay += sum;
	}

	public void resetTotal() {
		totalForDay = 0;
	}
}
