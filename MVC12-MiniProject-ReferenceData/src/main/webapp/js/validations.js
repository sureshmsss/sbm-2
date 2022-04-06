function validation(form) {
	//empty the error messages
	document.getElementById("pnameErr").innerHTML = "";
	document.getElementById("priceErr").innerHTML = "";
	document.getElementById("qtyErr").innerHTML = "";
	//read form data
	let pname = form.pname.value;
	let price = form.price.value;
	let qty = form.qty.value;
	let flag = true;
	form.vflag.value = "yes";


	//form validations (client side)
	if (pname == "") {//pname required
		alert("1");
		document.getElementById("pnameErr").innerHTML = "please enter pname(CS)";
		flag = false;
	} else if (pname.length > 10) {//pname max length rule
		document.getElementById("pnameErr").innerHTML = "please enter pname not greater than 10 letters(CS)";
		flag = false;
		alert("1");
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
		alert("1");
	} else if (isNan(qty)) {//must be number
		document.getElementById("qtyErr").innerHTM = "please enter a number(CS)";
		flag = false;
	} else if (qty <= 2) {
		document.getElementById("qtyErr").innerHTML = "please order minimum two units(CS)";
		flag = false;
	}
	return flag;
}
