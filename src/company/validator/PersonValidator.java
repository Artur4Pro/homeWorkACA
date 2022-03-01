package company.validator;

public class PersonValidator {
    private PersonValidator() {
    }

    public static boolean isValidAge(int age) {
        return (age >= 18 && age <= 99);
    }

    public static boolean isValidFirstName(String firstName) {
        if (firstName == null || firstName.length() == 0) {
            return false;
        }
        int length = firstName.length();
        return (length >= 3 && length <= 15);
    }

    public static boolean isValidLastName(String lastName) {
        int length = lastName.length();
        return (length >= 6 && length <= 20);
    }

    public static boolean isValidPassportId(String passportId) {
        int length = passportId.length();
        for (int i = 3; i < length - 2; i++) {
            if (passportId.charAt(i) < '0' || passportId.charAt(i) > '9') {
                return false;
            }
        }
        return (passportId.substring(0, 2).equals("AN") && length == 8);

    }

    public static boolean isValidGender(String gender) {
        return (gender.compareToIgnoreCase("male") == 0 || gender.compareToIgnoreCase("female") == 0);
    }

    public static boolean isValidNationality(String nation) {
        return (nation.length()>=2);
    }

}


