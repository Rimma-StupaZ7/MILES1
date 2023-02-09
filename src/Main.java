public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int bonus = 20;
        int cost = service.calculate(price);
        System.out.println(cost / bonus);
    }
}