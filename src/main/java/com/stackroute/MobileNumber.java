package com.stackroute;



/**
 MobileNumber Class consist of parameter number
 */
public class MobileNumber {
    Long number;

    @Override
    public String toString() {
        return "MobileNumber{" +
                "number=" + number +
                '}';
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    MobileNumber(Long number){
        this.number=number;
    }
}
