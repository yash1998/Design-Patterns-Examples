package creational.prototype;

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Game game1 = new Game();
        game1.setId(1);
        game1.setName("Fifa 21");
        game1.setMembership(new Membership());
        Game game2 = game1.clone();
        game2.setId(2);
        game2.setName("Pes 21");

        System.out.println(game1);
        System.out.println(game2);
    }
}
