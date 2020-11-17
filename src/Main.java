public class Main {
    public static void main(String[] args) {
        Pet monkey = new Pet("Johnny the Monkey", 12, "Kazakhstan", "monkey");
        System.out.println(monkey.getAge() + monkey.getName() + monkey.getType());
        monkey.changeAge(13);
        monkey.changeName("Ooga");
        monkey.changeType("chimp");
        System.out.println(monkey.getAge() + monkey.getName() + monkey.getType());

        Fork favorite = new Fork("kitchen", "gold", 830.2);
        System.out.println(favorite);
        System.out.println(favorite.isHeavy());
        favorite.setLocation("airplane");
        System.out.println(favorite);
    }
}
