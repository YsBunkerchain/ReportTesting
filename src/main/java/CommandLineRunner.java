import BDN.BDNGenerator;
import MFMSeal.JasperGenerate;
import timesheet.TimeSheetGenerator;

public class CommandLineRunner {

    public static void main(String[] args) throws Exception {

        SafetyCheckList.SafetyCheckListGenerate app2 = new SafetyCheckList.SafetyCheckListGenerate();
        app2.start();
//        JasperGenerate app = new JasperGenerate();
//        app.start();
//
//        TimeSheetGenerator timeSheetGenerator = new TimeSheetGenerator();
//        timeSheetGenerator.start();

//        BDNGenerator bdnGenerator = new BDNGenerator();
//        bdnGenerator.start();

    }
}