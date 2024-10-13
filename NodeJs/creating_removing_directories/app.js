const fs = require('fs')

fs.mkdir('myFolder', () => {
    fs.readFile('readme.txt', 'utf-8', (error, data) => {
        fs.writeFile('./myFolder/write.txt', data, (error) => {
            if(error) console.log(error)
        })
    })
})

fs.unlink('./myFolder/write.txt', () => {
    fs.rmdir('myFolder', (error) => {
        if(error) console.log(error)
    })
})
//fs.rmdir('myFolder', (error) => {
//    if(error) console.log(error)
//})