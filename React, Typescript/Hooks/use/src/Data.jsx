import { use } from 'react'

export default function Data({url, shouldFetch}) {
    let data = "data"
   if (shouldFetch) { data = use(fetch(url).then(res => res.json()))}

  return <pre>{JSON.stringify(data, null, 2)}</pre>
  
}
