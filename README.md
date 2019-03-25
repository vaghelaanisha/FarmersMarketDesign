# Farmers Market System Design
## Classes

  - Market: the container class for all market objects and setting up market
  - CategoryGroup: represents a sub section of the whole market where each category can only contain similar type of vendors(fruits, vegetables, poultry etc)
  - Stall: represents the physical location inside a market added to a categoryGroup and later assigned to one Vendor
  - Vendor: represents the vendor who wishes to come to the market to sell their goods. Vendors are assigned to the stalls in a categoryGroup if available.

# Functionality

  - Market setups demo marketplace using openMarket() method.
  - When stalls are added to categoryGroup they are moved to the availableStalls queue in it.
  - If a vendor wants to add itself to a categoryGroup, a free stall is assinged to the vendor. If no free stall is available, then it is added to a vendor queue.
  - When vendors are unassigned, the relevant stalls are moved to the available queue.
