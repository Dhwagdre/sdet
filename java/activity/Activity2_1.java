package JavaActivity1.java.activity;
abstract class Book {
  String title;
  abstract void setTitle(String s);
  String getTitle() {
      return title;
  }
}
class MyBook extends Book {
  public void setTitle(String s) {
      title = s;
  }
}
public class Activity2_1 {
  public static void main(String []args) {
      String title = "Hover Car Racer";
      Book newNovel = new MyBook();
      newNovel.setTitle(title);
      System.out.println("The book title is: " + newNovel.getTitle());
  }
}