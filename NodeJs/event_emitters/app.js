//console.log(__dirname)
//console.log(__filename)

//const {user, id, email} = require('./helper');

//console.log(user("Alex"));
//console.log(id(1));
//console.log(email("alex@gmail.com"));

const events = require('events');
const util = require('util');

const teams = function(name) {
    this.name = name;
}

util.inherits(teams, events.EventEmitter);

const Arsenal = new teams('Arsenal')
const Juventus = new teams('Juventus')
const Barcelona = new teams('Barcelona')

const teamArray = [Arsenal, Juventus, Barcelona];

teamArray.forEach((team) => {
    team.on('nation', function(nation) {
        console.log(team.name + ' is ' + nation + ' football club')
    })
})

Arsenal.emit('nation', 'English');
Juventus.emit('nation', 'Italian');
Barcelona.emit('nation', 'Spanish');




//const myEmitter = new events.EventEmitter;

//myEmitter.on('test', function(arg) {
//    console.log(arg);
//})

//myEmitter.emit('test', 'hello world');