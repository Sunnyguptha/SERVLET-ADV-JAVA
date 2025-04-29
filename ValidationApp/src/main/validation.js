function validate()
{
	// read form inputs 
	var name=document.myform.t1.value;
	var age=document.myform.t2.value;
	document.myform.vflag.value="yes";
	
	if(name=="")
	{
		alert("Name is mandatory");
		document.myform.t1.focus();
		return false;
	}
	if(age=="")
	{
		alert("Age is mandatory");
		document.myform.t2.focus();
		return false;
	}
	else
	{
		if(isNaN(age))
		{
			alert("Age must be numeric");
			document.myform.t2.value="";
			document.myform.t2.focus();
			return false;
		}
	}
	return true;
}
