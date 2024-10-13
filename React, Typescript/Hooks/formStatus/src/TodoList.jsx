import {FormEvent, useRef, useState} from 'react'
import {useFormStatus} from 'react-dom'

export default function TodoList({initialTodos}) {
    const [todos, setTodos] = useState(initialTodos)

    async function onSubmit(data) {
        

        const title = data.get("title")

        const newTodo = await createTodo(title)
        setTodos(prev => [...prev, newTodo])
    }

  return (
    <div>
      <form action={onSubmit}>
        <label>Title</label>
        <br />
        <input   name="title"required/>
        <br />
        <SubmitButton/>
      </form>
      <ul>
        {todos.map(todo => {
            <li key={todo.id}>{todo.title}</li>
        })}
      </ul>
    </div>
  )
}

function SubmitButton() {
    const data = useFormStatus();
    const isLoading = data.pending;
    return <button disabled={isLoading}>Create</button>
}

function createTodo(title) {
    return wait({id: crypto.randomUUID(), title}, 1000)
}

function wait(value, duration) {
    return new Promise(resolve => {
        setTimeout(() => resolve(value), duration)
    })
}