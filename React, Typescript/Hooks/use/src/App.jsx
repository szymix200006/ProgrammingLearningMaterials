import { useState } from 'react'
import Data from './Data'

const URLS = {
  USERS: "https://jsonplaceholder.typicode.com/users",
  POSTS: "https://jsonplaceholder.typicode.com/posts",
  COMMENTS: "https://jsonplaceholder.typicode.com/comments",
}

function App() {
  const [url, setUrl] = useState(URLS.USERS)

  return (
    <>
      <div>
        <label htmlFor="users">Users</label>
        <input type="radio" name="url" id="users" checked={url == URLS.USERS} onChange={() => setUrl(URLS.USERS)}/>
        <label htmlFor="posts">Posts</label>
        <input type="radio" name="url" id="posts" checked={url == URLS.POSTS} onChange={() => setUrl(URLS.POSTS)}/><br />
        <label htmlFor="comments">Comments</label>
        <input type="radio" name="url" id="comments" checked={url == URLS.COMMENTS} onChange={() => setUrl(URLS.COMMENTS)}/><br />
      </div>
      <ErrorBoundary fallback={<div>Error</div>}>
        <Suspense fallback={<div>Loading...</div>}>
          <Data url={url}/>
        </Suspense>
      </ErrorBoundary>
    </>
  )
}

export default App
