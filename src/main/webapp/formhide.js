let selector=document.querySelector("#formselector")
let forms=document.querySelectorAll(".form")

selector.addEventListener("change",()=>{
	let formselectorvalue=selector.value
	console.log(formselectorvalue)
	forms.forEach(val =>{

		if(val.id===formselectorvalue){
			val.style.display="block"
		}
		else{
			val.style.display="none"
		}

	})
})
