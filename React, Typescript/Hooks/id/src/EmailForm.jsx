import React, {useId} from 'react'

export default function EmailForm() {
    const id = useId();
    //wystarczy uzyc jedno, i zmienic, nie powinno sie uzywac 2 na raz
  return (
    <>
        <label htmlFor={`${id}email`}>Email</label>
        <input type="email" id={`${id}email`} />
        <br />
        <label htmlFor={`${id}name`}>Name</label>
        <input type="text" id={`${id}name`} />
    </>
  )
}
