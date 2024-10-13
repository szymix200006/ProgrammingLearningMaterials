 const http = require('http');

 const server = http.createServer((request, response) => {
    console.log(request.url)
     response.writeHead(200, {'Content-Type': 'text/plain'});
     response.end('hello world');
 });

 console.log('port 3000')
 server.listen(3000, '192.168.0.23')