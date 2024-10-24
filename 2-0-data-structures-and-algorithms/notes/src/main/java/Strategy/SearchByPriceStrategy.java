package Strategy;

public class SearchByPriceStrategy implements SearchStrategy{
    @Override
    public void execute() {
        System.out.println("Searched by price");
    }
}
