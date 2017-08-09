/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract.example.game;

/**
 *
 * @author Roshan
 */
abstract class Games{
  public abstract void start();
  
  public void stop(){
      System.out.println("Stopping game in abstract class");
  }
}

class GameA extends Games {
@Override
public void start(){
System.out.println("Starting Game A:");
 }
}
class GameB extends Games{
    @Override
    public void start(){
       System.out.println("Starting Game B");
    }
}
public class AbstractExampleGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Games A = new GameA();
        Games B = new GameB();
        
        A.start();
        A.stop();
        
        B.start();
        B.stop();
    }
    
}
