import com.standardbank.assignmentc740129.assignment1.DivideAndRule;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class Assignment1Test {
  private DivideAndRule rule = new DivideAndRule();

  @Test
  public void testCheckTestCase(){


    Assert.assertEquals(rule.checkTestCases(1),true);
    Assert.assertEquals(rule.checkTestCases(50),true);
    Assert.assertEquals(rule.checkTestCases(100),true);
    Assert.assertEquals(rule.checkTestCases(101),false);
    Assert.assertEquals(rule.checkTestCases(0),false);
    Assert.assertEquals(rule.checkTestCases(-1),false);
  }

  @Test
  public void testCheckInput(){
    Assert.assertEquals(rule.checkInput(1),true);
    Assert.assertEquals(rule.checkInput(50),true);
    Assert.assertEquals(rule.checkInput(999),true);

    Assert.assertEquals(rule.checkInput(1000),false);
  }

  @Test
  public void testDivideby8(){
    Assert.assertEquals(rule.divideby8(16),1);
    Assert.assertEquals(rule.divideby8(18),-1);
  }
}
