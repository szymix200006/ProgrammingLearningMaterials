import {useQuery, useMutation, useQueryClient} from '@tanstack/react-query';
import UseMemoT from './UseMemoT';


const App = () => {
  return (
    <div>
      <UseMemoT/>
    </div>
  )
}
/*const POSTS = [
  {id: 1, title: "Post 1"},
  {id: 1, title: "Post 2"}
]

// /posts -> ['posts']
// /posts/1 -> ['posts', post.id]
// /posts?authorId=1 -> ['posts', {authorId: 1}]
// /posts/2/comments -> ['posts', post.id, 'comments']

function App() {
  const queryClient = useQueryClient();
  const postsQuery = useQuery({
    queryKey: ["posts"],
    queryFn: () => wait(1000).then(() => [...POSTS]),
    staleTime: 5 * 60 * 1000,
    enabled: true,
    refetchInterval: 10000
  });

  const postMutation = useMutation({
    mutationFn: (variables) => {},
    onSuccess: (data) => {
      queryClient.setQueryData(["posts", data.id], data);
      queryClient.invalidateQueries(['posts'], {exact: true})
      setCurrentPage('chuj')
    }
  })

  if(postsQuery.isLoading) return <h1>Loading</h1>

  if(postsQuery.isError) return <pre>{JSON.stringify(postsQuery.error)}</pre>

  return <div>
    {postsQuery.data.map(post => (
      <div key={post.id}>{post.title}</div>
    ))}
    <button onClick={postMutation}>Create post</button>
  </div>
}

function wait(duration) {
  return new Promise(resolve => setTimeout(resolve, duration))
}*/

export default App
