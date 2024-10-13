const images = document.querySelectorAll('section#left img');
const mainImage = document.querySelector('main img');
const heart = document.querySelector('#heart-image');

images.forEach(image => {
    image.addEventListener('click', () => {
        mainImage.src = image.src;
        console.log(mainImage.src)
    })
})

heart.addEventListener('click', () => {
    if(heart.src.includes('icon-off.png')) heart.src = 'icon-on.png';
    else heart.src = 'icon-off.png';
});