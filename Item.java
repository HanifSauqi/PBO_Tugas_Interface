public abstract class Item {
    private String nama;
    private String rank;
    private int price;

    public String getNama() {
        return nama;
    }

    public String getRank() {
        return rank;
    }

    public int getPrice() {
        return price;
    }

    public Item(String nama, String rank, int price) {
        this.nama = nama;
        this.rank = rank;
        this.price = price;
    }
}
