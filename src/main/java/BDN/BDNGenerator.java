package BDN;
import MFMSeal.MainSealItem;
import MFMSeal.SealItem;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class BDNGenerator {
    public void start() throws JRException{
//        String xmlFile = "src/main/resources/BunkerDeliveryNote.jasper";
        String xmlFile = "src/main/resources/BunkerDeliveryNote.jrxml";
        JasperReport jreport = JasperCompileManager.compileReport(xmlFile);


//        JRBeanCollectionDataSource ds2 = new JRBeanCollectionDataSource();
        Map params = new HashMap();
        params.put("bunkerTanker","1");
        params.put("location","1");
        params.put("sealVerificationReportNumber","1");
        params.put("bunkerSBno","1");
        params.put("Date","1");
        params.put("sulphurContentLimit","4");
        params.put("limitValue","4");
        params.put("isNoteOfProtestIssue","YES");
        params.put("remark","Vessel Has 2 Parcel, therefore cheif engineer request for our parcel to comeback after completion of first parcel. Please take note as it is very important");
//        JRDesignStyle jrDesignStyle = new JRDesignStyle();
//        jrDesignStyle.setName("mystyle");
//        jrDesignStyle.setDefault(true);
//        jrDesignStyle.setPdfFontName("C:\\Users\\Bunkerchain\\IdeaProjects\\ReportTesting\\src\\main\\resources\\segoeui.ttf");
//        jrDesignStyle.setPdfEncoding("UTF-8");
//        jrDesignStyle.setPdfEmbedded(true);

        JasperPrint jprint =  JasperFillManager.fillReport(jreport, params,  new JREmptyDataSource());

//        jprint.setDefaultStyle(jrDesignStyle);\
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm");

        String fileName = String.format("src/main/resources/BDN_%s.pdf", LocalDateTime.now().format(formatter));

        JasperExportManager.exportReportToPdfFile(jprint, fileName);
//        JasperExportManager.exportReportToHtmlFile(jprint, "src/main/resources/table.html");


    }

}
