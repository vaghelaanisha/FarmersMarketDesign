public class CategoryGroup{
  private String category;
  private Queue<Vendor> vendorQueue;
  private Queue<Stall> availableStalls;
  private Set<Stall> occupiedStalls;
  public CategoryGroup(String category){
    this.category = category;
    vendorQueue = new LinkedList<>();
    availableStalls = new LinkedList<>();
    occupiedStalls = new HashSet<>();
  }

  public void addStall(Stall stall){
    availableStalls.add(stall);
  }
  public void allocateVendor(Vendor vendor){
    if(!availableStalls.isEmpty()){
      Stall stall = availableStalls.remove();
      stall.allocateStall(vendor);
      occupiedStalls.add(stall);
    }
    else{
      vendorQueue.add(vendor);
    }
  }
  public void deallocateVendor(Stall stall){
    stall.emptyStall();
    occupiedStalls.remove(stall);
    availableStalls.add(stall);
    allocateVendorFromQueue();
  }
  private void allocateVendorFromQueue(){
    if(!vendorQueue.isEmpty()){
      Vendor vendor = vendorQueue.remove();
      allocateVendor(vendor);
    }
  }
}
