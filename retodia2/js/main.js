// formulario
// Hacer visible el valor del slider monthly_fees

var monthly_fees =document.getElementById("monthly_fees");
var output_monthly = document.getElementById("monthly_range");
output_monthly.innerHTML = monthly_fees.value; 

monthly_fees.oninput =function(){
    output_monthly.innerHTML = this.value;
}
// Hacer visible el valor del slider interests
var interests = document.getElementById("interests");
var output_interests = document.getElementById("interests_range");
output_interests.innerHTML = interests.value;

interests.oninput = function(){
    output_interests.innerHTML = this.value;
}
// Calculadora

function calculator(){
    let debt = (document.querySelector("input[name=amount]").value);
    let monthly = (document.querySelector("input[name= monthly_fees]").value);
    let interests= (document.querySelector("input[name=interests]").value);
    const result = document.getElementById("result");

    // calculos

    //TODO
}

