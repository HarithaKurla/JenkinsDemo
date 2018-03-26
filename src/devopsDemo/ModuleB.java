/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devopsDemo;

/**
 *
 * @author S528744
 */
public class ModuleB {
    
    public ModuleB()
    {
        
    }
    
    public int return_Num2()
    {
        ModuleA mod=new ModuleA();
        
        return mod.return_num()+1;
    }
    
}
