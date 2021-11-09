// formulario
// Hacer visible el valor del slider monthly_fees

let monthly_fees =document.getElementById("monthly_fees");
let output_monthly = document.getElementById("monthly_range");
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

    // variables

    let debt = parseFloat(document.querySelector("input[name=amount]").value);
    let monthly = parseFloat(document.querySelector("input[name= monthly_fees]").value);
    let interests= parseFloat (document.querySelector("input[name=interests]").value);
    const result = document.getElementById("result");

    // calculos
    interests = interests/100;
    let interests_year = (debt * interests);
    debt += interests_year;
    console.log(debt);// BORRAR
    let cuota = (debt)/monthly; 

    // añadimos los resultados a id="result"
    document.getElementById("capital_total").innerHTML = debt;
    document.getElementById("interest_type").innerHTML = interests;
    document.getElementById("monthly_dues").innerHTML = monthly;
    document.getElementById("dues").innerHTML = cuota ;

    
    /*
    let j=1;
    for(let i = 0; i <= (monthly-1) ; i++){
        console.log ( j +" cuota : " +  cuota + "€");// BORRAR
        debt = debt - cuota;
        console.log(debt);// BORRAR
        j++
    }*/
}    
 


