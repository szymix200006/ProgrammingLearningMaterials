const http = require('http');
const fs = require('fs');

const server = http.createServer((request, response) => {
    response.writeHead(200, {'Conent-Type': 'text/html'});

    const readStream = fs.createReadStream(__dirname + '/index.html', 'utf-8');
    //const writeStream = fs.createWriteStream(__dirname + '/write-me.txt');

/*readStream.on('data', (chunk) => {
    console.log('new data recived');
    console.log(chunk);
    writeStream.write(chunk);
});*/

    readStream.pipe(response);
});

server.listen(3000, '192.168.0.23');