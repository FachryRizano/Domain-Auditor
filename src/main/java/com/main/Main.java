package com.main;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        try{
        FileInputStream fis = new FileInputStream("list_domain.xlsx");
        XSSFWorkbook xw = new XSSFWorkbook(fis);
        XSSFSheet sheet = xw.getSheetAt(0);
        Iterator<Row> itr = sheet.iterator();
        int i=0;
        while (itr.hasNext()) {
            i++;
            List<Domain> domains = new ArrayList<>();
            String domainName = sheet.getRow(i).getCell(0).getStringCellValue();
            double pageAuthority = sheet.getRow(i).getCell(1).getNumericCellValue();
            double domainAuthority = sheet.getRow(i).getCell(2).getNumericCellValue();
            double spamScore = sheet.getRow(i).getCell(8).getNumericCellValue();
            double trustFlow = sheet.getRow(i).getCell(9).getNumericCellValue();
            double citationFlow = sheet.getRow(i).getCell(10).getNumericCellValue();
            boolean isNull = spamScore == 0;
            if (pageAuthority >= 20 && domainAuthority >= 20 && spamScore <= 25 && trustFlow >= 15 && citationFlow >= 15) {
                domains.add(new Domain(domainName,pageAuthority,domainAuthority,spamScore,trustFlow,citationFlow));
            }
            for (Domain domain:domains) {
                System.out.println(domain.getDomainName());
            }
        }
        }catch(NullPointerException e){
            System.err.println(e);
            return;
        }

    }
}