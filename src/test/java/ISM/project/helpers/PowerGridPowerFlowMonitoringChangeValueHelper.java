package ISM.project.helpers;

import ISM.project.pages.PowerGridPowerFlowMonitoringChangeValuePage;

public class PowerGridPowerFlowMonitoringChangeValueHelper extends PowerGridPowerFlowMonitoringChangeValuePage {

public void powerFlowMonitoringOpen(){
      powerFlowMonitoringButton.click();
      reversalOfPowerFlowRow.click();
   }
   public void reversalOfPowerFlowChangeValue() {
      reversalOfPowerFlowDropdown.click();
   }
}
