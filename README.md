# ShipmentManagement
# ShipmentManagement
Goal
Design and implement ¡°Shipment Management? program with unit tests.
Problem Statement
Our firm has trading arrangement with a supplier to ship goods to us. As part of trade agreement, the 
supplier agrees to ship X metric tons of goods in N number of shipments. N can be one or more. The 
supplier can alter the shipments allowing her to split or merge shipments.
- Split
Split operation on a shipment, would create more than one shipments with specified quantities. 
Sum of all child shipment quantities should be equal to parent shipment quantity.
- Merge
Merge operation on more than one shipment, would create one child shipment with summed 
up quantity. Sum of all parent shipment quantities should be equal to child shipment quantity.
- Change root quantity
This operation applies to trade. When trade quantity is changed, all shipment quantities should 
be updated proportionally.
A trade would always start with one shipment initially. This shipment quantity would be same as trade 
quantity. The shipments would grow in number based on splits / merges.
Evaluation Points
x Working Solution 
x Requirement Analysis 
x Design 
x Test Coverage 
x Code Quality