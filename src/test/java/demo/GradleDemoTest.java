import org.junit.Test;
import static org.junit.Assert.*;

import GradleDemo.GradleDemo;

public class GradleDemoTest {

  @Test
  public void testTri1() {
    assertEquals(GradleDemo.Tri(1), 1);
  }

  @Test
  public void testTri2() {
    assertEquals(GradleDemo.Tri(2), 3);
  }

  @Test
  public void testTri3() {
    assertEquals(GradleDemo.Tri(3), 6);
  }

  @Test
  public void testLazy1() {
    assertEquals(GradleDemo.Lazy(0), 1);
  }

  @Test
  public void testLazy2() {
    assertEquals(GradleDemo.Lazy(1), 2);
  }

  @Test
  public void testLazy3() {
    assertEquals(GradleDemo.Lazy(2), 4);
  }

  @Test
  public void testLazy4() {
    assertEquals(GradleDemo.Lazy(3), 7);
  }

}
