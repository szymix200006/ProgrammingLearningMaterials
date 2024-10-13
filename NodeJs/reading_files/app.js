const fs = require('fs');

//const text = fs.readFileSync('readme.txt', 'utf-8');

//fs.writeFileSync('write.txt', text);

const text = fs.readFile('readme.txt', 'utf-8', function(error, data) {
    fs.writeFile('write.txt', data, function(error) {
        if (error) console.log(error)
    });
});

fs.unlink('write.txt', (error) => {
    console.log(error); 
})

