import { useReducer, useState } from 'react'
import './App.css'
import InputField from './components/InputField'
import Todo, { TodoReducer } from './model';
import TodoList from './components/TodoList';
import { DragDropContext, DropResult } from 'react-beautiful-dnd';

const App:React.FC = () =>  {

  const [todo, setTodo] = useState<string | undefined>("");
  //const [todos, setTodos] = useState<Todo[]>([]);
  const [todos, dispatch] = useReducer(TodoReducer, []);
  const [completedTodos, completedDispatch] = useReducer(TodoReducer, []); 

  const handleAdd = (e: React.FormEvent) => {
    e.preventDefault();

    if(todo) {
      //setTodos([...todos, {id: Date.now(), todo: todo, isDone: false}]);
      dispatch({type: 'add', payload: todo})
      setTodo("");
    }
  }

  const onDragEnd = (result: DropResult) => {
    const {source, destination} = result;

    if(!destination) {
      return;
    }

    if(destination.droppableId === source.droppableId && destination.index === source.index) {
      return;
    }

    let add, active = todos, complete=  completedTodos;

    if(source.droppableId == 'TodosList') {
      add=active[source.index];
      active.splice(source.index, 1)
    } else {
      add = complete[source.index];
      complete.splice(source.index, 1)
    }

    if(destination.droppableId == 'TodosList') {
      active.splice(destination.index, 0, add);
    } else {
      complete.splice(destination.index, 0, add)
    }

    dispatch({type: "initialize", payload: complete})
    dispatch({type: "initialize", payload: active})
    

  }

  return (
    <DragDropContext onDragEnd={onDragEnd}>
      <div className="App">
        <span className="heading">Taskify</span>
        <InputField todo={todo} setTodo={setTodo} handleAdd={handleAdd}/>
        <TodoList todos={todos} setTodos={dispatch} completedTodos={completedTodos} setCompletedTodos={completedDispatch}/>
      </div>
    </DragDropContext>
  )
}

export default App
