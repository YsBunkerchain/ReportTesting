package MFMSeal;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JasperGenerate
{
    public void start() throws JRException{
//        String xmlFile = "src/main/resources/MfmSystemSealCheckList3.jasper";
        String xmlFile = "src/main/resources/MfmSystemSealCheckList.jrxml";
        JasperReport jreport = JasperCompileManager.compileReport(xmlFile);

        ArrayList<SealItem> sealItems1 = new ArrayList<>();
        ArrayList<SealItem> sealItems2 = new ArrayList<>();
        ArrayList<SealItem> sealItems3 = new ArrayList<>();

        // TYPE 1212
        sealItems1.add(new SealItem(1,
                "1212",
                "pb-2p-011212",
                "1212",
                "pb-2p-0101212",
                0,
                0,"234324qq")
        );

//        sealItems1.add(new MFMSeal.SealItem(1,
//                "1212",
//                "pb-2p-01",
//                "1212",
//                "pb-2p-01",
//                0,
//                0,"234324qq")
//        );

        // TYPE 2121
        sealItems2.add(new SealItem(2,
                "2121",
                "pb-2p-01",
                "2121",
                "pb-2p-01",
                0,
                0,"pb-2p-01123123123123123123123123123")
        );
//        sealItems2.add(new MFMSeal.SealItem(2,
//                "2121",
//                "pb-2p-01",
//                "2121",
//                "pb-2p-01",
//                0,
//                0,"pb-2p-1")
//        );
        sealItems2.add(new SealItem(3,
                "2121",
                "333",
                "2121",
                "3333",
                1,
                1,"3333")
        );


        // TYPE 3333
        sealItems3.add(new SealItem(4,
                "3333",
                "111",
                "3333333333444444444444",
                "2121",
                1,
                1,"2121")
        );

        sealItems3.add(new SealItem(5,
                "3333",
                "333",
                "3333333333444444444444",
                "3333",
                1,
                0,"3333")
        );

        sealItems3.add(new SealItem(6,
                "3333",
                "333",
                "3333333333444444444444",
                "3333",
                1,
                0,"3333")
        );
        sealItems3.add(new SealItem(7,
                "3333",
                "333",
                "3333333333444444444444",
                "3333",
                1,
                0,"3333")
        );
        sealItems3.add(new SealItem(8,
                "3333",
                "333",
                "3333333333444444444444",
                "3333",
                1,
                0,"3333")
        );
        sealItems3.add(new SealItem(9,
                "3333",
                "333",
                "3333333333444444444444",
                "3333",
                1,
                0,"3333")
        );
        sealItems3.add(new SealItem(10,
                "3333",
                "333",
                "3333333333444444444444",
                "3333",
                1,
                0,"3333")
        );
        sealItems3.add(new SealItem(11,
                "3333",
                "333",
                "3333333333444444444444",
                "3333",
                1,
                0,"3333")
        );
        sealItems3.add(new SealItem(12,
                "3333",
                "333",
                "3333333333444444444444",
                "3333",
                1,
                0,"3333")
        );
        sealItems3.add(new SealItem(13,
                "3333",
                "333",
                "3333333333444444444444",
                "3333",
                1,
                0,"3333")
        );
        sealItems3.add(new SealItem(14,
                "3333",
                "333",
                "3333333333444444444444",
                "3333",
                1,
                0,"3333")
        );
        sealItems3.add(new SealItem(15,
                "3333",
                "333",
                "3333333333444444444444",
                "3333",
                1,
                0,"3333")
        );

        sealItems3.add(new SealItem(16,
                "3333",
                "333",
                "3333333333444444444444",
                "3333",
                1,
                0,"3333")
        );

        sealItems3.add(new SealItem(17,
                "3333",
                "333",
                "3333333333444444444444",
                "3333",
                1,
                0,"3333")
        );

        sealItems3.add(new SealItem(18,
                "3333",
                "333",
                "3333333333444444444444",
                "3333",
                1,
                0,"3333")
        );

        sealItems3.add(new SealItem(19,
                "3333",
                "333",
                "3333333333444444444444",
                "3333",
                1,
                0,"3333")
        );
        sealItems3.add(new SealItem(20,
                "3333",
                "333",
                "3333333333444444444444",
                "3333",
                1,
                0,"3333")
        );
        sealItems3.add(new SealItem(21,
                "3333",
                "333",
                "3333333333444444444444",
                "3333",
                1,
                0,"3333")
        );
        sealItems3.add(new SealItem(22,
                "3333",
                "333",
                "3333333333444444444444",
                "3333",
                1,
                0,"3333")
        );
        sealItems3.add(new SealItem(23,
                "3333",
                "333",
                "3333333333444444444444",
                "3333",
                1,
                0,"3333")
        );
        sealItems3.add(new SealItem(24,
                "3333",
                "333",
                "3333333333444444444444",
                "3333",
                1,
                0,"3333")
        );
        sealItems3.add(new SealItem(25,
                "3333",
                "333",
                "3333333333444444444444",
                "3333",
                1,
                0,"3333")
        );
        sealItems3.add(new SealItem(26,
                "3333",
                "333",
                "3333333333444444444444",
                "3333",
                1,
                0,"3333")
        );
        sealItems3.add(new SealItem(27,
                "3333",
                "333",
                "3333333333444444444444",
                "3333",
                1,
                0,"3333")
        );
        sealItems3.add(new SealItem(28,
                "3333",
                "333",
                "3333333333444444444444",
                "3333",
                1,
                0,"3333")
        );
        sealItems3.add(new SealItem(29,
                "3333",
                "333",
                "3333333333444444444444",
                "3333",
                1,
                0,"3333")
        );
        sealItems3.add(new SealItem(30,
                "3333",
                "333",
                "3333333333444444444444",
                "3333",
                1,
                0,"3333")
        );
        sealItems3.add(new SealItem(31,
                "3333",
                "333",
                "3333333333444444444444",
                "3333",
                1,
                0,"3333")
        );
        sealItems3.add(new SealItem(32,
                "3333",
                "333",
                "3333333333444444444444",
                "3333",
                1,
                0,"3333")
        );
        sealItems3.add(new SealItem(33,
                "3333",
                "333",
                "3333333333444444444444",
                "3333",
                1,
                0,"3333")
        );
        sealItems3.add(new SealItem(34,
                "3333",
                "333",
                "3333333333444444444444",
                "3333",
                1,
                0,"3333")
        );
        sealItems3.add(new SealItem(35,
                "3333",
                "333",
                "3333333333444444444444",
                "3333",
                1,
                0,"3333")
        );
        sealItems3.add(new SealItem(36,
                "3333",
                "333",
                "3333333333444444444444",
                "3333",
                1,
                0,"3333")
        );

        ArrayList<MainSealItem> mainSealItems = new ArrayList<>();
        MainSealItem item1 = new MainSealItem("1212", sealItems1);
        MainSealItem item2 = new MainSealItem("2121", sealItems2);
        MainSealItem item3 = new MainSealItem("3333333333444444444444", sealItems3);

        mainSealItems.add(item1);
        mainSealItems.add(item2);
        mainSealItems.add(item3);


        JRBeanCollectionDataSource ds2 = new JRBeanCollectionDataSource(mainSealItems);
        Map params = new HashMap();
        params.put("bunkerTanker","1");
        params.put("location","1");
        params.put("sealVerificationReportNumber","1");
        params.put("bunkerSBno","1");
        params.put("Date","1");
//        JRDesignStyle jrDesignStyle = new JRDesignStyle();
//        jrDesignStyle.setName("mystyle");
//        jrDesignStyle.setDefault(true);
//        jrDesignStyle.setPdfFontName("C:\\Users\\Bunkerchain\\IdeaProjects\\ReportTesting\\src\\main\\resources\\segoeui.ttf");
//        jrDesignStyle.setPdfEncoding("UTF-8");
//        jrDesignStyle.setPdfEmbedded(true);

        JasperPrint jprint =  JasperFillManager.fillReport(jreport, params, ds2);
//        jprint.setDefaultStyle(jrDesignStyle);\
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm");

        String fileName = String.format("src/main/resources/mfmseal_%s.pdf", LocalDateTime.now().format(formatter));

        JasperExportManager.exportReportToPdfFile(jprint, fileName);
//        JasperExportManager.exportReportToHtmlFile(jprint, "src/main/resources/table.html");


    }
}
