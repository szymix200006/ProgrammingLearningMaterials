import {useContext} from 'react'
import { useTheme, useThemeUpdate } from './ThemeContext';

export default function FunctionContextComponent() {
    const darkTheme = useTheme();
    const toggleTheme = useThemeUpdate();

    return (
       <>
       <button onClick={toggleTheme}>Toggle theme</button>
        <div>Function theme</div>
        </> 
    )
}