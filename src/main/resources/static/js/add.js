function check() {
		/*var age = document.addForm.age.value;
		var name = document.addForm.name.value;
		var score = document.addForm.score.value;
		var stuClass = document.addForm.stuClass.value;

		if (age.match(/[^0-9]+/)) {
			alert("NO");
			return false;
		} else if (age.match(/[0-9]+/)) {

			return true;
		}

		if (name.match(/[0-9]+/)) {
			alert("NO");
			return false;
		} else if (name.match(/[^0-9]+/)) {

			return true;

		}
		if (score.match(/[^0-9]+/)) {
			alert("NO");
			return false;
			

		} else if(score < 0 || score > 100){
			  
				alert("NO");
				return false;
			
		}else{
			return true;
		}*/
		var isSubmit = true;
		var name = document.addForm.name.value;
		var age = document.addForm.age.value;
		var score = document.addForm.score.value;
		var address = document.addForm.address.value;
		var stuClass = document.addForm.stuClass.value;
		/*var nameError ='';
		var ageErorr= '';
		var scoreError ='';
		var addressError ='';
		var stuClassError ='';
		*/
		
		if(name == ''){
			document.getElementsByName("nameError")[0].innerText='*nameError.Please input student name';
			
			isSubmit = false;
		}else if(name.match(/[0-9]+/) || name.match(/[%&',;?$\x22]+/)){
			alert("Please input student name");
			return false;
		}
		
		if(name.match(/[^あ-んアーケー\s]/)){
			document.getElementsByName("nameError")[0].innerText='*nameError.Please input student name';
			alert("Please input student name");
			isSubmit = false;
		}
		
		if(age == ''){
			document.getElementsByName("ageError")[0].innerText='*ageError.Please input student age';
			isSubmit = false;
		}else if(age.match(/[^0-9]+/)){
			alert("Please input student age");
			return false;
		}
		if(score == ''){
			document.getElementsByName("scoreError")[0].innerText='*scoreError.Please input student score';
			isSubmit = false;
		}else if(score.match(/[^0-9]+/)){
			alert("scoreError");
			return false;	
		}else if(score < 0 || score > 100){
			alert("scoreError");
			return false;
		}
		if(address == ''){
			document.getElementsByName("addressError")[0].innerText='*addressError.Please input student address';
			isSubmit = false;
		}
		if(stuClass == ''){
			document.getElementsByName("stuClassError")[0].innerText='*stuClassError.Please input student stuClass';
			isSubmit = false;
		}
			return isSubmit;
	}