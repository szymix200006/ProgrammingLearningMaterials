const buttons = document.querySelectorAll('.color-button');
const font = document.querySelector('.font-color');
const fontSize = document.querySelector('.font-size');
const border = document.querySelector('.border');
const radios = document.querySelectorAll('input[name="list-style"]');
const rightSection = document.querySelector('#right');
const image = document.querySelector('#image');
const list = document.querySelector('#lista');

function changeBackground(color) {
    rightSection.style.backgroundColor = color;
}

function changeColor(color) {
    rightSection.style.color = color;
}

function changeFontSize(size) {
    rightSection.style.fontSize = size + "%";
}

function changeBorder(border) {
    if(!border) {
        image.style.border = 'none';
    } else {
        image.style.border = '1px solid white';
    }
}

function changeList(style) {
    list.style.listStyleType = style;
}

buttons.forEach(button => {
    button.addEventListener('click', () => {
        changeBackground(button.innerHTML);
    })
})

font.addEventListener('change', () => {
    changeColor(font.value);
});

fontSize.addEventListener('blur', () => {
    changeFontSize(fontSize.value);
})

border.addEventListener('change', () => {
    changeBorder(border.checked);
})

radios.forEach(radio => {
    radio.addEventListener('change', () => {
        changeList(radio.value);
    })
})
