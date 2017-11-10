/**
 * Lab1 Model class
 * 
 * @author asami tanii
 *
 */

public class Model {
	private String firstName;
	private String lastName;

	private int height;
	private double weight;

	private boolean canTravel;
	private boolean smokes;

	private static String occupation = "modeling";

	// constants must be written after variables
	public static final int INCHES_PER_FOOT = 12;
	public static final int BASE_RATE_DOLLARS_PER_HOUR = 60;
	public static final int TALL_INCHES = 67;
	public static final double THIN_POUNDS = 140.0;
	public static final int TALL_THIN_BONUS_DOLLARS_PER_HOUR = 5;
	public static final int TRAVEL_BONUS_DOLLARS_PER_HOUR = 4;
	public static final int SMOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;

	/**
	 * The first Model Constructor
	 * 
	 */
	public Model() {

	}

	/**
	 * The second Model Constructor
	 * 
	 * @param firstName
	 *            to set
	 * @param lastName
	 *            to set
	 * @param heightInches
	 *            to set
	 * @param weightKg
	 *            to set
	 * @param traveler
	 *            to set
	 * @param smoker
	 *            to set
	 */
	public Model(String firstName, String lastName, int heightInches, double weightKg, boolean traveler,
			boolean smoker) {
		setFirstName(firstName);
		setLastName(lastName);
		setHeight(heightInches);
		setWeight(weightKg);
		setCanTravel(traveler);
		setSmokes(smoker);
	}

	/**
	 * The third Model Constructor
	 * 
	 * @param firstName
	 *            to set
	 * @param lastName
	 *            to set
	 * @param heightInches
	 *            to set
	 * @param weightKg
	 *            to set
	 */
	public Model(String firstName, String lastName, int heightInches, double weightKg) {
		setFirstName(firstName);
		setLastName(lastName);
		setHeight(heightInches);
		setWeight(weightKg);
		setCanTravel(true);
		setSmokes(false);
	}

	@Override
	public String toString() {
		return "Model [firstName=" + firstName + ", lastName=" + lastName + ", height=" + height + ", weight=" + weight
				+ ", canTravel=" + canTravel + ", smokes=" + smokes + "]";
	}

	/**
	 * Set first name if first name is 3 to 20 characters long
	 * 
	 * @param firstName
	 *            to set
	 */
	public final void setFirstName(String firstName) {
		if ((firstName != null) && (firstName.length() >= 3) && (firstName.length() <= 20)) {
			this.firstName = firstName;
		}
	}

	/**
	 * Set last name if last name is 3 to 20 characters long
	 * 
	 * @param lastName
	 *            to set
	 */
	public final void setLastName(String lastName) {
		if ((lastName != null) && (lastName.length() >= 3) && (lastName.length() <= 20)) {
			this.lastName = lastName;
		}
	}

	/**
	 * Set height if height is 24 to 84 inches
	 * 
	 * @param height
	 *            to set
	 */
	public final void setHeight(int height) {
		if (height >= 24 && height <= 84) {
			this.height = height;
		}
	}

	/**
	 * Set weight if weight is 80 to 280 pounds
	 * 
	 * @param weight
	 *            to set
	 */
	public final void setWeight(double weight) {
		if (weight >= 80 && weight <= 280) {
			this.weight = weight;
		}
	}

	/**
	 * 
	 * @param canTravel
	 *            to set
	 */
	public final void setCanTravel(boolean canTravel) {
		this.canTravel = canTravel;
	}

	/**
	 * 
	 * @param smokes
	 *            to set
	 */
	public final void setSmokes(boolean smokes) {
		this.smokes = smokes;
	}

	/**
	 * 
	 * @return first name to get
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * 
	 * @return last name to get
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * 
	 * @return height to get
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * 
	 * @return weight to get
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * 
	 * @return can Travel to get
	 */
	public boolean getCanTravel() {
		return canTravel;
	}

	/**
	 * 
	 * @return smokes to get
	 */
	public boolean getSmokes() {
		return smokes;
	}

	/**
	 * 
	 * @return occupation to get
	 */
	public static String getOccupation() {
		return occupation;
	}

	/**
	 * Convert inches to feet and inches e.g. "5 feet 6 inches"
	 * 
	 * @return the height as a String
	 */
	public String getHeightInFeetAndInches() {
		int feet = height / 12;
		int inches = height % 12;
		String heightString = "";

		// height is from 24 to 84 inches
		if (inches == 0) {
			heightString = feet + "feet";
		} else if (inches == 1) {
			heightString = feet + " feet " + inches + " inch";
		} else {
			heightString = feet + " feet " + inches + " inches";
		}
		return heightString;
	}

	/**
	 * Convert inches to centimeters
	 * 
	 * @return the height as a long
	 */
	public long getHeightCm() {
		// height is from 24 to 84 inches
		double cm = height * 2.54;

		long heightCm = Math.round(cm);
		return heightCm;
	}

	/**
	 * Convert pounds to kilograms
	 * 
	 * @return the weight as a long
	 */
	public long getWeightKg() {
		// weight is 80 to 280 pounds
		double kg = weight * 0.453592;

		// long round(double d)
		long weightKg = Math.round(kg);
		return weightKg;
	}

	/**
	 * Convert kilograms to pounds
	 * 
	 * @param kilograms
	 *            to set
	 */
	public final void setWeight(long kilograms) {
		double pounds = kilograms / 2.20462;
		// D.R.Y to validate if weight is 80 to 280 pounds
		setWeight(pounds);
	}

	/**
	 * Expect that someone inputs his height in feet and inches and avoid the
	 * problem because our attributes are only in inches
	 * 
	 * @param feet
	 *            to set
	 * @param inches
	 *            to set
	 */
	public final void setHeight(int feet, int inches) {
		int feetAndInches = feet * 12 + inches;
		setHeight(feetAndInches);
	}

	/**
	 * Used to format the result
	 */
	public void printDetails() {
		System.out.println("Name: " + getFirstName() + " " + getLastName());
		System.out.println("Height: " + getHeight() + " inches");
		System.out.println("Weight: " + Math.round(getWeight()) + " pounds");

		if (canTravel == true) {
			System.out.println("Does travel ");
		} else {
			System.out.println("Does not travel ");
		}

		if (smokes == true) {
			System.out.println("Does smoke ");
		} else {
			System.out.println("Does not smoke ");
		}
	}

	/**
	 * Calculates a model's per-hour pay rate and returns the amount
	 * 
	 * @return amount of money per hour
	 */
	public int calculatePayDollarsPerHour() {
		int amount = BASE_RATE_DOLLARS_PER_HOUR;
		if ((height >= TALL_INCHES) || (height < THIN_POUNDS)) {
			amount += TALL_THIN_BONUS_DOLLARS_PER_HOUR;
		}
		if (canTravel == true) {
			amount += TRAVEL_BONUS_DOLLARS_PER_HOUR;
		}
		if (smokes == true) {
			amount -= SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
		}
		return amount;
	}

	/**
	 * Displays all the model's information on the screen must invoke methods
	 * getHeightInFeetAndInches() and calculatePayDollarsPerHour()
	 */
	public void displayModelDetails() {
		System.out.println("Name: " + getFirstName() + " " + getLastName());
		System.out.println("Height: " + getHeightInFeetAndInches());
		System.out.println("Weight: " + getWeight() + " pounds");

		if (canTravel == true) {
			System.out.println("Travels: yep");
		} else {
			System.out.println("Travels: nope");
		}

		if (smokes == true) {
			System.out.println("Smokes: yep");
		} else {
			System.out.println("Smokes: nope");
		}

		System.out.println("Hourly rate: $" + calculatePayDollarsPerHour());
	}

	/**
	 * Create an overloaded method which takes a boolean to display in metric (kg
	 * and cm) or imperial (lb and inches) units
	 * 
	 * @param metricUnits
	 *            to choose how it is displayed
	 */
	public void displayModelDetails(boolean metricUnits) {
		if (metricUnits == true) {
			System.out.println("Name: " + getFirstName() + " " + getLastName());
			System.out.println("Height: " + Math.round(getHeightCm()) + " cm");
			System.out.println("Weight: " + Math.round(getWeightKg()) + "kg");

			if (canTravel == true) {
				System.out.println("Travels: yep");
			} else {
				System.out.println("Travels: nope");
			}

			if (smokes == true) {
				System.out.println("Smokes: yep");
			} else {
				System.out.println("Smokes: nope");
			}

			System.out.println("Hourly rate: $" + calculatePayDollarsPerHour());
		}
	}
}
