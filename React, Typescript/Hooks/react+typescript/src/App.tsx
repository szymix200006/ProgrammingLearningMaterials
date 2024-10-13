import { useState, useRef } from 'react'
import Button from './Button'
import Logo from './Logo';
import ThemeContextProvider from './ThemeContext';

type User = {
  name: string;
  age: number;
}

function App() {
  const [count, setCount] = useState(0);
  const [user, setUser] = useState<User | null>(null);
  const buttonRef = useRef<HTMLButtonElement>(null);

  const name = user?.name;

  const onClick = (test: number) => {
    return test;
  };

  return (
    <>
      <Button 
        setCount={setCount} 
        backgroundColor="red" 
        fontSize={10} 
        pillShape={true} 
        onClick={onClick}
        type="submit"
        autoFocus={true}
        onChange={(e: React.FormEvent<HTMLButtonElement>) => console.log('Clicked!')}
      >Click me!</Button>
      <ThemeContextProvider>
      <Logo/>
      </ThemeContextProvider>
    </>
  )
}

export default App
