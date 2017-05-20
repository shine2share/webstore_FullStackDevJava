package com.packt.webstore.domain;

import java.io.Serializable;

public class Address implements Serializable{

  private static final long serialVersionUID = -530086768384258062L;

  private String doorNo;
  private String streetName;
  private String areaName;
  private String state;
  private String country;
  private String zipCode;
public Address() {
	super();
}
public Address(String doorNo, String streetName, String areaName, String state, String country, String zipCode) {
	super();
	this.doorNo = doorNo;
	this.streetName = streetName;
	this.areaName = areaName;
	this.state = state;
	this.country = country;
	this.zipCode = zipCode;
}
public String getDoorNo() {
	return doorNo;
}
public void setDoorNo(String doorNo) {
	this.doorNo = doorNo;
}
public String getStreetName() {
	return streetName;
}
public void setStreetName(String streetName) {
	this.streetName = streetName;
}
public String getAreaName() {
	return areaName;
}
public void setAreaName(String areaName) {
	this.areaName = areaName;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getZipCode() {
	return zipCode;
}
public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
  
@Override
public boolean equals(Object obj) {
  if (this == obj)
    return true;
  if (obj == null)
    return false;
  if (getClass() != obj.getClass())
    return false;
  Address other = (Address) obj;
  if (doorNo == null) {
    if (other.doorNo != null)
      return false;
  } else if (!doorNo.equals(other.doorNo))
    return false;
  return true;
}



@Override
public int hashCode() {
  final int prime = 31;
  int result = 1;
  result = prime * result
      + ((doorNo == null) ? 0 : doorNo.hashCode());
  return result;
}
  
  // add getters and setters for all the fields here.
  // Override equals and hashCode based on all the fields.
    // the code for the same is available in the code bundle which can be downloaded from www.packtpub.com/support
}