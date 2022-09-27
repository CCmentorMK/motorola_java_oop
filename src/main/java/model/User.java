package model;

import java.time.LocalDateTime;

// klasa modelu - User
// -> prywatne pola
// -> publiczne metody dostępowe - get/set
// -> konstruktor - metoda wywoływana podczas tworzenia obiektu
// -> toString - tekstowa reprezentacja obiektu
public class User{
   // private fields
   private int userId;                          // 0
   private String name;                         // null
   private double weight;                       // 0.0
   private boolean status;                      // false
   private Gender gender;                       // null
   private LocalDateTime registrationDateTime;  // null
    // konstruktor domyślny
    public User() {}
    // konstruktor - przeciążanie
    public User(String name, double weight, Gender gender) {
        this.name = name;
        this.weight = weight;
        this.gender = gender;
        // domyślne wartości
        this.registrationDateTime = LocalDateTime.now();
        this.status = true;
    }
    @Override       // przysłania metodę z nadklasy Object
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", status=" + status +
                ", gender=" + (gender == null ? null : gender.getTypeName()) +
                ", registrationDateTime=" + registrationDateTime +
                '}';
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;                   // this -> ten obiekt
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDateTime getRegistrationDateTime() {
        return registrationDateTime;
    }

    public void setRegistrationDateTime(LocalDateTime registrationDateTime) {
        this.registrationDateTime = registrationDateTime;
    }
}
