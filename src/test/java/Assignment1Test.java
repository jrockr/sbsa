import com.standardbank.assignmentc740129.assignment1.DivideAndRule;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
@SpringBootTest(classes = { DivideAndRule.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class Assignment1Test {

  @Autowired
  private DivideAndRule rule;

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
