import Algorithm.Sort

printList :: Show a => [a] -> IO()
printList [] = error "Cannot print list that is empty"
printList [x] = print x
printList (x:xs) = do
    print x
    printList xs

main :: IO ()
main = do
    return ()