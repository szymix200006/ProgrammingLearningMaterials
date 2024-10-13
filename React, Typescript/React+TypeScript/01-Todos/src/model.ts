export default interface Todo {
    id: number;
    todo: string;
    isDone: boolean;
}

export type Actions =
     {type: "add"; payload: string }
    | {type: "remove"; payload: number }
    | {type: "done"; payload: number }
    | {type: "initialize"; payload: Todo[]}
    | {type: "edit"; payload: [number, string] };

// interface State {
//     todos: Todo[];
// }

export const TodoReducer = (state: Todo[], action: Actions): Todo[] => {
    switch(action.type) {
        case "add":
            return [
                ...state,
                {id: Date.now(), todo: action.payload, isDone: false}
            ]
        case "remove":
            return state.filter(todo => todo.id !== action.payload)
        case "done":
            return state.map(todo => todo.id === action.payload ? {...todo, isDone: true} : todo)
        case "initialize":
            return action.payload;
        case "edit":
            return state.map(todo => todo.id === action.payload[0] ? {...todo, todo: action.payload[1]} : todo)
        default:
            return state;
    }
} 

