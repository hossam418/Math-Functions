/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareass2;

/**
 *
 * @author User
 */
public class Fibonacci implements ISubscriber{

    @Override
    public void notifySubscriber(String input)
    {
      long  n = Integer.parseInt(input);
      long  t1 = 0, t2 = 1;
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + "  ");

            long sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
    
}
