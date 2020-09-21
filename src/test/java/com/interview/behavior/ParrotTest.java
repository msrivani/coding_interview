package test.java.com.interview.behavior;

import main.java.com.interview.behavior.Parrot;
import main.java.com.interview.behavior.SingCock;
import main.java.com.interview.behavior.SingMeow;
import main.java.com.interview.behavior.SingWoof;
import org.junit.Test;

import junit.framework.Assert;

public class ParrotTest
{
  String displayName = "parrot";
  Parrot parrot = new Parrot( displayName );
  @Test
  public void checkDisplayName(){
    Assert.assertEquals(displayName,parrot.getName());
  }
  @Test
  public void checkWoofSingingBehavior(){
    parrot.setSingBehavior( new SingWoof() );
    parrot.getSingBehavior().getClass().equals( SingWoof.class );
  }

  @Test
  public void checkMeowSingingBehavior(){
    parrot.setSingBehavior( new SingMeow() );
    parrot.getSingBehavior().getClass().equals( SingMeow.class );
  }

  @Test
  public void checkCockSingingBehavior(){
    parrot.setSingBehavior( new SingCock() );
    parrot.getSingBehavior().getClass().equals( SingCock.class );
  }

}
