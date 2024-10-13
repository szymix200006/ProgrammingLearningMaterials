const express = require('express');

const app = express();

app.set('view engine', 'ejs');

app.get('/', (request, response) => {
    response.sendFile(__dirname + "/index.html");
});

app.get('/about', (request, response) => {
    response.sendFile(__dirname + "/about.html");
});

app.get('/profile/:id', (request, response) => {
    const data = {age: 30, job: 'developer', friends: ['jane', 'sarah', 'william']}
    response.render('profile', {person: request.params.id, data});
});

app.listen(3000);