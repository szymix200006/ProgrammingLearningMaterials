const CodeExample = () => {
  const [value, setValue] = useState(0);

  const sayHello = () => {
    console.log('Hello');
  }

  return (
    <div>
      <h1>{value}</h1>
      <button onClick={() => {setValue(value++)}}>Click me</button>
    </div>
  )
}

function App() {
  return (
    <>
      <h1>Backroads App</h1>
      <CodeExample />
    </>
  );
}

export default App


