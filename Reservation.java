package com.oupp.restaurant.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reservation {
  private String id;
  private String date;
  private String time;
  private String partySize;
  private String customerName;
  private String phoneNumber;
  private String tableId;
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }
  public String getTime() {
    return time;
  }
  public void setTime(String time) {
    this.time = time;
  }
  public String getPartySize() {
    return partySize;
  }
  public void setPartySize(String partySize) {
    this.partySize = partySize;
  }
  public String getCustomerName() {
    return customerName;
  }
  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  public String getTableId() {
    return tableId;
  }
  public void setTableId(String tableId) {
    this.tableId = tableId;
  }
  
  
  

}