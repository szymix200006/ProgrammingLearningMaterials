import { useState } from 'react'

//do pokazywanie w developer tools przy hookach (tylko w custom hookach)
function App() {
  const [firstName, setFirstName] = useLocalStorage("firstName", "Kyle")
  const [lastName, setLastName] = useState("Cook");

  return (
    <>
      First: {" "}
      <input type="text" value={firstName} onChange={e => setFirstName(e.target.value)} />
      <br/>
      Last : {" "}
      <input type="text" value={lastName} onChange={e => setLastName(e.target.value)} />
    </>
  )
}

export default App
