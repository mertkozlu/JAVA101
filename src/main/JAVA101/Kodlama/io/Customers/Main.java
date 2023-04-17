package Kodlama.io.Customers;

public class Main {
    public static void main(String[] args) {
        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05222222222");
        individualCustomer.setCustomerNumber("123456");
        individualCustomer.setFirstName("Mert");
        individualCustomer.setLastName("Kozlu");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setPhone("0533333333");
        corporateCustomer.setCustomerNumber("654789");
        corporateCustomer.setTaxNumber("11111111");
        corporateCustomer.setCompanyName("753159");

        Customer[] customers = {individualCustomer, corporateCustomer};


    }
}
