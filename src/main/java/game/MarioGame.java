package game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole{
  public void up(){
      System.out.println("Common buddy just jump");
  }
  public void down(){
      System.out.println("Common buddy go down");
  }

  public void left(){
      System.out.println("Common buddy just go left now");
  }

  public void right(){
      System.out.println("Common buddy go right this time");
  }


}
