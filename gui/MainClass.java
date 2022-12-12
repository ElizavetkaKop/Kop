
package gui;

public class MainClass 
{
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                MainFrame M=new MainFrame();
                M.setVisible(true);
            }
        });
    }
}