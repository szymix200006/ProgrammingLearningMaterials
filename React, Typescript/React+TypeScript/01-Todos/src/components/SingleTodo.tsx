import { MdDone } from 'react-icons/md';
import Todo, { Actions } from '../model';
import './styles.css'
import { AiFillDelete, AiFillEdit } from 'react-icons/ai'
import { useEffect, useRef, useState } from 'react';
import { Draggable } from 'react-beautiful-dnd';

interface Props {
    todo: Todo;
    setTodos:  React.Dispatch<Actions>;
    index: number;
}

export default function SingleTodo({todo, setTodos, index}: Props) {

    const [edit, setEdit] = useState<boolean>(false);
    const [editTodo, setEditTodo] = useState<string>(todo.todo);
    const inputRef = useRef<HTMLInputElement>(null);

    const handleDone = (todoId: number): void => {
        // setTodos(todos.map(todo => todo.id === todoId ? {...todo, isDone: !todo.isDone} : todo))
        setTodos({type: "done", payload: todoId})
    }

    const handleDelete = (todoId: number): void => {
        //setTodos(todos.filter(todo => todo.id !== todoId));
        setTodos({type: "remove", payload: todoId})
    }

    const handleFill = (todoIsDone: boolean) => {
        if(!edit && !todoIsDone) {
            setEdit(!edit);
        }
    }

    const handleEdit = (e: React.FormEvent, todoId: number) => {
        e.preventDefault();

        // setTodos(todos.map(todo => (
        //     todo.id === todoId ? {...todo, todo: editTodo} : todo
        // )))
        setTodos({type: "edit", payload: [todoId, editTodo]})
        setEdit(false);
    }

    useEffect(() => {
        inputRef.current?.focus();
    }, [edit]);

  return (
    <Draggable draggableId={todo.id.toString()} index={index}>
       {(provided) => ( 
        <form className='todos-single' onSubmit={e => handleEdit(e, todo.id)} {...provided.draggableProps} {...provided.dragHandleProps} ref={provided.innerRef}>
                {
                    edit ? (
                        <input value={editTodo} onChange={e => setEditTodo(e.target.value)} className='todos-single-text' ref={inputRef}/> 
                        ) : todo.isDone ? (
                            <s className="todos-single-text">
                        {todo.todo}
                    </s>
                ) : (
                    <span className="todos-single-text">
                        {todo.todo}
                    </span>
                )
            }
            <div>
                <span className="icon" onClick = {() => handleFill(todo.isDone)}>
                    <AiFillEdit />
                </span>
                <span className="icon" onClick={() => handleDelete(todo.id)}>
                    <AiFillDelete />
                </span>
                <span className="icon" onClick={() => handleDone(todo.id)}>
                    <MdDone />
                </span>
            </div>
            </form>
        )}
    </Draggable>
  )
}
