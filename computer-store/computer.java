class Computer {

  public int mYear;
  public String mBrand;
  public String mModel;
  public int mPrice;
  public int mRam;

  public Computer(int year, String brand, String model, int price, int ram) {
    mYear = year;
    mBrand = brand;
    mModel= model;
    mPrice = price;
    mRam = ram;
  }

  public boolean worthBuying(int maxPrice){
    return (mPrice > maxPrice);

  }
}
