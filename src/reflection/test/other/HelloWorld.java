/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reflection.test.other;

/**
 *
 * @author User
 */
public class HelloWorld {
    
    @MyAnno
    public void printName() {
        System.out.println(this.getClass().getName());
    }
    
    public void sayHello(Object o) {
        System.out.println(o);
    }
    
}
