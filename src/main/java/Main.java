import model.Gender;
import model.User;

// main || psvm
public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User("Anna", 50.5, Gender.WOMAN);
        user1.setUserId(1);
        user1.setName("Michał");
        user1.setGender(Gender.MAN);
//        System.out.println(user1.getUserId());
//        System.out.println(user1.getName());
//        System.out.println(user1.getGender().getTypeName());

        User user3 = user2;     // ten sam obiekt -> wskazuje na to samo miejsce w pamięci
        System.out.println(user2.hashCode());
        System.out.println(user3.hashCode());
        user3.setUserId(111);

        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user3.toString());


    }
}
