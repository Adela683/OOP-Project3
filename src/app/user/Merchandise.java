package app.user;

import app.Admin;

/**
 * The type Merchandise.
 */
public class Merchandise {
    private String name;
    private String description;
    private int price;

    /**
     * Instantiates a new Merchandise.
     *
     * @param name        the name
     * @param description the description
     * @param price       the price
     */
    public Merchandise(final String name, final String description, final int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(final int price) {
        this.price = price;
    }

//    public String buyMerch (String name ) {
//       if(Admin.getInstance().getUser(name) != null){
//           return "The username " + name + " doesn't exist.";
//       }
//
//       //verify if we can buy merch from this page
//        if(!(Admin.getInstance().getUser(name).getCurrentPage().getPerson().userType().equals("artist"))){
//            return " Cannot buy merch from this page,";
//        }
//
//        //verify if the merch exists
////        if(Admin.getInstance().getUser(name).getCurrentPage().getPerson().getMerchandise(name) == null){
////            return "Merchandise doesn't exist.";
////        }
//    }
}
