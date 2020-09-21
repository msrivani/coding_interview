package main.java.com.interview.behavior;

public class Caterpillar extends Butterfly implements WalkingBehavior
{
  Caterpillar( String name )
  {
    super( name );
  }

  @Override
  public void walk()
  {
    System.out.println( "Catterpillars can crawl" );
  }
}
