/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import devopsDemo.ModuleB;
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
public class ModuleBTest {
    
    public ModuleBTest() {
    }
    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
    
    @Test
  public void test(){
      ModuleB m1=new ModuleB();
      assertEquals("This is a first test case in moduleB",2,m1.return_Num2());
  }
   @Test
  public void test2() {
      ModuleB m1=new ModuleB();
      assertEquals("This is a second test case in moduleB",3,m1.return_Num2()+1);
  }


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
