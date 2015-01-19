package Control;

import View.UI.NorthPanel;

public class ButtonPrevListener implements Button{

    @Override
    public void buttonPressed(NorthPanel northPanel) {
        northPanel.setImage(northPanel.getImage().getPrev());
    }
 
}
