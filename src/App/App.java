package App;

import Control.ButtonNextListener;
import Control.ButtonPrevListener;
import View.UI.MainFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {

    private static final String imageFolder = "C:\\Users\\Italo\\Pictures";
    public static void main(String[] args) {
        
        MainFrame frame = new MainFrame(imageFolder);
        
        frame.registerPrevListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        new ButtonPrevListener().buttonPressed(/**frame.get panel de imagen*/);
                    }
        });
        frame.registerNextListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        new ButtonNextListener().buttonPressed(/**frame.get panel de imagen*/);
                    }
        });
        
    }
    
}
