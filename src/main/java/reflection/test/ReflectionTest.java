/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reflection.test;

import java.lang.reflect.Method;


/**
 *
 * @author User
 */
public class ReflectionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Class clazz =  Class.forName("reflection.test.other.HelloWorld");
            Method method = clazz.getMethod("printName", null);
            
            
            method.invoke(clazz.newInstance(), null);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
                
        
    }
}
