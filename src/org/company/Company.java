package org.company;

import org.client.Client; // Import parent class from another package


public class Company extends Client {

    public void companyName() {
        System.out.println("Company Name: XYZ Pvt Ltd");
    }

    public static void main(String[] args) {
        Company company = new Company();

        company.clientName();   
        company.companyName();  
    }
}

