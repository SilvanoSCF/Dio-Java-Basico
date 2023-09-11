let numero = parseInt(Math.random() * 10)+1;
let entrada = -1;
while (entrada != numero){
    entrada = prompt("entre com um numero");
    if (entrada != numero) 
        alert("Você errou");
}
 alert("Agora Sim, o numero é: " + numero)  


 


 
