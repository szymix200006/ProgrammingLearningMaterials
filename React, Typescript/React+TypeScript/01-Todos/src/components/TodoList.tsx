import { Droppable } from 'react-beautiful-dnd';
import Todo, { Actions } from '../model'
import SingleTodo from './SingleTodo';
import './styles.css'

interface Props {
    todos: Todo[];
    setTodos:  React.Dispatch<Actions>;
    completedTodos: Todo[];
    setCompletedTodos: React.Dispatch<Actions>;
}

export default function TodoList({todos, setTodos, completedTodos, setCompletedTodos}: Props) {
  return (
    <div className="container">
        <Droppable droppableId='TodosList'>
            {(provided, snapshot) => (
                <div className={`todos ${snapshot.isDraggingOver ? 'dragactive' : ''}`} ref={provided.innerRef} {...provided.droppableProps}>
                    <span className="todos-heading">
                        Active Tasks
                    </span>
                    {
                        todos.map((todo, index) => (
                            <SingleTodo index={index} todo={todo} key={todo.id} setTodos={setTodos}/>
                            ))
                        }
                {provided.placeholder}
                </div>
            )}
        </Droppable>
        <Droppable droppableId='TodosRemove'>
            {(provided, snapshot) => (
                <div className={`todos remove ${snapshot.isDraggingOver ? 'dragcomplete' : ''}`} ref={provided.innerRef} {...provided.droppableProps}>
                    <span className="todos-heading">
                        Completed Tasks
                    </span>
                    {
                        completedTodos.map((todo, index) => (
                            <SingleTodo index={index} todo={todo} key={todo.id} setTodos={setCompletedTodos}/>
                            ))
                        }
                {provided.placeholder}
                </div>
            )}
        </Droppable>
    </div>
  )
}
