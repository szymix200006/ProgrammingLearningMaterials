import React, { useContext } from 'react'
import { ThemeContext, useThemeContext } from './ThemeContext'

export default function Logo() {

    const {theme, setTheme} = useThemeContext();

  return (
    <div style={{
        backgroundColor: theme == "light" ? 'white' : 'black'
    }}>
      Logo
    </div>
  )
}
