class Vendor{
  private int vendorId;
  private String vendorName;
  private Stall myStall;
  Vendor(int vendorId, String vendorName){
    this.vendorId = vendorId;
    this.vendorName = vendorName;
  }
  public assignStall(Stall Stall){
    myStall = stall;
  }
  public unassignStall(){
    myStall = null;
  }
}
