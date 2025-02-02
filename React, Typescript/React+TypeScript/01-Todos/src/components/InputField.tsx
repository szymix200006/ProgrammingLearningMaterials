import { useRef } from 'react';
import './styles.css'

interface Props {
    todo: string | undefined;
    setTodo: React.Dispatch<React.SetStateAction<string | undefined>>;
    handleAdd: (e: React.FormEvent) => void;
}

export default function InputField({todo, setTodo, handleAdd}: Props) {
  const inputRef = useRef<HTMLInputElement>(null);

  return (
    <form className='input' onSubmit={e => {
        handleAdd(e);
        inputRef.current?.blur();
      }}>
      <input type="text" placeholder='Enter a task' className='input-box' value={todo} onChange={e => setTodo(e.target.value)} ref={inputRef}/>
      <button className='input-submit' type='submit'>Go</button>
    </form>
  )
}
