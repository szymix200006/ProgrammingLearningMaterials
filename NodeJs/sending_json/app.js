const fs = require('fs');
const http = require('http');

const server = http.createServer((request, response) => {
    const home = {
        content: 'homepage-content'
    };

    const person = {
        name: 'Alex',
        email: 'alex@example.test',
        job: 'designer'
    };

    const error = {
        type: 404,
        message: 'page not found'
    }

    if(request.url == '/home' || request.url == '/') {
        response.writeHead(200, {'Content-type': 'application/json'});
        response.end(JSON.stringify(home));
    }
    else if(request == '/person') {
        response.writeHead(200, {'Content-type': 'application/json'});
        response.end(JSON.stringify(person));
    }
    else {
        response.writeHead(404, {'Content-type': 'application/json'});
        response.end(JSON.stringify(error));
    }
});

server.listen(3000, '192.168.0.23');