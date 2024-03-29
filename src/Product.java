/**
 * A scaled down version of a Product class.
 *
 * @author Mairead Meagher, Siobhan Drohan
 */
// conor
    //  testing up;oad after rebase

public class Product {

    private String productName = "";    // max length = 20 characters, default value is "".
    // When constructor is called, if the name is >20 chars, you should
    // only store the first 20 characters (Hint: use substr())

    private int productCode = 5000;  // valid values 1000 - 5000 inclusive - default value is 5000

    private double unitCost = 0;  //valid values are any positive number - default to 1

    private boolean inCurrentProductLine;   // no validation required. Default

    /**
     * Constructor for objects of class Product
     *
     * @param productName Name of the product
     * @param productCode Code of the product
     * @param unitCost    Unit cost of the product - valid values are any positive number
     */
    public Product(String productName, int productCode, double unitCost, boolean inCurrentProductLine) {
        this.productName = productName;
        this.unitCost = unitCost;
        setProductCode(productCode);
    }

    //-------
    //getters
    //-------

    /**
     * Returns the Product Name
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Returns the Unit Cost
     */
    public double getUnitCost() {
        return unitCost;
    }

    /**
     * Returns the Product Code
     */
    public int getProductCode() {
        return productCode;
    }

    /**
     * Returns a boolean indicating if the product is in the current product line
     */
    public boolean isInCurrentProductLine() {
        return inCurrentProductLine;
    }

    //-------
    //setters
    //-------

    /**
     * Updates the Product Code to the value passed as a parameter
     *
     * @param productCode The new Product Code
     */
    public void setProductCode(int productCode) {
        if ((productCode >= 1000) && (productCode <= 5000)) {
            this.productCode = productCode;
        }
        public void setProductName(String productName) {
            if (productName != null) {
                if (productName.length() <= 20) {
                    this.productName = productName;
                }
            }
        }
        public void setUnitCost(double unitCost) {
            if ((unitCost > 0) && (unitCost <= 99999)) {
                this.unitCost = unitCost;
            }
            public void setInCurrentProductLine(boolean inCurrentProductLine)
            this.inCurrentProductLine = inCurrentProductLine;

            public String toString() {
                return "Product description: " + productName
                        + ", product code: " + productCode
                        + ", unit cost: " + unitCost
                        + ", currently in product line: " + (inCurrentProductLine 'Y':'N');

            }

        }
    }
}
