let sales: number = 125;
let course: string = "TypeScript";
let is_published: boolean = true;
let numbers: number[] = [1,2,3,4,5];

numbers.forEach(n => n.toFixed());

function render(document: any) {
    console.log(document);
}

//---------
let user: [number, string] = [1, 'Mosh']; 

//----------
const enum Size {Small = 0, Medium = 1, Large = 2}
let mySize: Size = Size.Medium;
console.log(mySize);

//--------
function calculateTax(income: number, taxYear: number = 2022): number {
    if (taxYear < 2022) {
        return income * 1.2;
    } 
    return income * 1.3;
}

let tax: number = calculateTax(10_000, 2020);
tax = calculateTax(10_000);

//------------
let employee: {
    readonly id: number,
    name?: string,
    retire: (date: Date) => void
} = {
    id: 1, 
    name: "Mosh",
    retire: (date: Date) => {
        console.log(date);
    }
}

//-----------------
type Employee = {
    readonly id: number,
    name?: string,
    retire: (date: Date) => void
}

let employee1: Employee = {id: 1, name: 'Josh', retire: (date: Date) => {
    console.log(date);
}}

function kgToLbs(weight: number|string): number {
    if(typeof weight === 'number') {
        return weight * 2.2;
    } else {
        return parseInt(weight) * 2.2;
    }
}

kgToLbs(10);
kgToLbs("10");

//------------
type Draggable = {
    drag: () => void
}

type Resizable = {
    resize: () => void
}

type UIWidget = Draggable & Resizable;

let textBox: UIWidget = {
    drag: () => {},
    resize: () => {}
}

//---------------
type Quantity = 50 | 100;
let quantity: Quantity = 50;

//------------
function greet(name: string | null | undefined) {
    if (name)
     console.log(name.toUpperCase());
    else
        console.log('Olaa!')
}

greet(null);

//---------------
type Customer = {
    birthday: Date
}

function getCustomer(id: number): Customer | null | undefined {
    return id === 0 ? null : {birthday: new Date()}
}

let customer = getCustomer(0);
console.log(customer?.birthday.getFullYear());
//customers?[0]

let log: any = (message: string): void => console.log(message);
log?.('a');

//-----
let name: string = 'Prish';
let age: number | string = 25;
let isStudent: boolean = false;
let hobbies: string[] = ['programing', 'football', 'gym'];
let role: [number, string] = [1, 'Coocker']
type Person = {name: string, age: number}
let person: Person = {name: 'Pablo', age: 20}

let lotOfPeople: Person[] = [person];

function printaName(name: string): void {
  console.log(name)
}

let personName: unknown;

interface Employee {
  name: string,
  age?: number
}

interface Guy extends Person {
  proffesion: string;
}

type X = {
  a: number;
  b: string;
}

type Y = X & {
  c: string;
  d: number;
}

let y: Y = {a: 10, b: 'ff', c: 'kok', d:10}
