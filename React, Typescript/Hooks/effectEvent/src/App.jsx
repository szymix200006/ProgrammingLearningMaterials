import { useState } from 'react'
import Page from './Page'

//gdy uzywamy useEffect i chcemy uzyc wielu zmiennych ale nie wszystkie maja byc dependencjami w tablicy a zmienne w useEffectEvent beda zawsze up to date
function App() {

  return (
    <>
      <Page/>
    </>
  )
}

export default App
