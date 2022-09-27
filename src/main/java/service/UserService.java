package service;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private User [] userArray;          // {null, null, null, ...}
    private List<User> userList;        // {}

    public UserService(int arraySize) {
        this.userArray = new User[arraySize];   // tablica jest statyczna - przy inicjalizacji musi być zadeklarowany jej rozmiar
        this.userList = new ArrayList<>();      // list jest dynamiczna - dynamicznie zmienia swój rozmiar
    }

    public void addUserToArray(User user){
        // foreach  -> do kolekcji -> gdy wypisujemy elementy z kolekcji
        // for      -> do kolekcji -> gdy chcemy edytowaćlub odwołoywać się do poszczególnych elementów
        // while    -> gdy nieznana jest liczba iteracji
        // do-while -> gdy nieznana jest liczba iteracji, ale przynajmniej raz pętle powinna się wykonać
        for (int i = 0; i <= userArray.length - 1; i++){
            if(userArray[i] == null){
                userArray[i] = user;
                break;
            }
        }
    }
    public void addUserToList(User user){
        userList.add(user);
    }
    public boolean updateUserFromArray(int index, User newUser){
        if(index < userArray.length) {
            userArray[index] = newUser;
            return true;                // break
        }
        return false;
    }
    public boolean updateUserFromList(int index, User newUser){
        if (index < userList.size()) {
            userList.set(index, newUser);
            return true;
        }
        return false;
    }

    public void getUsersFromArray(){
        for (User user : userArray) {
            System.out.println(user);
        }
    }
    public void getUsersFromList(){
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
