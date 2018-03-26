/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import devopsDemo.ModuleA;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author S528744
 */
public class ModuleATest {
    
    public ModuleATest() {
    }
    
  @Test
  public void test()
  {
      ModuleA m1=new ModuleA();
      assertEquals("This is a first test case in moduleA",1,m1.return_num());
  }
  
   @Test
  public void test2()
  {
      ModuleA m1=new ModuleA();
      assertEquals("This is a Second test case in moduleA",2,m1.return_num()+1);
  }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
