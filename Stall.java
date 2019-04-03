class Stall{
  private int stallId;
  private Vendor vendor;
  public Stall(int stallId){
    this.stallId = new stallId;
  }
  public void allocateStall(Vendor vendor){
    this.vendor = vendor;
    this.vendor.assignStall(this);
  }
  public void emptyStall(){
    this.vendor.unassignStall();
    this.vendor = null;
  }
}
