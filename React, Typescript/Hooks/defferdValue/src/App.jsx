import { useState, useDeferredValue } from 'react'
import List from './List'

//using when we don't have control over the state that changes eg. some library
function App() {
  const [input, setInput] = useState('');

  function handleChange(e) {
    setInput(e.target.value);
  }

  return (
    <>
      <input type="text" value={input} onChange={setInput}/>
      <List input={input}/>
    </>
  )
}

export default App
