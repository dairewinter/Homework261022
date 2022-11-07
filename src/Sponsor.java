public class Sponsor {
    private final String name;
    private final int support;

    public Sponsor(String name, int support) {
        this.name = name;
        this.support = support;
    }

    public String getName() {
        return name;
    }

    public int getSupport() {
        return support;
    }

    public void sponsorTheRace(){
        System.out.println("Спонсор спонсирует заезд автомобиля");
    }
}
