package org.example;

public class Perro {

    public Perro() {
    }

    public Perro(Integer id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    private Integer id;
    private String name;
    private String gender;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Perro doggie = new Perro(1315, "Zeus", "Masculino");

        Perro doggie1 = new Perro();
        doggie1.setId(1315);
        doggie1.setName("Zeus");
        doggie1.setGender("Masculino");


        System.out.println("EL perro tiene el ID " + doggie.getId());

    }

}
