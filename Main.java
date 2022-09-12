import java.io.*;
public class Main{
  public static void main(String[] args) throws Exception {
    System.out.println("This is a Simple Java- Program");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter your Name:");
    String name = br.readLine();
    System.out.println("Enter the City:");
    String city = br.readLine();
    System.out.println("Enter your Mobile Number:");
    long mnumber= Long.parseLong(br.readLine());
    User u = new User(name,city,mnumber);
    u.toString();
  }
}
