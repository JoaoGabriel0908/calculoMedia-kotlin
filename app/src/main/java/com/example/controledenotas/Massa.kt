package com.example.controledenotas

fun situacaoImc(imc: Double): String {
    if (imc < 18.5) {
        return "Seu IMC é: ${imc}"
    } else if (imc < 25) {
        return "Seu IMC é: ${imc}"
    } else if(imc < 30){
        return "Seu IMC é: ${imc}"
    } else if(imc < 35){
        return "Seu IMC é: ${imc}"
    } else if(imc < 40){
        return "Seu IMC é: ${imc}"
    } else if(imc < 45){
        return "Seu IMC é: ${imc}"
    } else{
        return "Seu IMC é: ${imc}"
    }
}

fun calcularImc(peso: Double, altura: Double): Double {
    return peso / (altura * altura)
}