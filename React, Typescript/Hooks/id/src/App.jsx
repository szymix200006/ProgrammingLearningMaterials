import { useState } from 'react'
import EmailForm from './EmailForm'

//wygeneruje takie samo id za kazdym razem
function App() {
  
  return (
    <>
      <EmailForm/>
      <article style={{marginBlock: "1rem"}}>
        Lorem, ipsum dolor sit amet consectetur adipisicing elit. Aut, recusandae eaque deserunt quasi mollitia est fugiat vel itaque consectetur tempora tempore veniam culpa doloremque illum cumque officia! Saepe, quos voluptatem!
      </article>
      <EmailForm/>
    </>
  )
}

export default App
