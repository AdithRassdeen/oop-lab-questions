package com.mycompany.mavenproject1; 

public abstract class StaffMember {
    /* StaffMember is abstract to prevent direct instantiation of objects,
    as it serves only as a common design for specific staff types.*/
    private static int staffCount = 0;  
    /*The staffCount variable is static because it
     belongs to the class itself rather than any specific object,
     allowing it to maintain a shared value that tracks the
     total number of staff members created across the entire system*/
    private String fullName; 
    private final String staffid; 
    protected String department; 
    
    public StaffMember(String fullName, String staffid, String department) {
        this.fullName = fullName;
        this.staffid = staffid;
        this.department = department;
        staffCount++ ;
    }
   
    public String getFullName() {
        return fullName;
    }

    public String getStaffid() {
        return staffid;
    }

    public String getDepartment() {
        return department;
    }
    
    public final void displayBasicDetails() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Staff ID: " + staffid);
        System.out.println("Department: " + department);
    }

    public abstract double calculateMonthlyPayment();
    
    public static void showSystemName() {
        System.out.println("System Name: Campus Staff Payment System");
    }
    
    public static int getStaffCount() {
        return staffCount;
    }
}

