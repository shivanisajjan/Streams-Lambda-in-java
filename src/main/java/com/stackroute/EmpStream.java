package com.stackroute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
  Filter Employee  Details Collections using Java Stream API
 */
public class EmpStream
{
    public static void main( String[] args )
    {
        List<Employee> li=new ArrayList<>();
        Employee e1=new Employee("Shivani",21,new Address(509103),Arrays.asList(new MobileNumber(8552802816L),
                new MobileNumber(9145534362L)));
        Employee e2=new Employee("Jayesh",20,new Address(509104),Arrays.asList(new MobileNumber(8552802816L),
                new MobileNumber(9145533332L)));
        Employee e3=new Employee("Hari Priya",22,new Address(509103),Arrays.asList(new MobileNumber(8552123416L),
                new MobileNumber(9145312332L)));
        Employee e4=new Employee("Jayesh",19,new Address(509106),Arrays.asList(new MobileNumber(8552802818L),
                new MobileNumber(9145534362L)));
        Employee e5=new Employee("Deepak",23,new Address(509107),Arrays.asList(new MobileNumber(8552802816L),
                new MobileNumber(9145534361L)));
        li.add(e1);
        li.add(e2);
        li.add(e3);
        li.add(e4);
        li.add(e5);
        /*****************************************************
         Get employee with exact match name "jayesh" using stream
         *****************************************************/
        System.out.println("Employee with exact match name 'jayesh':");
        System.out.println("------------------------------------------");
        List<Employee> n = li.stream().filter(str->str.getName().equals("Jayesh")).collect(Collectors.toList());
        for (Employee emp:n){
            System.out.println(emp.toString());
        }
        System.out.println("____________________________________________________________________________" +
                "_____________________________________________________________________");

        /*****************************************************
         Get employee with matching address "1235" using stream
         *****************************************************/
        System.out.println("Employee with matching address '509103':");
        System.out.println("------------------------------------------");
        List<Employee> n1 = li.stream().filter(str->str.getAddress().getZipcode()==509103).collect(Collectors.toList());
        for (Employee emp:n1){
            System.out.println(emp.toString());
        }
        System.out.println("____________________________________________________________________________" +
                "_____________________________________________________________________");



        /*****************************************************
         Get all employee having mobile numbers 3333 using stream.
         *****************************************************/

        System.out.println("All employee having mobile numbers 8552802816:");
        System.out.println("-----------------------------------------------");
        List<Employee> n2 = li.stream().filter(str->getemployeeph(str)==true).collect(Collectors.toList());
        for (Employee emp:n2){
            System.out.println(emp.toString());
        }
        System.out.println("____________________________________________________________________________" +
                "_____________________________________________________________________");

        /*****************************************************
         Get all employee having mobile number 1233 and 1234 using stream
         *****************************************************/
        System.out.println("All employee having mobile numbers 8552802816 and 9145534362:");
        System.out.println("---------------------------------------------------------------");
        List<Employee> n3 = li.stream().filter(str->getemployeeph(str)==true).collect(Collectors.toList());
        for (Employee emp:n3){
            System.out.println(emp.toString());
        }
//        System.out.println("____________________________________________________________________________" +
//                "_____________________________________________________________________");




        /*****************************************************
         Create a List<Employee> from the List<TempEmployee> using stream
         *****************************************************/




        /*****************************************************
         Convert List<Employee> to List<String> of employee name using stream
         *****************************************************/




        /*****************************************************
         Convert List<employees> to String using stream
         *****************************************************/



        /*****************************************************
         Change the case of List<String> using stream
         *****************************************************/




        /*****************************************************
         Sort List<String> using stream
         *****************************************************/




        /*****************************************************
         Conditionally apply Filter condition, say if flag is enabled then using stream
         *****************************************************/




    }

    private static boolean getemployeeph(Employee str) {
//        Employee dummy=new Employee("false",0,new Address(0),Arrays.asList(new MobileNumber(8552802816L)));
        List<MobileNumber> al=str.getMobileNumber();
        for(int i=0;i<al.size();i++){
            if(al.get(i).getNumber()==8552802816L){
                for(int j=i+1;j<al.size();j++){
                    if(al.get(j).getNumber()==9145534362L){
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
