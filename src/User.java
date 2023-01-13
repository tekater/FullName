
public class User {
    String firstName;
    String lastName;
    String fullName;
    public User() {
        this.firstName= "";
        this.lastName= "";
    }

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;
        } else {
            this.firstName = null;
        }
    }

    public void setLastName(String lastName) {
        if (lastName != null) {
            this.lastName = lastName;
        } else {
            this.lastName = null;
        }
    }
    public String getFullName() {
        String sentence = "";

        if (this.firstName != "" && this.lastName != "") {
            sentence = this.firstName + " " + this.lastName;
        } else if (this.firstName != "" && this.lastName == "") {
            sentence = this.firstName;
        }else if (this.firstName == "" && this.lastName != "") {
            sentence = this.lastName;
        }else if (this.firstName == "" && this.lastName == "") {
            sentence = "unexpected";
        }
        return sentence;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
        @Override
        public String toString () {
            return "User{" +
                    "firstName=" + firstName +
                    ", lastName=" + lastName +
                    ", fullName=" + fullName +
                    '}';
        }
    }


