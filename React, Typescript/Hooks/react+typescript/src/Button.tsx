import React, { ButtonHTMLAttributes, ComponentProps, useEffect } from 'react'
import { type Type } from './lib/types';

type Color = "red" | "blue" | "green";

type ButtonProps = React.ComponentPropsWithoutRef<"button"> & {
    backgroundColor : Color; 
    fontSize: number; 
    pillShape?: boolean;
    padding?: number[] | [number, number, number, number];
    onClick: (test: number) => number;
    children: React.ReactNode | JSX.Element;
    setCount: React.Dispatch<React.SetStateAction<number>>;
    //type: Type;
    //autoFocus?: boolean;
}

interface IButtonProps {
    backgroundColor : Color; 
    fontSize: number; 
    pillShape?: boolean;
    padding?: number[] | [number, number, number, number];
    onClick: (test: number) => number;
    children: React.ReactNode | JSX.Element;
    setCount: React.Dispatch<React.SetStateAction<number>>;
}

type StyleProps = {
    style: React.CSSProperties;
}

type BorderProps = {
    borderRadius: Record<string, number>;
}

const buttonTextOptions = [
    "Click me!",
    "Click me again!",
    "Click me one more time!"
] as const;

type User = {
    sessionId: string;
    name: string;
}

type Guest = Omit<User, 'name'>;

type ButtonColor = "red" | "green" | "blue";

type PropsT<T> =  {
    count: T;
    countHistory: T[];
}

const convertToArray = <T,>(value: T): T[] => {
    return [value];
}

convertToArray(5);
convertToArray("Hello");

export default function Button(
    {
        backgroundColor, 
        fontSize, 
        pillShape, 
        padding, 
        onClick, 
        children, 
        setCount,
        type,
        autoFocus,
        ...rest
    } : ButtonProps) {

    useEffect(() => {
        const previousButtonColor = localStorage.getItem("buttonColor") as ButtonColor;
    }, []);  
    
    useEffect(() => {
        fetch("https://jsonplaceholder.typicode.com/todos/1")
            .then(res => res.json())
            .then((data: unknown) => {
                //run it throught Zod
                //const todo = todoSchema.parse(data);

                //do something with the data
            })
    }, []);
    
  return (
    <button {...rest} autoFocus={autoFocus} type={type} onClick={() => {onClick(5); setCount(1)}} style={
        {
            backgroundColor: backgroundColor, 
            fontSize: fontSize, 
            borderRadius: pillShape ? "20px" : undefined,
            padding: `${padding == undefined ? 0 :padding[0]}px`
        }}>
        {children}
        {buttonTextOptions.map(option => {
            return option;
        })}
    </button>
  )
}
