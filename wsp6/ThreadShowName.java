/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsp6;

/**
 *
 * @author azatates7
 */
public class ThreadShowName extends Thread{
    public static void main(String[] args){
        ThreadShowName thread1,thread2;
        thread1 =new ThreadShowName();
        thread2 =new ThreadShowName();
        thread1.start();
        thread2.start();
                        }
    @Override
    public void run(){
        int pause;
        for (int i=0; i<10; i++){
            try{
                System.out.println(i+" "+getName() +" çalişir halde");
                pause = (int)(Math.random() * 3000);
                sleep(pause);
            }
            catch (InterruptedException interruptEx){
                System.out.println(interruptEx.toString());
            }
        }
    }
}
