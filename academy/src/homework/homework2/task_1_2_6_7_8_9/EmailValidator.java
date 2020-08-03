package homework.homework2.task_1_2_6_7_8_9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {

	private static Pattern p = Pattern.compile("^[A-Z0-9a-z._%+-]+@[A-Za-z0-9\\.-]+\\.[A-Za-z]{2,64}$");

	public static boolean validate(String vString) {
		Matcher m = p.matcher(vString);
		return m.find();
	}

}