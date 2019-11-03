package entity;
public class Cloth extends Product {
    public static void main(String[] args) {
        Cloth cloth = new Cloth(956775L,"dress",34.99f,99.00f,
                "yellow",567,"L","satin");
        System.out.println(cloth.getMaterial());
    }
    private String size;
    private String material;
    public Cloth(Long id, String productName, Float price, Float weight, String color, Integer productCount, String size, String material) {
        super(id, productName, price, weight, color, productCount);
        this.size = size;
        this.material = material;
    }
    public String getSize() {
        return size;
    }
    public String getMaterial() {
        return material;
    }
    @Override
    public String toString() {
        return super.toString() + "Cloth{" +
                "size='" + size + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}

