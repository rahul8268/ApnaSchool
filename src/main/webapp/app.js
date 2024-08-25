const formselector = document.querySelector('.formselector');
const forms = document.querySelectorAll('.form');
formselector.addEventListener("change", () => {
    const selectedForm = formselector.value;
    forms.forEach(form => {
        if (form.id === selectedForm) {
            form.style.display = "block";
        } else {
            form.style.display = "none";

        }
    });
});






