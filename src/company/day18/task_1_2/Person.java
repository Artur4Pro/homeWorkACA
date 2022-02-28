package company.day18.task_1_2;

public class Person {
    private String firstName;
    private String lastName;
    private String passportId;
    private int age;
    private String gender;
    private String nationality;

    public Person() {
    }

    public Person(String firstName, String lastName, String passportId, int age, String gender, String nationality) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPassportId(passportId);
        this.setAge(age);
        this.setGender(gender);
        this.nationality = nationality;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        int length = firstName.length();
        if (length < 3 || length > 15) {
            System.out.println("Invalid name");
        } else {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        int length = lastName.length();
        if (length < 6 || length > 20) {
            System.out.println("Invalid Surname");
        } else {
            this.lastName = lastName;
        }
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        int length = passportId.length();
        boolean isDigit  = true;
        for (int i = 3; i <length-2 ; i++) {
            if (passportId.charAt(i) < '0' || passportId.charAt(i) > '9') {
                isDigit = false;
                break;
            }
        }
        if (passportId.substring(0,2).equals("AN") && length==8 && isDigit) {
            this.passportId = passportId;
        }else{
            System.out.println("Invalid pasport ID");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 99) {
            System.out.println("Invalid age");
        } else {
            this.age = age;
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.compareToIgnoreCase("male") != 0 && gender.compareToIgnoreCase("female") != 0) {
            System.out.println("Invalid gender");
        } else {
            this.gender = gender;
        }
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + firstName + '\'' +
                ", surName='" + lastName + '\'' +
                ", pasportId='" + passportId + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", nation='" + nationality + '\'' +
                '}';
    }


    public void display() {
        System.out.println(this);
    }
}
