public class User{
  private String name;
  private String city;
  private long mnumber;
  public void setName(String name){
    this.name=name;
  }
  public String getName(){
    return name;
  }
  public void setCity(String city){
    this.city=city;
  }
  public String getCity(){
    return city;
  }
  public void setMNumber(long mnumber){
    this.mnumber=mnumber;
  }
  public long getMNumber(){
    return mnumber;
  }
  User(String name, String city, long mnumber){
    setName(name);
    setCity(city);
    setMNumber(mnumber);
  }
  public String toString(){
    System.out.println("Hello, "+getName()+" from "+getCity()+". We see that your the mobile number is "+getMNumber()+". Please, recharge it!");
    return "";
  }
}
