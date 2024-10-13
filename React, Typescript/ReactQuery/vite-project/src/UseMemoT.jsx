import { useMemo, useState } from "react";
import { BIG_ARRAY } from "./constants";

const UseMemoT = () => {
    const [initialArray] = useState(BIG_ARRAY);
    const [count, setCount] = useState(0);

    //const selectedItem = useMemo(() => BIG_ARRAY.find(item => item.isSelected), [items]);
    const selectedItem = useMemo(() => initialArray.find(item => item.id === count), [initialArray, count]);

    const incrementCount = () => {
        setCount(prevCount => prevCount + 1)
    }

    return (
        <div>
            <div>Count: {count}</div>
            <div>Selected number: {selectedItem?.id}</div>
            <button onClick={incrementCount}>Increment</button>
        </div>
    )
}

export default UseMemoT;