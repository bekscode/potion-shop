# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS
Requirements

C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

file: mainscreen.html

lines: 14-128 added as page styling for main page

line: 130 changed shop name to "Goblin Bex's Magic Cauldron"

line: 135 added header image to the main page

line: 136 changed displayed shop name to "Goblin Bex's Magic Cauldron"

line: 139 changed header to "Individual Potions"

line: 171 changed header to "Adventure Packs"

lines: 209-211 added footer with shop name and year


D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.

file: mainscreen.html

line: 138 added About button to main screen

file: MainScreenController.java

line: 56-58 added controller to enable access to the About page

file: about.html

line: 1-168 added the about page with styling and layout matching


E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database. 

file: BootStrapData.java

line: 32 & 39 added inhousePartRepo

line: 47 added if statement to prevent duplicates of inhouse and outsourced parts

line: 50-145 added inhouse and outsourced parts to database

line: 147 added if statement to prevent duplicates for products

line: 150-163 added and saved products to the database

Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.


F.  Add a “Buy Now” button to your product list.

created new file: BuyProductController.java

line: 1-53 created the Buy Now button for the mainscreen

created new file: buysuccess.html

line: 1-13 added "Your purchase was successful." response for successful purchase with Buy Now button

created new file: buyfailure.html

line: 1-13 added "Purchase failed" response for unsuccessful purchase with Buy Now button

file: mainscreen.html

line: 203 added "Buy Now" button next to the "Add" and "Delete" buttons of the Product section on the mainscreen


G.  Modify the parts to track maximum and minimum inventory

file: Part.java

line: 41-47 added variables for minInv and maxInv

line: 52-53 added default minimum and maximum values 

line: 61-62 set default values for minInv and maxInv

line: 65-72 added getter and setter methods for minInv and maxInv

file: InhousePart.java 

line: 18-19 added minInv and maxInv default values

file: OutsourcedPart.java

line: 18-19 added minInv and maxInv default values

file: mainscreen.html

line: 156-157 added table headers for Minimum Inv and Maximum Inv

line: 166-167 added table rows for the Minimum and Maximum Inventory

file: BootStrapData.java

line: 57-58, 73-74, 89-90, 105-106, 121-122, 137-138, 154-155 added setMinInv(1) and setMaxInv(100) to the variables of each part

file: InhousePartForm.html

line: 26-31 added fields for entering minimum inventory thresholds

file: OutsourcedPartForm.html

line: 28-32 added fields for entering minimum inventory thresholds

file: application.properties

line: 6 renamed database

file: Part.java

line: 125-132 added validateLimits method for minimum and maximum values

file: PartServicelmpl.java

line: 59 added call method for validateLimits

file: InhousePartServicelmpl.java

line: 54 added call method for validateLimits

file: OutsourcedPartServicelmpl.java

line: 52 added call method for validateLimits


H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:

file: ValidMinimum.java and MinimumValidator

line: created the Validator for minimum inventory

file: Part.java

line: 4 & 22 added minimum validator

file: EnufPartsValidator

line: 36-44 added constraints for minimum inventory

file: ValidMaximum.java and ValidMaximum

line: created the Validator for maximum inventory

file: Part.java
line: 5 & 23 added maximum validator

file: InhousePartForm.html
line: 32-37 added error handling

file: OutsourcedPartForm.html
line: 34-39 added error handling

I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

J.  Remove the class files for any unused validators in order to clean your code.

K.  Demonstrate professional communication in the content and presentation of your submission.
