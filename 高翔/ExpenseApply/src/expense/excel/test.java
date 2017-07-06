package expense.excel;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

import expense.model.Teacher;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFComment;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFPatriarch;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
public class test
{
    /**
     * @���ܣ��ֹ�����һ���򵥸�ʽ��Excel
     */
    private static List<Teacher> getTeacher() throws Exception
    {
        List list = new ArrayList();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");

        Teacher t1 = new Teacher("1","1","1","1","1",null,null);
        list.add(t1);


        return list;
    }

    public static void main(String[] args) throws Exception
    {
        // ��һ��������һ��webbook����Ӧһ��Excel�ļ�
        HSSFWorkbook wb = new HSSFWorkbook();
        // �ڶ�������webbook�����һ��sheet,��ӦExcel�ļ��е�sheet
        HSSFSheet sheet = wb.createSheet("��ʦ��һ");
        // ����������sheet����ӱ�ͷ��0��,ע���ϰ汾poi��Excel����������������short
        HSSFRow row = sheet.createRow((int) 0);
        // ���Ĳ���������Ԫ�񣬲�����ֵ��ͷ ���ñ�ͷ����
        HSSFCellStyle style = wb.createCellStyle();
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // ����һ�����и�ʽ

        HSSFCell cell = row.createCell((short) 0);
        cell.setCellValue("ѧ��");
        cell.setCellStyle(style);
        cell = row.createCell((short) 1);
        cell.setCellValue("����");
        cell.setCellStyle(style);
        cell = row.createCell((short) 2);
        cell.setCellValue("����");
        cell.setCellStyle(style);
        cell = row.createCell((short) 3);
        cell.setCellValue("����");
        cell.setCellStyle(style);

        // ���岽��д��ʵ������ ʵ��Ӧ������Щ���ݴ����ݿ�õ���
        List list = test.getTeacher();

        for (int i = 0; i < list.size(); i++)
        {
            row = sheet.createRow((int) i + 1);
            Teacher tea = (Teacher) list.get(i);
            // ���Ĳ���������Ԫ�񣬲�����ֵ
            row.createCell((short) 0).setCellValue((String) tea.gettId());
            row.createCell((short) 1).setCellValue(tea.gettName());
            row.createCell((short) 2).setCellValue((String) tea.gettPosition());
            cell = row.createCell((short) 3);

        }
        // �����������ļ��浽ָ��λ��
        try
        {
            FileOutputStream fout = new FileOutputStream("E:/students.xls");
            wb.write(fout);
            fout.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}