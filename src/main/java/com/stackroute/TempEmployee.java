package com.stackroute;


import java.util.List;

/**
 TempEmployee Class consist of parameters: name, age, address of type Address, mobileNumber of type List<MobileNumber>
 */
public class TempEmployee {
    private String name;
    private Integer age;
    private Address address;
    private List<MobileNumber> mobileNumber;

    TempEmployee(String name,Integer age,Address address,List<MobileNumber> mobileNumber){
        this.name=name;
        this.age=age;
        this.address=address;
        this.mobileNumber=mobileNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", mobileNumber=" + mobileNumber +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<MobileNumber> getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(List<MobileNumber> mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

}
