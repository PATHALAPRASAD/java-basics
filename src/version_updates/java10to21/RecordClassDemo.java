package version_updates.java10to21;

//class Alien {
//    private int id;
//    private String name;
//
//    public Alien(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public String toString() {
//        return "Alien{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Alien alien = (Alien) o;
//        return id == alien.id && Objects.equals(name, alien.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
//}

record Alien(int id, String name) {
}

public class RecordClassDemo {
    public static void main(String[] args) {
        Alien alien1 = new Alien(33, "Sarath");
        Alien alien2 = new Alien(33, "Sarath");
        System.out.println(alien1.equals(alien2));
    }
}
