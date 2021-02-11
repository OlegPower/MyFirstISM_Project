package ISM.project.helpers;

import ISM.project.pages.PowerGridVoltageMonitoringOpenPage;


public class PowerGridVoltageMonitoringOpenHelper extends PowerGridVoltageMonitoringOpenPage {
    public void openVoltageMonitoringPage() {
        voltageMonitoringButton.click();
        firstCellOfPercentageRow.click();
    }
}
