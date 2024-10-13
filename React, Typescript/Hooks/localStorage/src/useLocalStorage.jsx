import {useState, useEffect} from 'react'

function getSavedValue(key, initiaValue) {
    const savedValue = JSON.parse(localStorage.getItem(key));
    if(savedValue) return savedValue
    if(initiaValue instanceof Function) return initialValue();
    return initiaValue
}

export default function useLocalStorage(key, initialValue) {
  const [value, setValue] = useState(() => {
    return getSavedValue(key, initialValue)
  });

  useEffect(() => {
    localStorage.setItem('key', JSON.stringify(value))
  }, [value]);



  return [value, setValue];
}
