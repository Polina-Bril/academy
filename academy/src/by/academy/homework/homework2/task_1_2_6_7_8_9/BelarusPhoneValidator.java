package by.academy.homework.homework2.task_1_2_6_7_8_9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {

	private static Pattern p = Pattern.compile("^\\+37529[\\d]{7}$");

	public static boolean validate(String vString) {
		Matcher m = p.matcher(vString);
		return m.find();
	}
}
