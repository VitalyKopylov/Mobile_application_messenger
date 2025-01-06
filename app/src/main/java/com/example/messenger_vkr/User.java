package com.example.messenger_vkr;

public class User {

    private String id;
    private String lastname;
    private String name;
    private String surname;
    private String position;
    private boolean online;

    public User(String id, String lastname, String name, String surname, String position, boolean isOnline) {
        this.id = id;
        this.lastname = lastname;
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.online = isOnline;
    }

    public String getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPosition() {
        return position;
    }

    public boolean isOnline() {
        return online;
    }


    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", lastname='" + lastname + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                ", isOnline=" + online +
                '}';
    }


    public User() {
    }
}
