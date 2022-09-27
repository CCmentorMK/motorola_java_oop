package model;
// typ wyliczeniowy ->
public enum Gender {
    MAN("meżczyzna"),
    WOMAN("kobieta");

    private String typeName;

    public String getTypeName() {
        return typeName;
    }

    Gender(String typeName) {
        this.typeName = typeName;
    }
}
