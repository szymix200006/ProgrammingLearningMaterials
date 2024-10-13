const hslValue = document.querySelector("#hsl-number");
const button = document.querySelector("#generate-hsl");
const fields = document.querySelectorAll('td');

button.addEventListener('click', () => {
    console.log(hslValue)
    let hslPercentage = 100;
    fields.forEach(field => {
        field.style.backgroundColor = `hsl(${hslValue.value}, ${hslPercentage}%, 50%)`;
        hslPercentage -= 20;
    });
});