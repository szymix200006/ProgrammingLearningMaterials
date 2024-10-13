import { useLayoutEffect } from 'react';
import { useState } from 'react'

//when we need useEffect to change our DOM, runs synchronusly and useEffect runs assynchronusly only use when useEffect doesnot work
function App() {
  const [count, setCount] = useState(0);

  useLayoutEffect(() => {
    console.log(count)
  },[count]);

  return (
    <>
      <button onClick={() => setCount(c => c+1)}>Increment</button>
      <div>{count}</div>
    </>
  )
}

export default App
