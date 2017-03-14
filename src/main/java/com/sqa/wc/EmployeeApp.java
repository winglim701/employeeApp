/**
 *   File Name: BasicApp.java<br>
 *
 *   Chan, William<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 4, 2017
 *
 */

package com.sqa.wc;

import com.sqa.wc.helpers.*;

/**
 * BasicApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Chan, William
 * @version 1.0.0
 * @since 1.0
 *
 */
public class EmployeeApp {

	/**
	 * Create an Simple Employee Entry Application which takes employee details
	 * such as Name, Address, Age, City, PhoneNumber, and Job Title. The number
	 * of employees that will be entered into the array should be determined at
	 * the start of the application. Upon exiting the employee details should be
	 * echoed to the user.
	 */
	public static String appName = "Employee App";

	public static void main(String[] args) {
		// String user = AppBasics.welcomeUserAndName(appName);
		getEmployeeDetail();
		// AppBasics.farewellUser(appName, user);
	}

	/**
	 *
	 */
	private static void getEmployeeDetail() {

		int numofEmployees = AppBasics.requestInt("How many employees information will be entered?");
		String[] names = new String[numofEmployees];
		String[] address = new String[numofEmployees];
		String[] age = new String[numofEmployees];
		String[] city = new String[numofEmployees];
		String[] phoneNum = new String[numofEmployees];
		String[] jobTitle = new String[numofEmployees];
		for (int i = 0; i < names.length; i++) {
			names[i] = AppBasics.requestString("Please enter name for employee " + (i + 1) + " ?");
			address[i] = AppBasics.requestString("Please enter street address for " + names[i] + " ?");
			age[i] = AppBasics.requestString("Please enter age for " + names[i] + " ?");
			city[i] = AppBasics.requestString("Please enter city for " + names[i] + " ?");
			phoneNum[i] = AppBasics.requestString("Please enter phone number for " + names[i] + " ?");
			jobTitle[i] = AppBasics.requestString("Please enter job title for " + names[i] + " ?");
		}
		for (int i = 0; i < numofEmployees; i++) {
			System.out.println("Name: " + names[i]);
			System.out.println("Address: " + address[i]);
			System.out.println("Age: " + age[i]);
			System.out.println("City: " + city[i]);
			System.out.println("Phone Number: " + phoneNum[i]);
			System.out.println("jobTitle: " + jobTitle[i]);
		}
	}
}
