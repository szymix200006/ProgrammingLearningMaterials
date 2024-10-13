import { useState, useEffect, useCallback, useDebugValue} from 'react'

export default function useLocalStorage(key, defaultValue) {
  const [value, setValue] = useState(() => {});
  useDebugValue(value, v => v)
  useEffect(() => {},[key, value, localStorage]);
  const remove = useCallback(() => {}, []);
  return [value, setValue, remove]
}
