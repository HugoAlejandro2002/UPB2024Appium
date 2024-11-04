package alarmSuiteTest;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreateAlarm extends AlarmTestBase{
    @Test
    public void createAlarmAt4_16PM() throws InterruptedException {
       // Navegar a la página de alarmas y crear una alarma para las 4:16 PM
        homePage.alarmButton.click();
        alarmPage.addAlarmButton.click();

        // Seleccionar el campo de horas
        alarmPage.hoursField.click();
        Thread.sleep(500);  // Retardo para asegurar la carga de los valores de horas

        // Seleccionar la hora (4)
        alarmPage.selectHour.click();
        Thread.sleep(1000);  // Retardo antes de cambiar a la selección de minutos

        // Seleccionar el campo de minutos
        alarmPage.minutesField.click();
        Thread.sleep(1000);  // Retardo para asegurar la carga de los valores de minutos

        // Seleccionar los minutos (16)
        alarmPage.selectMinutes.click();
        Thread.sleep(500);  // Retardo antes de seleccionar PM

        // Seleccionar PM
        alarmPage.selectPM.click();
        Thread.sleep(500);  // Retardo antes de aceptar la configuración

        // Aceptar la configuración de la alarma
        alarmPage.acceptAlarm.click();

        // Verificación final: Confirmar que la nueva alarma a las 4:16 PM se haya creado
        String expectedAlarmText = "4:16 PM Alarm";
        String actualAlarmText = alarmPage.newAlarmLabel.getText();
        Assertions.assertEquals(expectedAlarmText, actualAlarmText, "La alarma de las 4:16 PM no se creó correctamente.");
    }
}
