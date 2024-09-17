package LA;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class telaUm {
	@FXML
	MenuItem mniFechar;
	@FXML
	Stage palco;

	@FXML
	private void fecharTela(ActionEvent event) {
	palco = (Stage) mniFechar.getParentPopup().getOwnerWindow();
			//Stage palco = (Stage) mi_fechar.getParentPopup().getOwnerWindow(); //Sem declarar no início
		palco.close();
		}

}
