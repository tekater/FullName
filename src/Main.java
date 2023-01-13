public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setFirstName("Tim");
        user.setLastName("");
        System.out.println(user.getFullName());
    }
}