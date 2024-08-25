let selector=document.querySelector('.formselector');

let form=document.querySelectorAll('.form');

selector.addEventListener("change",()=>{
	let formselcter=selector.value;
	form.forEach(forms=>{
		
		if(forms.id==formselector){
			 forms.style.display = "block";
		}else{
			 forms.style.display = "block";
		}
	});
	
	
});
let ved=selector.value

console.log(ved)