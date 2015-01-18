package App;

import Control.ButtonNextListener;
import Control.ButtonPrevListener;
import View.Persistence.ImageListLoader;
import View.UI.MainFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {

    private static final String imageFolder = "C:\\Users\\Italo\\Pictures";
    public static void main(String[] args) {
        ImageListLoader imageListLoader = new ImageListLoader(imageFolder);
        MainFrame frame = new MainFrame(imageListLoader.load());
        
        frame.registerPrevListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        new ButtonPrevListener().buttonPressed(frame.getNorthPanel());
                    }
        });
        frame.registerNextListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        new ButtonNextListener().buttonPressed(frame.getNorthPanel());
                    }
        });
        
    }
    
}
