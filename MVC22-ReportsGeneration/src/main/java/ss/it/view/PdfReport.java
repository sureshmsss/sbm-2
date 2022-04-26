package ss.it.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;

import ss.it.model.Employee;

@Component("pdf_report")
public class PdfReport extends AbstractPdfView {
	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// get model attributes data
		List<Employee> list = (List<Employee>) map.get("empsList");

		// add paragraph
		Paragraph para = new Paragraph("Employee Report", new Font(Font.TIMES_ROMAN, Font.DEFAULTSIZE, Font.BOLD));
		document.add(para);

		// add table content
		Table table = new Table(5, ((ArrayList) list).size());

		// add column names
		table.addCell("empno");
		table.addCell("empname");
		table.addCell("job");
		table.addCell("sal");
		table.addCell("deptNo");
		
		//get the values from db table
		for (Employee emp : list) {
			table.addCell(String.valueOf(emp.getEmpno()));
			table.addCell(String.valueOf(emp.getEname()));
			table.addCell(String.valueOf(emp.getJob()));
			table.addCell(String.valueOf(emp.getSal()));
			if (emp.getDeptNo() != null)
				table.addCell(String.valueOf(emp.getDeptNo()));
			else
				table.addCell("=====");
		}
		document.add(table);
	}
}
