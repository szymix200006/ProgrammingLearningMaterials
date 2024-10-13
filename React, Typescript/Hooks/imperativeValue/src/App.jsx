import { useState, useRef } from 'react'

//Kiedy chcemy zrobic takiego customowego refa lub chcemy uzyc kilku refuw w innym kpmponencie
function App() {
  const [value, setValue] = useState('red');
  const inputRef = useRef();

  return (
    <>
      <CustomInput
        ref={inputRef}
        value={value}
        onChange={e => setValue(e.target.value)}
      />
      <br />
      <button onClick={() => inputRef.current.alertHi()}>Focus</button>
    </>
  )
}

export default App
