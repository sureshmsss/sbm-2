package ss.it.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Product {

	private Integer productId;
	private String productName;
	private String company;
	private Date dol;// = new Date(100, 00, 01);
	private Date dop;
	private boolean status;
}
