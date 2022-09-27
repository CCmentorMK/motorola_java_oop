import model.Gender;
import model.User;
import service.UserService;

public class MainForService {
    public static void main(String[] args) {
        UserService userService = new UserService(10);
        // metody tablicowe
        userService.addUserToArray(new User("Jan", 80, Gender.MAN));
        userService.addUserToArray(new User("Janusz", 85, Gender.MAN));
        userService.getUsersFromArray();
        userService.updateUserFromArray(0, null);
        userService.getUsersFromArray();
        // metody listowe
        userService.addUserToList(new User("Jan", 80, Gender.MAN));
        userService.addUserToList(new User("Janusz", 85, Gender.MAN));
        userService.updateUserFromList(1, new User());
        userService.getUsersFromList();
    }
}
