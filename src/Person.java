import java.util.*;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;

public class Person{
  private String name;
  private Date myDate;
  private String country;


  public Person(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }
  public void setName(String name){
    this.name = name;
  }
  public Date birthDate(int day, int month, int year){
    Calendar cal = Calendar.getInstance();
//    DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    cal.set(Calendar.MONTH, month - 1);
    cal.set(Calendar.DATE, day);
    cal.set(Calendar.YEAR, year);
    this.myDate = cal.getTime();
    // this.myDate = formatter.parse(formatter.format(this.myDate));
    // this.myDate = cal.getTime();
    // System.out.println(myDate);
    return myDate;
  }
  public long age(){
    Date now = new Date();
    long diff = Math.abs(now.getTime() - this.myDate.getTime());
    diff = diff/(24 * 60 * 60 * 1000);
    return diff/365;
  }
  public void setCountry(String country){
    this.country = country;
  }
  public String getCountry(){
    return this.country;
  }
}
