package OCA.cap01;

public class WaterBootle {
    private String brand;
    private boolean empty;
    public static void main(String[] args) {
        WaterBootle wb = new WaterBootle();
        System.out.print("Empty = " + wb.empty);
        System.out.print(", Brand = " + wb.brand);
    }
}
