package com.satishs.trial;

class Person
{
  private String firstName;
  private String lastName;
  private String fullName;
  
  public Person(String firstNameVal, String lastNameVal)
  {
    firstName = firstNameVal;
    lastName = lastNameVal;
    fullName = firstName + " " + lastName;
  }
  
  public String getFullName()
  {
    return fullName;
  }
}