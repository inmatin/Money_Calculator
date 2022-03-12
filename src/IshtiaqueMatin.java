/*
 *Student Name: Ishtiaque Matin
 *Theory Professor: Leanne Seaward
 *Theory Section Number: CST8116_360
 *Lab Professor: Siju Philip
 *Lab Section Number: CST8116_363
 * Due Date: Oct 8th, 2021
 * Modified: Oct 8th, 2021
 * Description: This class is used to test the money class
 */

public class IshtiaqueMatin {

	// this main method is testing the Money Class
	public static void main(String[] args) {

		int numToonie = 2;
		int numLoonie = 4;
		int numQuarter = 1;
		int numDime = 3;
		int numNickel = 5;

		Money m1 = new Money();

		m1.setNumToonie(numToonie);
		m1.setNumLoonie(numLoonie);
		m1.setNumQuarter(numQuarter);
		m1.setNumDime(numDime);
		m1.setNumNickel(numNickel);

		System.out.print("Change is " + m1.getNumToonie() + " toonies, ");
		System.out.print(m1.getNumLoonie() + " loonies, ");
		System.out.print(m1.getNumQuarter() + " quarter, ");
		System.out.print(m1.getNumDime() + " dimes ");
		System.out.println("and " + m1.getNumNickel() + " nickels");

		System.out.println(m1.getNumToonie());
		System.out.println(m1.getNumLoonie());
		System.out.println(m1.getNumQuarter());
		System.out.println(m1.getNumDime());
		System.out.println(m1.getNumNickel());

		double total = m1.computeMoneyTotal();

		System.out.println("Testing work methood: " + total);
		System.out.println("Testing work methood: " + m1.computeMoneyTotal());
		System.out.println("Program by Ishtiaque Matin");

	}

}
