/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.TimerTask;

/**
 *
 * @author nvettera
 */
public class Task extends TimerTask{
    private NewJFrame f;
   
    public Task(){}
    
    public Task(NewJFrame frame){
        this.f=frame;
    }
    
    public void run(){
        f.updateErg();
    }
}
