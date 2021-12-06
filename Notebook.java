public class Notebook {
    private  Enum manufacturer;
    private int ram;
    private int price;

    public Notebook(Enum manufacturer, int ram, int price) {
        this.manufacturer = manufacturer;
        this.ram = ram;
        this.price = price;
    }

    public Enum getManufacturer() {
        return manufacturer;
    }


    public int getRam() {
        return ram;
    }



    public int getPrice() {
        return price;
    }



    @Override
    public String toString() {
        return "Notebook{" +
                "Manufacturer '" + manufacturer + '\'' +
                ", RAM " + ram +
                ", Price " + price +
                '}';
    }
}
