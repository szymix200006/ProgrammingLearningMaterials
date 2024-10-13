// var arr: string[][] = [["eee", "aaa"], ["aaa", "eee"]];

// //coordinate pair -> tuple
// const coord: [number, string] = [1, '2'];

// let direction: "north" | "east" | "south" | "west" = "north";

// enum Size {
//     Small,
//     Medium,
//     Large
// }

// var size: Size = Size.Small;

// enum Direction {
//     Up = "UP",
//     Down = "DOWN",
//     Left = "LEFT",
//     Right = "RIGHT"
// }

// enum Description {
//     SmallText = "this is some text to read",
//     MediumText = "this is some text but longer",
//     LongText = "this is some text but it is very very long"
// }

// console.log(Description.SmallText)

// let x: unknown = 1;
// if(typeof x === 'number') {
//     const result = x + 1;
// }

// const result1 = (x as number ) + 1; //(x as number[][])[0][1]

// //?.
// const arr2 = [{name: "tim"}, {name: "john"}, {name: "jane"}];
// const el = arr2.pop()?.name; //returning value or undefined
// const el2 = arr2.pop()!.name; //assuming that it is not undefined

// //functions
// function add(x: number, y: number): number{
//     return x + y;
// } 

// function makeName(firstName: string, lastName: string, middleName?: string): string {
//     if(middleName) return firstName + middleName + lastName;
//     return firstName + lastName;
// }

// const fullName = makeName('Robert', 'Lewandowski');

// function callFunc(func: (f: string, l:string, m?: string) => string, param1: string, param2: string) {
//     func(param1, param2);
// }

// callFunc(makeName, "Robert", "Lewandowski")

// function mul(x: number, y: number): number {
//     return x * y;
// }

// function div(x: number, y: number): number {
//     return x / y;
// }

// function applyFunc(funcs: ((x: number, y: number) => number)[], values: [number, number][]): number[] {
//     const results: number[] = [];
//     for(let i=0; i<funcs.length; i++) {
//         const args = values[i];
//         const result = funcs[i](...args);
//         results.push(result);
//     }

//     return results;
// }

// applyFunc([mul, div], [[1,2], [3,4]]);

// //advanced function types
// function sum(str: string, ...numbers: number[]) {

// }

// sum('a',1,2,3)
// sum('a')
// sum('a', 1,2)

// //overloaded functions
// function getItemLength(name: string): number;
// function getItemLength(names: string[]): number;
// function getItemLength(nameOrNames: unknown): number {
//     if (typeof nameOrNames == 'string') {
//         return nameOrNames.length;
//     } else if (Array.isArray(nameOrNames)) {
//         return nameOrNames.length;
//     }
//     return 0;
// }

// getItemLength("g");
// getItemLength(["", ""])

// //interfaces
// interface Person {
//     name: string;
//     age: number;
//     height?: number;
//     hello: () => void;
// }

// interface Employee extends Person {
//     employeeId: number;
// }

// interface Manager extends Employee, Person {
//     employees: Person[];
// }

// const person: Person = {
//     name: "tim",
//     age: 23,
//     hello: function () {
//         console.log(this.name + "says hi")
//     }
// }

// const worker: Employee = {
//     name: 'tim',
//     age: 34,
//     hello: () => {},
//     employeeId: 234234567
// }

// function getPerson(p: Person): Person {
//     return {
//         name: 'tim',
//         age: 23,
//         hello: () => {}
//     }
// }

// //Classes
// class Man {
//     protected name: string; //private, public, protected - ta klasa i te ktore extenduja te klase maja dostep do tego pola
//     constructor(name: string) {
//         this.name = name;
//     }
//     private greet() {
//         console.log(`Hello my name is ${this.name}`);
//     }
//     getName() {
//         return this.name;
//     }
//     setName(name: string) {
//         if(name.length < 5) return;
//         this.name = name;
//     }
// }

// class HappyMan extends Man {
//     callMe() {
//         console.log(this.name)
//     }
// }

// const m1 = new Man('Timmy');
// m1.getName();

// const hm1 = new HappyMan('Tommy');
// hm1.callMe();

// //Abstract Class
// abstract class Animal {
//     abstract makeSound(duration: number): void;

//     move(duration: number) {
//         console.log('move, move');
//         this.makeSound(duration);
//     }
// }

// class Dog extends Animal {
//     makeSound(duration: number) {
//         console.log('woof', 'woof')
//     }
// }

// class Cat extends Animal {
//     makeSound(duration: number) {
//         console.log('meow', 'meow')
//     }
// }

// const dog = new Dog();
// dog.move(10);

// const cat = new Cat();
// cat.move(5);

// interface BigAnimal {
//     speak(): void;
// }

// class BigDog implements BigAnimal {
//     private name: string;
//     private color: string;

//     constructor(name: string, color: string) {
//         this.name = name;
//         this.color = color;
//     }

//     speak() {
//         console.log(this.name, this.color);
//     }

//     test() {
//         return 1;
//     }
// }

// class BigCat implements BigAnimal {
//     speak() {
//         console.log('meow');
//     }
// }

// const dog1: BigAnimal = new BigDog("Tim", "Brown");
// const cat1 = new BigCat();
// const animals: BigAnimal[] = [cat1, dog1];

// function makeSound(animal: BigAnimal) {
//     animal.speak();
// }

// makeSound(cat1);
// makeSound(dog1);

// //Static
// class Dawg {
//     static instanceCount: number = 0;
//     name: string;

//     constructor(name: string) {
//         this.name = name;
//         Dawg.instanceCount++;
//     }

//     static decreaseCount() {
//         this.instanceCount--;
//     }
// }

// const dawg = new Dawg('Lailo');
// const dawg2 = new Dawg("Lionel");

// console.log(Dawg.instanceCount)
// Dawg.decreaseCount();
// Dawg.decreaseCount();

// //Generics
// class DataStore<T> {
//     private items: T[] = [];

//     addItem(item: T): void {
//         this.items.push(item);
//     }

//     GetItem(index: number): T {
//         return this.items[index];
//     }

//     removeItem(index: number): void {
//         this.items.splice(index, 1);
//     }

//     getAllItems(): T[] {
//         return this.items;
//     }
// }

// interface User {
//     name: string;
//     id: number;
// }

// const data = new DataStore<User>();


// function getValue<K, V>(key: K, value1: V, value2: V): V {
//     if(key) {
//         return value1;
//     }
//     return value2;
// }

// const n1: number = 1;
// const n2: number = 2;
// getValue("hello", n1, n2);

// //Types
// type Coords = [number, number];
// type UserMan = {
//     name: string;
//     age: number
// }

// function compareTypes(p1: Coords, p2: Coords): Coords {
//     return [p1[0], p2[1]];
// }

// const coords: Coords[] = []
// //Union and Intersection -> |, &

// type StringOrNumber = string | number | boolean;
// function acceptVal(val: StringOrNumber) {

// }

// interface BusinessPartner {
//     name: string;
// }

// interface ContactDetails {
//     email: string;
//     phone: string;
// }

// type BusinessContact = BusinessPartner & ContactDetails;

// const contact: BusinessContact = {
//     name: 'tim',
//     email: 'tim@gmail.com',
//     phone: '555666777'
// }

// type ContactType = BusinessPartner | ContactDetails;
// function addContact(contact: ContactType) {
//     if("name" in contact) {
//         console.log(contact.name)
//     } else {
//         console.log(contact.email, contact.phone)
//     }
// }
// //Type Guards
// type StringOrNumber = string | number;

// function add1(value: StringOrNumber): StringOrNumber {
//     if (typeof value === 'number') {
//         return value + 1;
//     } else {
//         return value + '1';
//     }
// }

// class Dog {
//     firstName: string;
//     lastName: string;
//     constructor(firstName: string, lastName: string) {
//         this.firstName = firstName;
//         this.lastName = lastName;
//     }
// }

// class Cat {
//     firstName: string;
//     constructor(firstName: string) {
//         this.firstName = firstName;
//     }
// }

// function getName(animal: Cat | Dog) {
//     if (animal instanceof Cat) { //"lastname" in animal , isDog(animal) 
//         console.log(animal.firstName);
//     } else {
//         console.log(animal.firstName, animal.lastName);
//     }
// }

// function isDog(pet: Dog | Cat): pet is Dog {      //Custom TypeGuard
//     return (pet as Dog).lastName !== undefined;
// }
// //Discrimated Union
// interface Warning {
//     type: "warning";
//     msg: string;
// }

// interface Info {
//     type: "info";
//     text: string;
// }

// interface Success {
//     type: "success";
//     message: string;
// }

// type Log = Warning | Info | Success;

// function handleMsg(log: Log) {
//     switch(log.type) {
//         case "warning":
//             console.log(log.msg);
//             break;
//         case "info":
//             console.log(log.text);
//             break;
//         case "success":
//             console.log(log.message);
//             break;
//     }
// }
// //Utility types
// interface Todo {
//     title: string;
//     description: string;
// }

// const updateTodo = (todo: Partial<Todo>) => {
//     //Daje opcjonalne rzeczy z interface
// }

// const myTodo: Readonly<Todo> = {title: "Learn Typescript", description: "types and shit"}; //wszystkie property readonly, niezminialne


// interface PageInfo {
//     title: string;
// }

// const pages: Record<string, PageInfo> = {
//     home: {title: "Home"},
//     about: {title: "About"},
//     contact: {title: "Contact"}
// }; //key + value

// const pagesNumbers: Record<number, PageInfo> = {
//     0: {title: "Home"},
//     1: {title: "About"},
//     2: {title: "Contact"}
// };

// pages.home;

// interface Todo1 {
//     id: number;
//     title: string;
//     completed: boolean;
// }

// type TodoPreview = Pick<Todo1, "title" | "completed">; //chce zrobic nowy typ ktory ma takie atrybuty jak Todo ale je wybieram sam jakby

// const todo1: TodoPreview = {
//     title: "Clean room",
//     completed: false,
// }

// type TodoPreview2 = Omit<Todo1, "id">;//to samo co Pick tyle ze zrobi z wwszytskich oprocz tych ktore wybierzemy
// const todo2: TodoPreview = {
//     title: "Clean room",
//     completed: false,
// }

// //Modules
// import Anything, {add, sub} from './util';

// const result = add(1,2);
// console.log(Anything());
// //DOM
// const anchor = document.querySelector('a');
// const form = document.querySelector('.form-element') as HTMLFormElement;
// const type = document.querySelector('.type') as HTMLInputElement;
// const age = document.querySelector('.age') as HTMLInputElement;
// const agreement = document.querySelector('.agreement') as HTMLInputElement;

// console.log(anchor?.href);
// console.log(form.attributes);

// form.addEventListener('submit', (e: Event) => {
//     e.preventDefault();
//     console.log(type.value, age.valueAsNumber, agreement.checked);
// })

