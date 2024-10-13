import {useEffect, experimental_useEffectEvent as useEffectEvent} from 'react'

export default function Page({url, loggingOptions}) {
  const onConnected = useEffectEvent((url) => {
    logConnection(`Connected to ${url}`, loggingOptions)
  })

  useEffect(() => {
    const room = connectToRoom(url)
    room.onConnected(() => {
        onConnected(url)
    })
     return () => {
        room.disconnect()
     }
  }, [url])

  return null
}

function logConnection(message, options) {}
function connectToRoom(url) {}

