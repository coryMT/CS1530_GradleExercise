import org.junit.Test;
import static org.junit.Assert.*;

import GradleDemo;

public class GradleDemoTest {

  @Test
  public void testTri1() {
    assertEquals(GradleDemo.tri(1), 1)
  }

  @Test
  public void testTri2() {
    assertEquals(GradleDemo.tri(2), 3)
  }

  @Test
  public void testTri3() {
    assertEquals(GradleDemo.tri(3), 6)
  }

  @Test
  public void testLazy1() {
    assertEquals(GradleDemo.lazy(0), 1)
  }

  @Test
  public void testLazy2() {
    assertEquals(GradleDemo.lazy(1), 2)
  }

  @Test
  public void testLazy3() {
    assertEquals(GradleDemo.lazy(2), 4)
  }

  @Test
  public void testLazy4() {
    assertEquals(GradleDemo.lazy(3), 7)
  }

}
