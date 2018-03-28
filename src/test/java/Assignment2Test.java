
import com.standardbank.assignmentc740129.assignment2.ResturantPuzzel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest(classes = { ResturantPuzzel.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class Assignment2Test {
  @Autowired
  ResturantPuzzel puzzel;

  @Test
  public void testCheckN(){
    Assert.assertEquals(puzzel.checkN(1),true);
    Assert.assertEquals(puzzel.checkN(60),true);
    Assert.assertEquals(puzzel.checkN(105),true);

    Assert.assertEquals(puzzel.checkN(106),false);
    Assert.assertEquals(puzzel.checkN(0),false);
  }

  @Test
  public void testTotalAllocation(){
    Assert.assertEquals(puzzel.totalAllocation(5,3,3),true);
    Assert.assertEquals(puzzel.totalAllocation(8,4,4),true);

    Assert.assertEquals(puzzel.totalAllocation(105,106,4),false);
    Assert.assertEquals(puzzel.totalAllocation(105,4,106),false);
    Assert.assertEquals(puzzel.totalAllocation(105,4,90),false);

  }

  @Test
  public void testMaxTip(){
    int[]a = {1,2,3,4,5};
    int[]b = {5,4,3,2,1};
    int n =5 ;

    Assert.assertEquals(puzzel.findMaxTip(a,b,n),21);

  }
}
