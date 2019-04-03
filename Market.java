class Market{
  private int totalStalls;
  private List<CategoryGroup> categoryGroups;
  private List<Stall> stalls;
  public Market(int totalStalls){
    this.totalStalls = totalStalls;
    stalls = new ArrayList<>();
  }
  public void addCategoryGroup(CategoryGroup categoryGroup){
    categoryGroups.add(categoryGroup);
  }
  public openMarket(){
    for(int i = 1; i <= totalStalls; i++){
      Stall stall = new Stall(i);
      stalls.add(stall);
    }
    CategoryGroup fruit = new CategoryGroup("Fruit");
    CategoryGroup vegetable = new CategoryGroup("Vegetable");
    CategoryGroup meat = new CategoryGroup("Meat");
    CategoryGroup miscellaneous = new CategoryGroup("Miscellaneous");
    for(int i = 1; i <= 25; i++){
      fruit.addStall(stalls.get(i));
      vegetable.addStall(stalls.get(i+25));
      meat.addStall(stalls.get(i+50));
      miscellaneous.addStall(stalls.get(i+75));
    }
    categoryGroups.add(fruit);
    categoryGroups.add(vegetable);
    categoryGroups.add(meat);
    categoryGroups.add(miscellaneous);
  }
  public void registerVendor(String vendorName, String category) {
    Vendor vendor = new Vendor(vendorName);
    switch (category) {
      case "Fruit"      :  fruit.allocateVendor(vendor); break;
      case "Vegetable"  :  vegetable.allocateVendor(vendor); break;
      case "Meat"       :  meat.allocateVendor(vendor); break;
      default           :  miscellaneous.allocateVendor(vendor); break;
    }
  }

  public static void main(String[] args){
    Market market = new Market(100);
    market.openMarket();
  }
}
