function validation(frm) {
	//empty the error messages
	document.getElementById("pnameErr").innerHTML = "";
	document.getElementById("priceErr").innerHTML = "";
	document.getElementById("qtyErr").innerHTML = "";
	//read form data
	let pname = frm.pname.value;
	let price = frm.price.value;
	let qty = frm.qty.value;
	let flag = true;
	

	//form validations (client side)
	if (pname == "") {//pname required
		document.getElementById("pnameErr").innerHTML = "please enter pname(CS)";
		flag = false;
	} else if (pname.length > 10) {//pname max length rule
		document.getElementById("pnameErr").innerHTML = "please enter pname not greater than 10 letters(CS)";
		flag = false;
		
	}
	if (price == "") {//price must enter
		document.getElementById("priceErr").innerHTML = "please enter price(CS)";
		flag = false;
	} else if (isNan(price)) {//price must be a number
		document.getElementById("priceErr").innerHTML = "please enter a number(CS)";
		flag = false;
	}
	if (qty == "") {//qty rule must enter
		document.getElementById("qtyErr").innerHTML = "please enter qty(CS)";
		flag = false;
	
	} else if (isNan(qty)) {//must be number
		document.getElementById("qtyErr").innerHTM = "please enter a number(CS)";
		flag = false;
	} else if (qty <= 2) {
		document.getElementById("qtyErr").innerHTML = "please order minimum two units(CS)";
		flag = false;
	}
	//change vflag value to "yes" indicating client side form validations are done
	frm.vflag.value = "yes";

	return flag;
}
