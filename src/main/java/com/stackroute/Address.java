package com.stackroute;


/**
 Address Class consist of parameter zipcode
 */
public class Address {
    private Integer zipcode;

    public Integer getZipcode() {
        return zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "zipcode=" + zipcode +
                '}';
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    Address(Integer zipcode){
        this.zipcode=zipcode;
    }
}
