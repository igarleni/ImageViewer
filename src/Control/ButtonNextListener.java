package Control;

import View.UI.NorthPanel;

public class ButtonNextListener implements Button{

    @Override
    public void buttonPressed(NorthPanel northPanel) {
        northPanel.setImage(northPanel.getImage().getNext());
    }


}
