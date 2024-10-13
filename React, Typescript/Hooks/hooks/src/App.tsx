import React, {useState, useEffect, useContext, useRef, useReducer} from 'react';
import { ThemeProvider } from './ThemeContext';

export const ACTIONS = {
  ADD_TODO: 'add-todo',
  TOOGLE_TODO: 'toggle-todo',
  DELETE_TODO: 'delete-todo'
}

function App() {

  const [name, setName] = useState('');
  const inputRef = useRef();
  const prevName = useRef('');

  const setFocus = () => {
    inputRef.current.focus();
  }

  useEffect(()=>{
    prevName.current = name;
  },[name])

  //reducer
  function reducer(todos, action) {
   switch(action.type) {
    case ACTIONS.ADD_TODO: return [...todos, newTodo(action.payload.name)];
    case ACTIONS.TOOGLE_TODO: return todos.map(todo => {
      if(todo.id === action.payload.id) {
        return {...todo, completed: !todo.completed}
      } else return todo;
    });
    case ACTIONS.DELETE_TODO: return todos.filter(todo => todo.id !== action.payload.id);
    default: return todos;
   }
  }

  function newTodo(name) {
    return {id: Date.now(), name: name, completed: false}
  }

  const [todos, dispatch] = useReducer(reducer, []);
  const [name, setName] = useState('');
  //const [count, setCount] = useState(0);

  function handleSubmit(e) {
    e.preventDefault();
    dispatch({type: ACTIONS.ADD_TODO, payload: {name: name}});
    setName('');
  }

  return (
    <>
      <ThemeProvider>
        <FunctionContextComponent/>
        <input ref={inputRef} value={name}, onChange={e => setName(e.target.value)} />
        <div>My name is {name} and it used to be {prevName.current}</div>
       <button onClick={setFocus}>focus</button>


       <button onClick={increment}>+</button>
        <span>{count}</span>
       <button onClick={decrement}>-</button>

       <form onSubmit={handleTodo}>
        <input onChange={e => setName(e.target.value)} value={name} />
       </form>
       {todos.map(todo => {
        return <Todo key={todo.id} todo={todo} dispatch={dispatch}/>
       })}
      </ThemeProvider>
    </>
  )
}

export default App
